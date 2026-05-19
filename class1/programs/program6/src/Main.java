/* Ejercicios de Java Basico
Repositorio de Ejercicios de Java de Consola Básico

### Ejercicio 6: Tabla de multiplicar

#### 🎯 Objetivo: Bucles y formato de salida.

#### Pide un número y muestra su tabla de multiplicar del 1 al 10.

💡 Extra: Permite al usuario elegir hasta qué número mostrar la tabla.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void tablaMultiplicar(int num, int limit) {
        if(limit == 0){
            limit = 10;
        }

        System.out.println("\n Tabla del "+Integer.toString(num)+" \n");
        for(int i = 1; i <= limit; i++) {
            System.out.println(Integer.toString(num) + " x " + Integer.toString(i) + " = " + Integer.toString(num*i));
        }
    }

    public static void main(String[] args) {
        System.out.print("\n Programa 6: ");

        // Buffer para la lectura de datos desde el teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int num1 = 0, limit = 0;

        System.out.println("\n\n");

        try {
            while(true) {
                try {
                    System.out.print(" Ingrese un numero: ");
                    input = br.readLine();
                    num1 = Integer.parseInt(input);
                    /*if(num1<0){
                        System.out.println("\n Numero incorrecto \n");
                    }else {
                        break;
                    }*/
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                } catch (Exception egrl) {
                    System.out.println(egrl.toString());
                }
            }

            while(true){
                System.out.println("\n ¿Limitar tabla de multiplicar? ");
                System.out.println(" 0) Toda la tabla");
                System.out.println(" 1-10) Limitador ");

                System.out.print("\n Ingrese una opción a realizar: ");
                input = br.readLine();
                limit = Integer.parseInt(input);

                if(limit <= 0 || limit > 10){
                    limit = 0;
                }
                break;
            };


        } catch (Exception err) {
            System.out.println("error: " + err.getMessage());
        }

        tablaMultiplicar(num1, limit);
    }
}