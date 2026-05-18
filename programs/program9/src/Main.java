/* Ejercicios de Java Basico
Repositorio de Ejercicios de Java de Consola Básico

### Ejercicio 9: Adivina el número

#### 🎯 Objetivo: Bucles, operadores relacionales y aleatorios.

#### Genera un número aleatorio entre 1 y 50. El usuario debe adivinarlo. Después de cada intento, muestra si el número es mayor o menor.

💡 Extra: Cuenta el número de intentos usados.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n Programa 9: ");

        // Buffer para la lectura de datos desde el teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int num1 = 0, intentos = 1, limitRandom = 50;

        Random rand = new Random();
        int numeroRandom = rand.nextInt(limitRandom)+1;

        System.out.println("\n\n");

        try {
            System.out.println("Adivinar el numero aleatorio");
            //System.out.print(numeroRandom);

            while(true) {
                while (true) {
                    try {
                        System.out.print("\n ¿Qué numero es?: ");
                        input = br.readLine();
                        num1 = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                    } catch (Exception egrl) {
                        System.out.println(egrl.toString());
                    }
                }

                if(num1 == numeroRandom){
                    System.out.println("\n\n Exacto!! le haz atinado..");
                    System.out.println(" Intentos " + Integer.toString(intentos));
                    break;
                }

                intentos += 1;

                if(numeroRandom > num1){
                    System.out.println("No... El numero aleatorio es mayor a " + Integer.toString(num1));
                }else{
                    System.out.println("No... El numero aleatorio es menor que " + Integer.toString(num1));
                }
            }
        } catch (Exception err) {
            System.out.println("error: " + err.getMessage());
        }
    }
}