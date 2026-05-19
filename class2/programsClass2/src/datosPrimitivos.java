/*
    Para programa 1:
    Desarrollar un programa se vea el uso de datos primitivos
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Clase Datos Primitivos
public class datosPrimitivos {

    // Varibles (atributos)

    // Enteros
    private byte   edad;
    private short  anio;
    private int    poblacionCDMX;
    private long   distanciaLuna;

    // Decimales
    private float  tempCelsius;
    private double valorPI;

    // Texto
    char letra;

    // Logica
    boolean band;

    // Para menu
    private String input;
    private int opc;
    BufferedReader br;


    // --- Constructor
    public datosPrimitivos() {
        this.edad = 27;
        this.anio = 2026;
        this.poblacionCDMX   = 9209944;
        this.distanciaLuna   = 38440000000L;
        this.tempCelsius = 26.5f;
        this.valorPI = 3.141592653589793;
        this.letra = 'C';
        this.band = true;
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void consultDatosPrimitivos(){
        System.out.println("\n\n Opción 1) \n");

        System.out.println("byte   → Mi edad son: " + edad + " años ");
        System.out.println("short  → El año actual es: " + anio);
        System.out.println("int    → La población en CDMX es de: " + poblacionCDMX + " habitantes ");
        System.out.println("long   → La distancia de la tierra a la Luna es de: " + distanciaLuna + " cm");
        System.out.println("float  → El día de hoy estamos a: " + tempCelsius + " °C ");
        System.out.println("double → El valor más preciso de PI es: " + valorPI);
        System.out.println("char   → La inicial de mi nombre es: " + letra);
        System.out.println("boolean → Actualmente mi bandera esta en: " + band);
    }

    public void ejemploAritmetica(){
        System.out.println("\n\n Opción 2) \n");

        int suma  = poblacionCDMX + 500000;
        double area = valorPI * 5.0 * 5.0;

        System.out.println(" Población de CDMX + 500,000 = " + suma);
        System.out.printf(" Área de circulo con un radio de 5 (r=5): %.4f %n", area);
    }

    public void menuProgram1() throws IOException {
        while(true) {
            try {
                System.out.println("\n\n Programa 1: Datos Primitivos. \n\n");

                System.out.println(" 1) Consultar Datos Primitivos de la clase");
                System.out.println(" 2) Ejemplo de operaciones con Datos Primitivos");
                System.out.println(" Salir (Cualquier caracter) ");

                System.out.print("\n Ingrese una opción a realizar: ");
                input = br.readLine();
                opc = Integer.parseInt(input);

                if (opc < 1 || opc > 2) {
                    break;
                }

                switch (opc) {
                    case 1:
                        consultDatosPrimitivos();
                        break;

                    case 2:
                        ejemploAritmetica();
                        break;

                    default:
                        System.out.println("\n Programa 1: bye...\n");
                        break;
                }
            }catch (Exception err) {
                //System.out.println("error: " + err.getMessage());
                break;
            }
        }
    }
}