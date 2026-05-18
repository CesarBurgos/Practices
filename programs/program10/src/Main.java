/* # Ejercicios de Java Basico
Repositorio de Ejercicios de Java de Consola Básico

### Ejercicio 10: Menú interactivo

#### 🎯 Objetivo: Combinar while, switch y Scanner.

#### Crea un menú que muestre opciones como:
    1️⃣ Sumar dos números
    2️⃣ Restar
    3️⃣ Multiplicar
    4️⃣ Salir
El programa se repite hasta que el usuario elija salir.

💡 Extra: Usa un do-while para hacerlo más natural.*/

import java.util.Scanner;

public class Main {
    public static int pedirNum(Scanner sc) {
        String input = "";
        int num = 0;

        while (true) {
            try {
                System.out.print(" Ingrese su numero: ");
                input = sc.nextLine();
                num = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
            } catch (Exception egrl) {
                System.out.println(egrl.toString());
            }
        }

        return num;
    }

    public static void suma(int num1, int num2) {
        float result = num1 + num2;
        System.out.print(" La sumatoria de ambos numeros es: ");
        System.out.println(result);
    }

    public static void resta(int num1, int num2) {
        float result = num1 - num2;
        System.out.print(" La resta de ambos numeros es: ");
        System.out.println(result);
    }

    public static void mult(int num1, int num2) {
        float result = num1 * num2;
        System.out.print(" La multiplicacion de ambos numeros es: ");
        System.out.println(result);
    }

    public static void div(int num1, int num2) {
        try {
            float result = (float) (num1 / num2);

            System.out.print(" La division de ambos numeros es: ");
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.print("\n Programa 10: ");

        Scanner sc = new Scanner(System.in);
        String input = "";
        int num1 = 0, num2 = 0, opc = 0;

        System.out.println("\n\n");

        try {
            do {
                System.out.println("\n Operciones entre 2 numeros: ");
                System.out.println(" 1) Sumar ");
                System.out.println(" 2) Restar ");
                System.out.println(" 3) Multiplicar ");
                System.out.println(" 4) Salir ");

                System.out.print("\n Ingrese una opción a realizar: ");
                input = sc.nextLine();
                opc = Integer.parseInt(input);

                System.out.println("\n\n");

                switch (opc) {
                    case 1:
                        System.out.println("\n Primer Numero ");
                        num1 = pedirNum(sc);
                        System.out.println("\n Numero ");
                        num2 = pedirNum(sc);

                        suma(num1, num2);
                        break;

                    case 2:

                        System.out.println("\n Primer Numero ");
                        num1 = pedirNum(sc);
                        System.out.println("\n Segundo Numero ");
                        num2 = pedirNum(sc);

                        resta(num1, num2);
                        break;

                    case 3:
                        System.out.println("\n Primer Numero ");
                        num1 = pedirNum(sc);
                        System.out.println("\n Segundo Numero ");
                        num2 = pedirNum(sc);

                        mult(num1, num2);
                        break;

                    case 4:
                        break;

                    default:
                        System.out.println("Opción no válida");
                }
            }while(opc != 4);
        } catch(Exception err) {
            System.out.println("error: " + err.getMessage());
        }
    }
}