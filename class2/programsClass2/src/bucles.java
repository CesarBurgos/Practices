/*
    Para programa 4:
    Implementación de bucles
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bucles {
    // Para menu
    private String input;
    private int opc;
    BufferedReader br;
    private int num;

    //Constructor
    public bucles() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void cicloFor(int numTabla){
        // Tabla de multiplicar
        System.out.println("=== Tabla del " + Integer.toString(numTabla) + " ===");
        for (int i = 1; i <= 10; i++) {
            System.out.printf(Integer.toString(numTabla) + " x %2d = %3d%n", i, numTabla * i);
        }
    }

    public void cicloForEach(){
        String[] escritorioTrabajo = {"Computadora", "Pantalla", "Teclado", "Escritorio"};
        System.out.println("\n Mi lugar de trabajo tiene: ");
        for (String elemento : escritorioTrabajo) {
            System.out.println("  → " + elemento);
        }
    }

    public void cicloWhile(int contador){
        while (contador > 0) {
            System.out.println(contador + "...");
            contador--;
        }
        System.out.println("¡Fin!");
    }

    public void cicloDoWhile(BufferedReader br) throws IOException {
        int intento = 0;
        int intentosMax = 3;
        do {
            System.out.print(" Registra tu contraseña: ");
            input = br.readLine();
            intento++;
            System.out.println("Intento #" + intento);
        } while (intento < intentosMax);
    }

    public void menuProgram4() throws IOException {
        while (true) {
            try {
                System.out.println("\n\n Programa 4: Bucles. \n\n");

                System.out.println(" 1) ciclo For: Tabla de multiplicar");
                System.out.println(" 2) ciclo For-Each: Lista de cosas");
                System.out.println(" 3) ciclo While: Contador");
                System.out.println(" 4) ciclo Do-While: Simulando ingreso");

                System.out.println(" Salir (Cualquier caracter) ");

                System.out.print("\n Ingrese una opción a realizar: ");
                input = br.readLine();
                opc = Integer.parseInt(input);

                if (opc < 1 || opc > 4) {
                    break;
                }

                System.out.println("\n");

                switch (opc) {
                    case 1:
                        while (true) {
                            try {
                                System.out.print(" Ingresa la tabla que deseas consultar: ");
                                input = br.readLine();
                                num = Integer.parseInt(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                            } catch (Exception egrl) {
                                System.out.println(egrl.toString());
                            }
                        }

                        cicloFor(num);
                        break;

                    case 2:
                        cicloForEach();
                        break;

                    case 3:
                        while (true) {
                            try {
                                System.out.print(" Ingresa un numero: ");
                                input = br.readLine();
                                num = Integer.parseInt(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                            } catch (Exception egrl) {
                                System.out.println(egrl.toString());
                            }
                        }

                        cicloWhile(num);
                        break;

                    case 4:
                        cicloDoWhile(br);
                        break;

                    default:
                        System.out.println("\n Programa 4: bye...\n");
                        break;
                }
            } catch (Exception err) {
                //System.out.println("error: " + err.getMessage());
                System.out.println("\n Programa 4: bye...\n");
                break;
            }
        }
    }
}