/*
    Para programa 5:
    Implementación de listas
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
import java.util.stream.Collectors;

public class listas {

    // Para menu
    private String input;
    private int opc;
    BufferedReader br;
    private int num;

    List<String> alumnos = new ArrayList<>();
    LinkedList<String> cola = new LinkedList<>();
    List<Integer> numeros = new ArrayList<>(Arrays.asList(10, 3, 7, 1, 9, 4, 6));

    //Constructor
    public listas() {
        this.br = new BufferedReader(new InputStreamReader(System.in));

        // Cargando alumnos a mi lista
        this.alumnos.add("Ana");
        this.alumnos.add("Luis");
        this.alumnos.add("Sofía");
        this.alumnos.add("Carlos");
        this.alumnos.add(1, "Beatriz");
    }

    public void coleccionArrayList(){
        System.out.println("Lista     : " + alumnos);
        System.out.println("Tamaño    : " + alumnos.size());
        System.out.println("Índice 2  : " + alumnos.get(2));
        System.out.println("¿Luis?    : " + alumnos.contains("Luis"));

        alumnos.remove("Carlos");
        System.out.println("Sin Carlos: " + alumnos);

        System.out.println("\n Ordenado...");
        Collections.sort(alumnos);
        System.out.println("Ascendente: " + alumnos);
        Collections.sort(alumnos, Collections.reverseOrder());
        System.out.println("Descendente: " + alumnos);
    }

    public void coleccionLinkedList(){
        cola.offer("Ticket-001");
        cola.offer("Ticket-002");
        cola.offer("Ticket-003");
        System.out.println("Cola     : " + cola);
        System.out.println("poll()   : " + cola.poll());   // elimina primero
        System.out.println("peek()   : " + cola.peek());   // ve sin eliminar
        System.out.println("Cola fin : " + cola);
    }

    public void coleccionArrayListV2(){
        System.out.println("Original  : " + numeros);
        System.out.println("Máximo    : " + Collections.max(numeros));
        System.out.println("Mínimo    : " + Collections.min(numeros));
        Collections.shuffle(numeros);
        System.out.println("Shuffle   : " + numeros);
    }

    public void menuProgram5() throws IOException {
        while (true) {
            try {
                System.out.println("\n\n Programa 5: Listas. \n\n");

                System.out.println(" 1) List String: Ejemplo con lista de Alumnos");
                System.out.println(" 2) LinkedList String: Ejemplo de una Pilas/Colas");
                System.out.println(" 3) List Integer: Ejemplo con lista de Numeros");

                System.out.println(" Salir (Cualquier caracter) ");

                System.out.print("\n Ingrese una opción a realizar: ");
                input = br.readLine();
                opc = Integer.parseInt(input);

                if (opc < 1 || opc > 3) {
                    break;
                }

                System.out.println("\n");

                switch (opc) {
                    case 1:
                        coleccionArrayList();
                        break;

                    case 2:
                        coleccionLinkedList();
                        break;

                    case 3:
                        coleccionArrayListV2();
                        break;

                    default:
                        System.out.println("\n Programa 5: bye...\n");
                        break;
                }
            } catch (Exception err) {
                //System.out.println("error: " + err.getMessage());
                System.out.println("\n Programa 5: bye...\n");
                break;
            }
        }
    }

}