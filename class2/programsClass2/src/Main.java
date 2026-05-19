import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n\n\n Programas de la actividad 2: \n");

        // Buffer para la lectura de datos desde el teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int opc = 0;

        do {
            try{
                while(true){
                    System.out.println("\n Ejercicios en JAVA: \n");

                    System.out.println(" 1) Datos Primitivos ");
                    System.out.println(" 2) Uso de Wrappers ");
                    System.out.println(" 3) Condicionales ");
                    System.out.println(" 4) Bucles ");
                    System.out.println(" 5) Manejo de listas ");
                    System.out.println(" Salir (Cualquier caracter) ");

                    System.out.print("\n Ingrese una opción que se desea consultar: ");
                    input = br.readLine();
                    opc = Integer.parseInt(input);

                    if(opc >= 1 && opc <= 5){
                        break;
                    }

                    System.out.println(" Optó por salir... bye... \n");
                };

                System.out.println("\n");
                System.out.println("=================");
                System.out.println("\n");

                switch (opc) {
                    case 1:
                        datosPrimitivos program1 = new datosPrimitivos();
                        program1.menuProgram1();
                        program1 = null; // Eliminando objeto
                        break;

                    case 2:
                        wrappers program2 = new wrappers();
                        program2.menuProgram2();
                        program2 = null; // Eliminando objeto
                        break;

                    case 3:
                        condicionales program3 = new condicionales();
                        program3.menuProgram3();
                        program3 = null;
                        break;

                    /*case 4:
                        div(num1, num2);
                        break;

                    case 5:
                        break;*/

                    default:
                        System.out.println("Programa principal: bye...");
                        break;
                }
            } catch (Exception err) {
                //System.out.println("error: " + err.getMessage());
                System.out.println("Programa principal: bye...");
                break;
            }
        }while(true);
    }
}