# Ejercicios de SQL

### 1. Crea y Obtén todos los registros de la tabla usuarios.

======= Respuesta:

1) Usando el comando CREATE TABLE, creo una tabla

    CREATE TABLE usuarios (
        id INT PRIMARY KEY AUTO_INCREMENT,
        nombre VARCHAR(100),
        email VARCHAR(100),
        edad INT
    );

2) Después se muestra el contenido de la tabla creada usando el comando SELECT

    SELECT * FROM usuarios;

### 2. Muestra solo los campos nombre y email de la tabla usuarios.
======= Respuesta:
Por medio del comando SELECT, y seleccionando los campos de nombre y email
    
    SELECT nombre, email FROM usuarios;

### 3. Obtén los usuarios cuya edad sea mayor a 18.
======= Respuesta:
Usando del comando SELECT, y la condicional WHERE

    SELECT * FROM usuarios WHERE edad > 18;

### 4. Inserta un usuario llamado “Ana”, edad 25, email "ana@mail.com".
======= Respuesta:
Usando el comando INSERT INTO, especificando las columnas de la tabla deseada y el comando VALUE en donde se introducen los valores a almacenar

    INSERT INTO usuarios (nombre, edad, email) VALUES ('Ana', 25, 'ana@mail.com');

### 5. Actualiza el email del usuario con id = 3.
======= Respuesta:
Usando el comando UPDATE, indicando en que tabla se realizará la modificación y posteriormente por medio del comando SET se ingresa el valor a cambiar en la columna especifica, también por medio de WHERE indicar el registro a Actualizar

    UPDATE usuarios SET email = 'nuevo@mail.com' WHERE id = 3;

### 6. Elimina el usuario con id = 5.
======= Respuesta:
Por medio del comando DELETE, se especifica la tabla en donde se realizará la eliminación y siempre por el comando WHERE buscar el registro a eliminar, ya que sin el comando WHERE, elimina la tabla:

    DELETE FROM usuarios WHERE id = 5;

### 7. Obtén los usuarios ordenados por edad de mayor a menor.
======= Respuesta:
Usando el comando SELECT y el comando ORDER BY, obtenemos todos los registros de la tabla dada una columna especifica, DESC seria en este caso de mayor a menor, ASC el caso contrario

    SELECT * FROM usuarios ORDER BY edad DESC;

### 8. Cuenta cuántos usuarios hay en la tabla.
======= Respuesta:
Por medio del comando COUNT, puede ser indicada la columna a contabilizar o bien * para todos los registros dentro de la tabla

    SELECT COUNT(*) AS total_usuarios FROM usuarios;

### 9. Obtén los usuarios cuyo nombre empiece con la letra "A".
======= Respuesta:
Utilizando el comando SELECT y la condicional WHERE, se realiza esta acción, en este caso se añade el caracter de %, después de la A, esto indica que me retorne todos los nombre que empiecen con la letra A (Mayuscula).

    SELECT * FROM usuarios WHERE nombre LIKE 'A%';

### 10. Muestra los usuarios con edad entre 20 y 30.
======= Respuesta:
Utilizando el Operador SELECT y BETWEEN, se pueden obtener todos los registros en una columna especifica dado un rango especifico, BETWEEN limite_Inferior AND limite_Superior

    SELECT * FROM usuarios WHERE edad BETWEEN 20 AND 30;

### 11. Agrupa usuarios por edad y muestra cuántos hay por cada edad.
======= Respuesta:
Con el comando SELECT, COUNT y GROUP BY, primeramente se obtiene los registros de la edad, y de estos se contabiliza su total y al ser agrupado por edad, indicaría cuanto registros se cuentan por cada edad.

    SELECT edad, COUNT(*) AS total FROM usuarios GROUP BY edad;

### 12. Muestra solo edades que tengan más de 2 usuarios.
======= Respuesta:
Utilizado el comando SELECT, COUNT, GROUP BY y HAVING, primeramente se extraen los registros de la columa de edad, después se agrupan por edad, posteriormente se muestran aquellos grupos que cuentan con más de de 2 registros.

SELECT edad, COUNT(*) AS total FROM usuarios GROUP BY edad HAVING COUNT(*) > 2;

### 13. Une las tablas pedidos y usuarios usando usuario_id.

a) Mostrando solo los campos de pedidos con su usuario_id mediante join

======= Respuesta:
Por medio de una operación INNER, especificamente una INNER JOIN, esta operación realiza la unión entre 2 tablas en donde se comparte el mismo valor del ID en sus registros.

    SELECT pedidos.*, pedidos.usuario_id FROM pedidos INNER JOIN usuarios ON usuarios.id = pedidos.usuario_id;

b) Mostrando solo los campos de usuario con su pedido_id mediante join

