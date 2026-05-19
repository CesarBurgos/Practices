/* Ejercicios de Java Basico
Repositorio de Ejercicios de Java de Consola Básico

### Ejercicio 5: Contador de números

#### 🎯 Objetivo: Uso de bucles for y contadores.

#### Pide un número N y muestra todos los números del 1 al N.

💡 Extra: Muestra también la suma total de esos números.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void recorridoNums(int num) {
        int sumNums = 0;

        System.out.println("\n\n");
        for(int i = 1; i <= num; i++) {
            sumNums += i;
            System.out.print(Integer.toString(i) + ", ");
        }
        System.out.println("\n\n Sumatoria numeros: " + Integer.toString(sumNums));
    }

    public static void main(String[] args) {
        System.out.print("\n Programa 5: ");

        // Buffer para la lectura de datos desde el teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int num1 = 0;

        System.out.println("\n\n");

        try {
            while(true) {
                try {
                    System.out.print(" Ingrese un numero: ");
                    input = br.readLine();
                    num1 = Integer.parseInt(input);
                    if(num1<0){
                        System.out.println("\n Numero incorrecto \n");
                    }else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                } catch (Exception egrl) {
                    System.out.println(egrl.toString());
                }
            }
        } catch (Exception err) {
            System.out.println("error: " + err.getMessage());
        }

        recorridoNums(num1);
    }
}