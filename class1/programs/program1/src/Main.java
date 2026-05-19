/* Ejercicios de Java Basico
Repositorio de Ejercicios de Java de Consola Básico

Ejercicio 1: Hola, programador
🎯 Objetivo: Aprender a usar System.out.println y leer datos con Scanner.

Crea un programa que pida tu nombre y edad por consola, y luego imprima un mensaje como
>"Hola, Carlos. Tienes 25 años. ¡Bienvenido a Java!"

💡 Extra: Calcula en qué año de nacimiento y muéstralo también.
>"Hola, Carlos. Tienes 25 años. ¡Bienvenido a Java!, naciste en el año 2000"*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate; // Fechas en Java

public class Main {
    public static void main(String[] args) {
        System.out.print("\n Programa 1: ");

        // Buffer para la lectura de datos desde el teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "", nombre = "";
        int edad = 0;

        try {
            do{
                System.out.print("\n Ingrese su nombre completo: ");
                input = br.readLine();
                nombre = input;
            }while(nombre.isEmpty());

            while (true) {
                try {
                    System.out.print(" Ingrese su Edad: ");
                    input = br.readLine();
                    edad = Integer.parseInt(input);

                    if (edad>0){
                        break;
                    }

                    System.out.println("\n Edad incorrecta \n");
                } catch (NumberFormatException e) {
                    System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                } catch (Exception egrl) {
                    System.out.println(egrl.toString());
                }
            }
        } catch (Exception err) {
            System.out.println("error: " + err.getMessage());
        }

        System.out.print(" Nombre: ");
        System.out.println(nombre);

        int anioActual = LocalDate.now().getYear();

        System.out.print(" Edad: ");
        System.out.println(edad);
        System.out.println("\n\n ==================");
        System.out.println(" Hola, "+nombre+". Tienes " + Integer.toString(edad) + " años. ¡Bienvenido a Java!, naciste en el año " + Integer.toString((anioActual-edad)));
    }
}