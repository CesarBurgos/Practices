CREATE TABLE CLIENTES (
    ID_CLIENTE VARCHAR2(25) PRIMARY KEY,
    NOMBRE VARCHAR2(100) NOT NULL,
    APATERNO VARCHAR2(100) NOT NULL,
    AMATERNO VARCHAR2(100),
    FECHA_ALTA DATE DEFAULT SYSDATE NOT NULL,
    ACTIVO NUMBER(1) CHECK (ACTIVO IN (1,2))
);

SELECT * FROM CLIENTES;

CREATE TABLE AUDITORIA (
   ID_AUDITORIA NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
   TABLA_AFECTADA VARCHAR2(200),
   ACCION VARCHAR2(200),
   USUARIO_BD VARCHAR2(200),
   FECHA_MOVIMIENTO DATE DEFAULT SYSDATE,
   ID_REGISTRO VARCHAR2(200),
   DATOS_ANTERIORES CLOB,
   DATOS_NUEVOS CLOB
);

CREATE OR REPLACE TRIGGER TRG_AUD_CLIENTES
    AFTER INSERT OR UPDATE OR DELETE ON CLIENTES
    FOR EACH ROW
BEGIN
    -- INSERT
    IF INSERTING THEN
        INSERT INTO AUDITORIA (
            TABLA_AFECTADA,
            ACCION,
            USUARIO_BD,
            ID_REGISTRO,
            DATOS_NUEVOS
        )
        VALUES (
                   'CLIENTES',
                   'INSERT',
                   USER,

                   :NEW.ID_CLIENTE,
                   'NOMBRE=' || :NEW.NOMBRE ||
                   ', APATERNO=' || :NEW.APATERNO ||
                   ', AMATERNO=' || :NEW.AMATERNO ||
                   ', ACTIVO=' || :NEW.ACTIVO ---- Concatenando el registro de los nuevos datos
               );
    END IF;

    -- UPDATE
    IF UPDATING THEN
        INSERT INTO AUDITORIA (
            TABLA_AFECTADA,
            ACCION,
            USUARIO_BD,
            ID_REGISTRO,
            DATOS_ANTERIORES,
            DATOS_NUEVOS
        )
        VALUES (
                   'CLIENTES',
                   'UPDATE',
                   USER,
                   :OLD.ID_CLIENTE,

                   'NOMBRE=' || :OLD.NOMBRE ||
                   ', APATERNO=' || :OLD.APATERNO ||
                   ', AMATERNO=' || :OLD.AMATERNO ||
                   ', ACTIVO=' || :OLD.ACTIVO, ---- Concatenando el registro de los viejos datos

                   'NOMBRE=' || :NEW.NOMBRE ||
                   ', APATERNO=' || :NEW.APATERNO ||
                   ', AMATERNO=' || :NEW.AMATERNO ||
                   ', ACTIVO=' || :NEW.ACTIVO ---- Concatenando el registro de los nuevos datos
               );
    END IF;

    -- DELETE
    IF DELETING THEN
        INSERT INTO AUDITORIA (
            TABLA_AFECTADA,
            ACCION,
            USUARIO_BD,
            ID_REGISTRO,
            DATOS_ANTERIORES
        )
        VALUES (
                   'CLIENTES',
                   'DELETE',
                   USER,
                   :OLD.ID_CLIENTE,

                   'NOMBRE=' || :OLD.NOMBRE ||
                   ', APATERNO=' || :OLD.APATERNO ||
                   ', AMATERNO=' || :OLD.AMATERNO ||
                   ', ACTIVO=' || :OLD.ACTIVO ---- Concatenando el registro de los viejos datos
               );

    END IF;

END;
/
