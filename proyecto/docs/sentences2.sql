-- ====================
-- DLL Clientes y Bitacora
-- ====================

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE CLIENTES_BIT CASCADE CONSTRAINTS ';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/

BEGIN
    EXECUTE IMMEDIATE 'DROP SEQUENCE SEQ_CLIENTE_ID';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/

BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE CLIENTES CASCADE CONSTRAINTS';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/

-- ====================
-- Funcion de obtener IP
-- ====================

CREATE  OR REPLACE FUNCTION FN_GET_IP
RETURN VARCHAR2
IS
BEGIN
    -- Intento de obtener IP del host que hace conexión
    RETURN NVL(SYS_CONTEXT('USERENV', 'IP_ADDRESS'), SYS_CONTEXT('USERENV', 'HOST'));
    EXCEPTION
        WHEN OTHERS THEN
            RETURN 'LOCALHOST';
END FN_GET_IP;

CREATE TABLE CLIENTES(
    ID_CLIENTE VARCHAR2(36) NOT NULL,
    NOMBRE VARCHAR2(40) NOT NULL,
    APATERNO VARCHAR2(40) NOT NULL,
    AMATERNO VARCHAR2(40),
    EMAIL VARCHAR2(100),
    FECHA_ALTA DATE DEFAULT SYSDATE,
    ESTADO NUMBER(1) NOT NULL,
    CONSTRAINT pk_id_cliente_clientes PRIMARY KEY (ID_CLIENTE)
);

COMMENT ON TABLE CLIENTES IS 'Tabla que contiene la información del cliente';
COMMENT ON COLUMN CLIENTES.ID_CLIENTE IS 'Llave primaria de la tabla Clientes';
COMMENT ON COLUMN CLIENTES.NOMBRE IS 'Nombre del Cliente';
COMMENT ON COLUMN CLIENTES.APATERNO IS 'Apellido Paterno del Cliente';
COMMENT ON COLUMN CLIENTES.AMATERNO IS 'Apellido Materno del Cliente';
COMMENT ON COLUMN CLIENTES.EMAIL IS 'Correo del Cliente';
COMMENT ON COLUMN CLIENTES.FECHA_ALTA IS 'Fecha de Alta del Cliente';
COMMENT ON COLUMN CLIENTES.ESTADO IS 'Bandera para borrado lógico';

CREATE SEQUENCE SEQ_CLIENTE_ID START WITH 1 INCREMENT BY 1 MINVALUE 1 NOCACHE NOCYCLE;

CREATE OR REPLACE TRIGGER TRG_CLIENTE_ID
BEFORE INSERT ON CLIENTES
FOR EACH ROW
BEGIN
    IF  :NEW.ID_CLIENTE IS NULL THEN
        :NEW.ID_CLIENTE := 'CLI-' || LPAD(SEQ_CLIENTE_ID.NEXTVAL, 6, '0');
    END IF;
END;

CREATE TABLE CLIENTES_BIT(
     ID_CLIENTE_BIT VARCHAR2(36) NOT NULL,
     ID_CLIENTE VARCHAR2(36) NOT NULL,
     NOMBRE VARCHAR2(40) NOT NULL,
     APATERNO VARCHAR2(40) NOT NULL,
     AMATERNO VARCHAR2(40),
     EMAIL VARCHAR2(100),
     FECHA_ALTA DATE DEFAULT SYSDATE,
     ESTADO NUMBER(1) NOT NULL,
     FECHA_CREACION DATE DEFAULT SYSDATE,
     FECHA_MODIFICACION DATE,
     ACCION VARCHAR2(10) NOT NULL,
     IP VARCHAR2(30) NOT NULL,
     CONSTRAINT pk_id_cliente_bit_clientes_bit PRIMARY KEY (ID_CLIENTE_BIT)
);

