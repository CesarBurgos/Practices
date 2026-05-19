# Ejercicios de Java Basico
Repositorio de Ejercicios de Lógica de Programación

## Estos ejercicios se realizan contestando las preguntas, sin código.

### 🧠 Ejercicio 1: Hola usuario

#### Planteamiento:

Quieres que el programa salude al usuario por su nombre.

#### Piensa:

¿Cómo se guarda un texto que el usuario escribe?

¿Cómo se muestra un mensaje por pantalla?

¿Cómo unir (concatenar) el texto “Hola” con el nombre?

#### Reto:
Imagina que el usuario escribe “Carlos”.
¿Qué debería mostrar el programa?

========= Respuesta General:
Primeramente se debe declara el buffer de entrada del teclado, posteriormente lo que es ingresado (nombre) será Almacenado en una variable de tipo String, en mi caso, considero validar que no se encuentre vacía la variable, si es así volver a pedir el nombre, en caso de todo estar correctamente almacenado, imprimir el mensaje concatenando la palabra "Hola" junto a + seguido del nombre de la variable en donde se almaceno el nombre del usuario.




### 🧠 Ejercicio 2: Suma de dos números

#### Planteamiento:

El usuario introduce dos números, el programa debe mostrar su suma.

#### Piensa:

¿Qué tipo de datos representan los números?

¿Qué operación matemática debes hacer?

¿Cómo mostrar el resultado junto con un mensaje claro?

#### Reto:
Si el usuario escribe 8 y 12, ¿qué resultado esperas que aparezca? 
========= Respuesta: 20

========= Respuesta General:
Primeramente se debe declara el buffer de entrada del teclado, posteriormente lo que es ingresado será Almacenado en diferentes variables de tipo String, para almacenar el numero 1, se debe enmascarar o bien "parsear" de String a entero el valor introducido para el numero 1 en una nueva variable de tipo entero, lo mismo con el numero 2, después al ya estar convertidos en enteros se realiza la suma y se almacena en una nueva variable (num1 + num2), finalmente se imprime el valor obtenido o almacenado en la variable del resultado.




### 🧠 Ejercicio 3: Número par o impar

#### Planteamiento:

Determinar si un número es par o impar.

#### Piensa:

¿Qué significa que un número sea par? (¿qué operación lo demuestra?)

========= Respuesta:
Se aplica el operador de módulo (%) con un valor de 2, es decir que realiza la división entre el numero ingresado y el valor de 2, si el RECIDUO de la división es 0 es un numero PAR, en caso contrario es IMPAR.

¿Qué pasa si el número no cumple esa condición?

========= Respuesta:
El operador de módulo si es declarado (NUM % 2 == 0) si el reciduo de la operación es 0, se define como PAR, en caso contrario será IMPAR.

¿Cómo plantearías la decisión en palabras, antes del código?

========= Respuesta: Simplemente si se divide entre 2 queda residuo 0, es par.

#### Reto:
Haz una lista rápida de 5 números y marca cuáles son pares e impares.
¿Cómo lo decides mentalmente?

========= Respuesta: Mi Lista: 1,2,3,4,5

En mi ejemplo de la lista simplemente considero que los números múltiplos de 2 son pares, lo contrario impar.




### 🧠 Ejercicio 4: Mayor de dos números

#### Planteamiento:

El programa debe decir cuál de los dos números es mayor o si son iguales.

#### Piensa:

¿Qué comparaciones necesitas hacer entre los dos valores?

========= Respuesta: Validar  primero si los números son iguales, si es así romper toda condición, en caso contrario un segundo "if", el cual valide, si el numero 1 es mayor que el numero 2, es mayor el numero 1, en caso contrario ("else"), es mayor el numero 2.

¿Qué resultados posibles existen?

========= Respuesta: Pueden suceder 3 casos: numeros iguales, numero 1 mayor o numero 2 mayor.

¿Qué mensaje mostrarías en cada caso?

========= Respuesta: Dependiendo de la condición cumplida seria:
Condición 1: Numeros iguales
Condición 2: Numero 1 mayor
Condición 3: Numero 2 mayor

#### Reto:
Si tienes los números 10 y 15, ¿qué debería decir el programa?

========= Respuesta: El valor de 15.




### 🧠 Ejercicio 5: Tabla de multiplicar

#### Planteamiento:

Mostrar la tabla de multiplicar de un número del 1 al 10.

#### Piensa:

¿Qué patrón sigue una tabla de multiplicar?

========= Respuesta: Intera una serie de numeros del 1 al 10, en donde cada numero, es multiplicado por 10.

¿Qué sucede si el número cambia?

========= Respuesta: Simplemente el valor resultado de la multiplicación tabla cambiaría, en caso de cambiar el limitar de resultados, simplemente se delimitará el numero de multiplicaciones a realizar.

¿Cómo repetirías una acción varias veces (repetición/loop)?

========= Respuesta: Solicitar 2 variables, numero a multiplicar (MULT) y un limitador de multiplicación (LIMIT), con esos 2, recorrer desde 1 hasta el delimitador, e ir multiplicando cada posición o digito por el multiplicador (MULT).