======= Respuesta:
Similar a la pregunta anterior se realiza una operación INNER, especificamente por medio de una INNER JOIN, realiza una unión entre 2 tablas en donde se comparte el mismo valor del ID en sus registros, esto en el caso de que pedidos cuente con el campo de user id, en otro caso, se deberá hacer en otras tablas.

    SELECT usuarios.*, pedidos.id AS pedido_id FROM usuarios INNER JOIN pedidos ON usuarios.id = pedidos.usuario_id;

c) Mostrando todos los campos de ambas tablas join.

======= Respuesta:
Se efectua la INNER JOIN, con la diferente que en vez de especificar las columnas especificas, se coloca el operador *, para mostrar todos los registros de ambas tablas, que compartan los registros ya sea id u otro valor en las columnas especificas

    SELECT * FROM usuarios INNER JOIN pedidos ON usuarios.id = pedidos.usuario_id;

d) Mostrando solo los campos de pedido_id y usuario_id mediante tabla intermedia.

======= Respuesta:
Implicitamente INNER JOIN crea una tabla temporal con los registros que coincidan con los ids especificios en la columna correspondiente de cada tabla usada.

1) INNER JOIN

    SELECT usuarios.id AS usuario_id, pedidos.id AS pedido_id FROM usuarios INNER JOIN pedidos ON usuarios.id = pedidos.usuario_id;

2) Crear una tabla especifica intermedia, cuyos campos contengan la información especifica de cada tabla, junto a la llave forania que enlace a dichas tablas

    CREATE TABLE usuario_pedido (
        usuario_id INT,
        pedido_id INT,
        PRIMARY KEY (usuario_id, pedido_id),
        FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
        FOREIGN KEY (pedido_id) REFERENCES pedidos(id)
    );

### 14. Crea una tabla llamada productos con:

id entero PK
nombre texto
precio decimal

======= Respuesta:
Usando el comando CREATE TABLE, creo la dicha tabla con los tipos de datos especificos e indicando como llave primaria "id"

    CREATE TABLE productos (
        id INT PRIMARY KEY AUTO_INCREMENT,
        nombre VARCHAR(100),
        precio DECIMAL(10,2)
    );

### 15. Agrega una columna telefono a la tabla usuarios.
======= Respuesta:
Para crear una columna se debe usar el comando ALTER TABLE, se indica que tabla se debe insertar la nueva columna, con su correpondiente tipo de dato.

    ALTER TABLE usuarios ADD telefono VARCHAR(20);

### 16. Elimina la tabla temporal intermedia.
======= Respuesta:
Para eliminar una tabla se utiliza el comando DROP TABLE, seguido del nombre de la tabla a eliminar.

    DROP TABLE tabla_intermedia;

### 17. Muestra productos con precio mayor al promedio de todos los productos.
======= Respuesta:
Dentro de SQL existen algunas operaciones aritmeticas, para esta situación se cuenta con AVG, para este caso, se realiza una subconsulta en la consulta, para que en dicha subconsulta se calcule primero el promedio de los precios, con este dato, poder validar en una condición WHERE que retorne todos los registros cuyo precio sea mayor al promedio calculado.

    SELECT * FROM productos WHERE precio > (SELECT AVG(precio) FROM productos);

### 18. Obtén el pedido más reciente.
======= Respuesta:
Primeramente se ordenan todos los registros de mayor a menor de la columna de las fechas, y de ello con el comando LIMIT obtenemos solamente el primer registro, ya que esto indicaría que se obtuvo el más alto.

    SELECT * FROM pedidos ORDER BY fecha DESC LIMIT 1;

### 19. Crea una clave foránea en pedidos que apunte a usuarios(id).
======= Respuesta:
Se desea saber a que usuario corresponde el pedido registrado, para ello se registra en la tabla una nueva columna, siendo el id del usuario, para ello, es creada la llave foranea (usuario_id), esto se crea una regla con ADD CONSTRAINT (condición que la base de datos debe cumplir siempre), fk_usuarios, se declará una llave foranea a esta regla, usuario_id, indicando que haga referencia al id de la tabla de usuarios

    ALTER TABLE pedidos ADD CONSTRAINT fk_usuarios FOREIGN KEY (usuario_id) REFERENCES usuarios(id);
    
### 20. Muestra los usuarios que no tienen pedidos.
======= Respuesta:
Haciendo una consulta con INNER JOIN, se obtienen todos los registros de los usuarios que existen sus IDs dentro de la columna de ID en la la tabla de pedidos, validando que en el WHERE se cumpla la condición de que en la columna de IDs usuarios no existan los IDs de los usuarios de la tabla de usuarios.

    SELECT u.* FROM usuarios u LEFT JOIN pedidos p ON u.id = p.usuario_id WHERE p.usuario_id IS NULL;