COMMENT ON TABLE CLIENTES_BIT IS 'Tabla que de Bitacora que contiene la información del cliente';
COMMENT ON COLUMN CLIENTES_BIT.ID_CLIENTE_BIT IS 'Llave primaria de la tabla Clientes_bit';
COMMENT ON COLUMN CLIENTES_BIT.ID_CLIENTE IS 'Llave foranea ID_CLIENTE que hace referencia a la tabla CLIENTES';
COMMENT ON COLUMN CLIENTES_BIT.NOMBRE IS 'Nombre del Cliente';
COMMENT ON COLUMN CLIENTES_BIT.APATERNO IS 'Apellido Paterno del Cliente';
COMMENT ON COLUMN CLIENTES_BIT.AMATERNO IS 'Apellido Materno del Cliente';
COMMENT ON COLUMN CLIENTES_BIT.EMAIL IS 'Correo del Cliente';
COMMENT ON COLUMN CLIENTES_BIT.FECHA_ALTA IS 'Fecha de Alta del Cliente';
COMMENT ON COLUMN CLIENTES_BIT.ESTADO IS 'Bandera para borrado lógico';
COMMENT ON COLUMN CLIENTES_BIT.FECHA_CREACION IS 'Campo de control que indica la Fecha de Creación en la BD';
COMMENT ON COLUMN CLIENTES_BIT.FECHA_MODIFICACION IS 'Campo de control que indica la Fecha de Modificacion en la BD';
COMMENT ON COLUMN CLIENTES_BIT.ACCION IS 'Campo de control que indica la Acción en el registro';
COMMENT ON COLUMN CLIENTES_BIT.IP IS 'Campo de control que indica IP de donde se solicito operación de registro';

-- ====================
-- Trigger Auditoria Clientes
-- ====================

CREATE OR REPLACE TRIGGER TRG_CLIENTES_AUD
AFTER INSERT OR UPDATE ON CLIENTES
FOR EACH ROW
DECLARE
    V_ACCION VARCHAR2(20);
    V_FECHA_CREACION DATE := NULL;
    V_FECHA_MODIFICACION DATE := NULL;
BEGIN

    -- INSERT
    IF INSERTING THEN
        V_ACCION := 'INSERT';
        V_FECHA_CREACION := SYSDATE;

    -- UPDATE
    ELSIF UPDATING THEN
        V_FECHA_MODIFICACION := SYSDATE;
        V_FECHA_CREACION := OLD.FECHA_ALTA;

        -- Detectar borrado logico
        IF :OLD.ESTADO = 1 AND :NEW.ESTADO = 0 THEN
            V_ACCION := 'DEACTIVATE';
        ELSIF :OLD.ESTADO = 0 AND :NEW.ESTADO = 1 THEN
            V_ACCION := 'ACTIVATE';
        ELSE:
            V_ACCION := 'UPDATE';
        END IF;
    END IF;

    INSERT INTO CLIENTES_BIT (
                              ID_CLIENTE_BIT,
                              ID_CLIENTE,
                              NOMBRE,
                              APATERNO,
                              AMATERNO,
                              EMAIL,
                              FECHA_ALTA,
                              ESTADO,
                              FECHA_CREACION,
                              FECHA_MODIFICACION,
                              ACCION,
                              IP
    )
    VALUES (
            SYS_GUID(),
            :NEW.ID_CLIENTE,
            :NEW.NOMBRE,
            :NEW.APATERNO,
            :NEW.AMATERNO,
            :NEW.EMAIL,
            :NEW.FECHA_ALTA,
            :NEW.ESTADO,
            V_FECHA_CREACION,
            V_FECHA_MODIFICACION,
            V_ACCION,
            FN_GET_IP
           );
END;
/

INSERT INTO CLIENTES (NOMBRE, APATERNO, AMATERNO, EMAIL, ESTADO)
VALUES ('JUAN', 'PEREZ', 'LOPEZ', 'juan.perez@mail.com',1);

INSERT INTO CLIENTES (NOMBRE, APATERNO, AMATERNO, EMAIL, ESTADO)
VALUES ('MARIA', 'GOMEZ', 'HERNANDEZ', 'maria.gomez@mail.com',1);

INSERT INTO CLIENTES (NOMBRE, APATERNO, AMATERNO, EMAIL, ESTADO)
VALUES ('CARLOS', 'RAMIREZ', NULL, 'carlos.reamirez@mail.com',1);

INSERT INTO CLIENTES (NOMBRE, APATERNO, AMATERNO, EMAIL, ESTADO)
VALUES ('ANA', 'TORRES', 'SANCHEZ', 'ana.torres@mail.com',1);

INSERT INTO CLIENTES (NOMBRE, APATERNO, AMATERNO, EMAIL, ESTADO)
VALUES ('LUIS', 'MARTINEZ', 'DIAZ', 'luis.martinez@mail.com',0);
COMMIT;

SELECT * FROM CLIENTES;

SELECT * FROM CLIENTES_BIT;