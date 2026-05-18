/* Ejercicios de Java Basico
Repositorio de Ejercicios de Java de Consola Básico

### Ejercicio 8: Suma hasta que el usuario diga “no”

#### 🎯 Objetivo: Uso de bucle while y condiciones lógicas.

#### El programa debe pedir números y sumarlos hasta que el usuario escriba “no” para terminar.

💡 Extra: Muestra cuántos números ingresó el usuario.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n Programa 8: ");

        // Buffer para la lectura de datos desde el teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int num1 = 0, sum = 0, totalNums = 1;

        System.out.println("\n\n");

        try {
            while(true) {
                while (true) {
                    try {
                        System.out.print("\n Ingrese un numero: ");
                        input = br.readLine();
                        num1 = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                    } catch (Exception egrl) {
                        System.out.println(egrl.toString());
                    }
                }

                sum += num1; // Sumando

                System.out.println("\n ¿Sumar otro numero? ");
                System.out.println(" 'no' - Cancelar");

                System.out.print("\n Ingrese la acción a realizar: ");
                input = br.readLine();
                input = input.replace(" ", "");
                input = input.toLowerCase();

                if (input.equals("no")) {
                    break;
                }

                totalNums += 1;
            }

            System.out.println("\n\n Total de numeros ingresados " + Integer.toString(totalNums) + " Sumatoria: " + Integer.toString(sum));
        } catch (Exception err) {
            System.out.println("error: " + err.getMessage());
        }
    }
}