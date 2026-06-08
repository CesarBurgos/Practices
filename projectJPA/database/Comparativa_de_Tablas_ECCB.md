# Comparativa de Estructura de Tablas entre Bases de Datos

## Descripción General

Durante la revisión y comparación de las tablas de las bases de datos, se identificaron diversos cambios estructurales respecto a las versiones previamente desarrolladas. Estos cambios están enfocados en la aplicación de buenas prácticas de diseño, organización y mantenimiento de bases de datos.

## Cambios Identificados

### 1. Reorganización de Columnas

Las columnas correspondientes a:

- Llaves primarias (ID de la tabla).
- Llaves de referencia hacia otras tablas.

fueron colocadas al inicio de cada estructura de tabla. Esta organización facilita la identificación de relaciones entre entidades y mejora la legibilidad de los scripts.

### 2. Convención de Nombres de Tablas

Los nombres de las tablas fueron definidos en singular en lugar de plural.

**Objetivos:**

- Mantener consistencia con los principios de modelado UML.
- Facilitar la comprensión de la entidad representada.
- Mejorar la legibilidad de los esquemas de base de datos.

### 3. Validación para Eliminación de Objetos

Antes de crear una tabla, los scripts intentan eliminarla si ya existe.

El comportamiento es el siguiente:

1. Oracle intenta ejecutar la eliminación del objeto.
2. Si el objeto existe, se elimina correctamente.
3. Si no existe, Oracle genera el error `ORA-00942`.
4. Este error es controlado y permitido.
5. Cualquier otro error provoca la ejecución de `RAISE`, interrumpiendo el proceso.

Esta práctica permite ejecutar los scripts múltiples veces sin necesidad de realizar validaciones manuales previas.

### 4. Estandarización de Campos VARCHAR2

Algunos campos de tipo `VARCHAR2` incrementaron su longitud a 36 caracteres o valores superiores.

**Objetivo:**

- Estandarizar tamaños de almacenamiento para cadenas de texto.
- Facilitar futuras ampliaciones sin requerir modificaciones estructurales frecuentes.

### 5. Exclusión Temporal de Llaves Foráneas

Los scripts de creación de tablas no incluyen inicialmente las restricciones de llaves foráneas.

Esto responde a una estrategia de implementación por etapas, donde primero se crean todas las estructuras necesarias y posteriormente se agregan las relaciones entre ellas.

## Orden Recomendado de Implementación

La creación de objetos de base de datos debe seguir la siguiente secuencia:

1. **Creación de tablas**
   - Incluyendo secuencias cuando el identificador sea autogenerado.

2. **Creación de bitácoras**
   - Tablas de auditoría para registrar cambios y operaciones.

3. **Creación de restricciones (Constraints)**
   - Llaves primarias.
   - Llaves foráneas.

4. **Creación de secuencias** *(opcional, según el diseño implementado)*

5. **Creación de índices**
   - Para optimización de consultas y búsquedas.

6. **Incorporación de funcionalidades adicionales**
   - Modificaciones de tablas.
   - Funciones.
   - Procedimientos.
   - Triggers.
   - Inserts iniciales.
   - Secuencias complementarias y demás objetos necesarios.

## Conclusión

Las modificaciones realizadas buscan mejorar la organización, mantenibilidad y escalabilidad del modelo de datos, alineándose con buenas prácticas de diseño de bases de datos y estándares de desarrollo utilizados en proyectos empresariales.