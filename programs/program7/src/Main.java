/* Ejercicios de Java Basico
Repositorio de Ejercicios de Java de Consola Básico

### Ejercicio 7: Números pares entre 1 y 100

#### 🎯 Objetivo: Bucles y condiciones.

#### Imprime todos los números pares entre 1 y 100.

💡 Extra: Cuenta cuántos pares hay y muéstralo al final.*/

import java.util.ArrayList;

public class Main {
    public static void validadorNumeros(int limitI, int limitF) {

        ArrayList<Integer> numerosImpares = new ArrayList<>();
        ArrayList<Integer> numerosPares = new ArrayList<>();

        System.out.println("\n Informe de numeros del " + Integer.toString(limitI) + " al " + Integer.toString(limitF) + " \n");
        for(int i = limitI; i <= limitF; i++) {
            if(i % 2 == 0){
                numerosPares.add(i);
            }else{
                numerosImpares.add(i);
            }
        }

        System.out.println("\n Numeros Pares: " + Integer.toString(numerosPares.size()));
        for(int i = 0; i < numerosPares.size(); i++) {
            System.out.print(numerosPares.get(i) + ", ");
        }

        System.out.println("\n\n Numeros Impares: " + Integer.toString(numerosImpares.size()));
        for(int i = 0; i < numerosImpares.size(); i++) {
            System.out.print(numerosImpares.get(i) + ", ");
        }
    }

    public static void main(String[] args) {
        System.out.print("\n Programa 7: ");

        int limitInicio = 1, limitFinal = 100;

        System.out.println("\n\n");
        validadorNumeros(limitInicio, limitFinal);
    }
}