#### Reto:
Imagina que el número es 4.
Enumera mentalmente: 4×1, 4×2, 4×3... hasta 4×10.
¿Qué notas que se repite?

========= Respuesta: Se repite la parte "4x", y el separador ", " 



### 🧠 Ejercicio 6: Contador del 1 al N

#### Planteamiento:

Mostrar todos los números desde el 1 hasta un número que el usuario indique.

#### Piensa:

¿Qué ocurre si el usuario pone 5?

========= Respuesta: muestra los números 12345

¿Cómo puedes generar una secuencia de números consecutivos?

========= Respuesta: Recorrer en un for desde el numero 1 hasta el limitador indicado por el usuario.

¿Qué variable controlaría cuántas veces repites el proceso?

========= Respuesta: Una variable delimitadora (la cual debe realizarse hasta cumplirse una condición), en este caso el numero que indique el usuario.


#### Reto:
Hazlo tú: cuenta del 1 al número que quieras, pero imagina que una máquina lo hace.
¿Qué instrucciones necesitaría?

========= Respuesta: 
1) Ingresar un delimitador (delim)
2) Recorrer en un for desde 1 (i) hasta que se llegue al delimitador el recorrido (i <= delim)




### 🧠 Ejercicio 7: Suma acumulativa

#### Planteamiento:

Calcular la suma de los números del 1 al N.

#### Piensa:

¿Qué patrón sigue la suma? (1 + 2 + 3 + ... + N)

========= Respuesta: Realiza la sumatoria de los numeros conformados en la serie de numeros establecida, se podría decir que es la suma del numero anterior más 1, hasta el numero final indicado.

¿Podrías ir sumando número por número?

========= Respuesta: Sí es posible, simpre y cuando exista como limite un numero mayor o igual a 1, ya que 1 es el valor minimo a sumar

¿Qué necesitas guardar durante el proceso?

========= Respuesta: La sumatoria de cada numero conformado en la serie.

#### Reto:
Si N = 5 → 1 + 2 + 3 + 4 + 5 = 15
¿Cómo podrías llegar a ese 15 sin hacer la cuenta completa cada vez?

========= Respuesta: Usando la formula [N × (N + 1) / 2], es decir
[5 * (5 + 1) / 2] ----- [5 * (6) / 2] ----- [30 / 2] = 15




### 🧠 Ejercicio 8: Promedio de tres números

#### Planteamiento:

Calcular el promedio de tres valores numéricos.

#### Piensa:

¿Qué operación define el promedio?

========= Respuesta: Se define como la sumatoria de N numeros entre el total de ellos.

¿Qué pasos necesitas para calcularlo (sumar → dividir)?

========= Respuesta: 
1) Sumar los 3 números
2) Dividir el resultado de la sumatoria entre 3


¿Qué tipo de resultado esperas (entero o decimal)?

========= Respuesta: Se debería esperar un decimal, ya que pueden obtenerse valores con decimas, aunque existen funciones que o situación en las que únicamente se considera la parte entera.


#### Reto:
Si tienes 70, 80 y 90, ¿qué promedio obtienes?

========= Respuesta: 240 / 3 = 80


### 🧠 Ejercicio 9: Calificación aprobatoria

#### Planteamiento:

Decidir si una calificación es aprobatoria o reprobatoria.

#### Piensa:

¿Cuál es el valor mínimo para aprobar?

========= Respuesta: Considero que 7 es el minimo

¿Qué comparación necesitas hacer?

========= Respuesta: Validar si la calificación obtenida es MAYOR o IGUAL a la mínima aprobatoria, en este caso 7.

¿Cómo expresas el resultado como texto (“Aprobado” o “Reprobado”)?

========= Respuesta: Primeramente validar que la calificación sea mayor o igual a la calificación mínima, si es así, por medio de un println, mostrar "Aprobado", en caso contrario, "Reprobado".

#### Reto:
Si el usuario escribe 59, ¿qué diría tu programa?
¿Y si escribe 60?

========= Respuesta: Si mi calificación mínima es 7, mostrará en ambos casos "APROBADO".
Pero... Si mi calificación mínima es 70, mostrará en ambos casos "REPROBADO".




### 🧠 Ejercicio 10: Conversor de temperatura

#### Planteamiento:

Convertir grados Celsius a Fahrenheit.

#### Piensa:

¿Qué fórmula necesitas aplicar?

========= Respuesta: La formula es F = (C × (9/5)) + 32

¿Qué pasos seguirías para obtener el resultado?

========= Respuesta:
1) Dividir (9/5)
2) Multilplicar el resultado por C
3) Finalmente sumar 32 al resultado del producto


¿Qué pasa si el usuario ingresa un número negativo?

========= Respuesta: Nada, es un valor valido, ya que existen temperaturas bajo Cero (Frío).

#### Reto:
Si C = 0 → F = (0×9/5)+32 → 32

¿Puedes hacerlo con otro valor, por ejemplo, C=100?

========= Respuesta:
1) Dividir (9/5) = 1.8
2) Multilplicar el resultado por C = (100 * 1.8) = 180
3) Finalmente sumar 32 al resultado del producto = 180 + 32 = 212
