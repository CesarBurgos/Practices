/* Ejercicios de Java Basico
Repositorio de Ejercicios de Java de Consola Básico

Ejercicio 4: Mayor de tres números

🎯 Objetivo: Uso de condicionales anidados o Math.max.

Pide tres números e imprime cuál es el mayor.

💡 Extra: Indica si hay números iguales entre ellos.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void valid_mayor(int []numeros) {
        int numMayor = numeros[0];
        int numIgual = 0;

        for(int i = 1; i < numeros.length; i++) {
            if(numeros[i] > numMayor){
                numMayor = numeros[i];
            }
        }

        for(int i = 1; i < numeros.length; i++) {
            if (numeros[0] == numeros[i]) {
                numIgual = 1;
            }
        }

        System.out.println("\n\n El numero mayor es: " + Integer.toString(numMayor));
        if(numIgual == 1){
            System.out.println("Existen numeros iguales");
        }
    }

    public static void main(String[] args) {
        System.out.print("\n Programa 4: ");

        // Buffer para la lectura de datos desde el teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int num1 = 0;
        int[] numeros = new int[3];

        System.out.println("\n\n");

        try {
            for(int i = 0; i < 3; i++) {
                while(true) {
                    try {
                        System.out.print(" Ingrese un numero: ");
                        input = br.readLine();
                        num1 = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                    } catch (Exception egrl) {
                        System.out.println(egrl.toString());
                    }
                }

                numeros[i] = num1;
            }
        } catch (Exception err) {
            System.out.println("error: " + err.getMessage());
        }

        valid_mayor(numeros);
    }
}