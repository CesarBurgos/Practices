-- Crear el SCHEMA
CREATE USER CURSOJAVA IDENTIFIED BY cursojava
DEFAULT TABLESPACE users
TEMPORARY TABLESPACE temp
QUOTA UNLIMITED ON users;

-- Dar privilegios básicos para conectarse y trabajar con sus tablas
GRANT CREATE SESSION TO CURSOJAVA;  -- Permiso para hacer login
GRANT CREATE TABLE TO CURSOJAVA; --Permiso para crear tablas
GRANT CREATE SEQUENCE TO CURSOJAVA; -- Permiso para crear secuencias
GRANT CREATE VIEW TO CURSOJAVA; -- Permiso para crear vistas
GRANT CREATE TRIGGER TO CURSOJAVA;  -- Permiso para crear triggers
GRANT CREATE PROCEDURE TO CURSOJAVA; -- Permiso para crear funciones y procedimientos almacenados
GRANT CREATE MATERIALIZED VIEW TO CURSOJAVA; -- Permiso para crear vistas materializadas
GRANT CREATE DATABASE LINK TO CURSOJAVA; -- Permiso para crear database link

-- Rol resource
GRANT RESOURCE TO CURSOJAVA;
