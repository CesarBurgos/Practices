/* Ejercicios de Java Basico
Repositorio de Ejercicios de Java de Consola Básico

Ejercicio 2: Calculadora simple

🎯 Objetivo: Operadores aritméticos y lectura de datos.

Solicita dos números y muestra:

* La suma
* La resta
* La multiplicación
* La división (manejando el caso de división entre 0)

💡 Extra: Permite al usuario elegir la operación mediante un menú (switch).*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void suma(int num1, int num2) {
        float result = num1 + num2;
        System.out.print(" La sumatoria de ambos numeros es: " );
        System.out.println(result);
    }

    public static void resta(int num1, int num2) {
        float result = num1 - num2;
        System.out.print(" La resta de ambos numeros es: " );
        System.out.println(result);
    }

    public static void mult(int num1, int num2) {
        float result = num1 * num2;
        System.out.print(" La multiplicacion de ambos numeros es: " );
        System.out.println(result);
    }

    public static void div(int num1, int num2) {
        try{
            float result = (float) (num1 / num2);

            System.out.print(" La division de ambos numeros es: " );
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.print("\n Programa 2: ");

        // Buffer para la lectura de datos desde el teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int num1 = 0, num2 = 0, opc = 0;

        System.out.println("\n\n");

        try {
            while(true){
                System.out.println("\n Operciones entre 2 numeros: ");
                System.out.println(" 1) Sumar ");
                System.out.println(" 2) Restar ");
                System.out.println(" 3) Multiplicar ");
                System.out.println(" 4) Dividir ");

                System.out.print("\n Ingrese una opción a realizar: ");
                input = br.readLine();
                opc = Integer.parseInt(input);

                if(opc >= 1 && opc <= 4){
                    break;
                }

                System.out.println(" Opción incorrecta \n");
            };

            while (true) {
                try {
                    System.out.print(" Ingrese su 1er numero: ");
                    input = br.readLine();
                    num1 = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                } catch (Exception egrl) {
                    System.out.println(egrl.toString());
                }

                try {
                    System.out.print(" Ingrese su 2do numero: ");
                    input = br.readLine();
                    num2 = Integer.parseInt(input);

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

        System.out.println("\n\n");

        switch (opc) {
            case 1:
                suma(num1, num2);
                break;

            case 2:
                resta(num1, num2);
                break;

            case 3:
                mult(num1, num2);
                break;

            case 4:
                div(num1, num2);
                break;

            default:
                System.out.println("Opción no válida");
        }
    }
}