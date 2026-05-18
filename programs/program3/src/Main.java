/* Ejercicios de Java Basico
Repositorio de Ejercicios de Java de Consola Básico

Ejercicio 3: Número par o impar

 🎯 Objetivo: Uso de if y operadores lógicos.

Pide al usuario un número entero y muestra si es par o impar.

💡 Extra: Indica también si es positivo, negativo o cero..*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void valid_impar_par(int num1) {
        if (num1 % 2 == 0) {
            System.out.println(" Es PAR");
        }else{
            System.out.println(" Es IMPAR");
        }
    }

    public static void validPositive(int num1) {
        if (num1 > 0) {
            System.out.println(" Es POSITIVO");
        }else{
            System.out.println(" Es NEGATIVO");
        }
    }

    public static void main(String[] args) {
        System.out.print("\n Programa 3: ");

        // Buffer para la lectura de datos desde el teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int num1 = 0;

        System.out.println("\n\n");

        try {
            while (true) {
                try {
                    System.out.print(" Ingrese un numero: ");
                    input = br.readLine();
                    num1 = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                } catch (Exception egrl) {
                    System.out.println(egrl.toString());
                }

                break;
            }
        } catch (Exception err) {
            System.out.println("error: " + err.getMessage());
        }

        valid_impar_par(num1);
        validPositive(num1);
    }
}