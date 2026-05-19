/*
    Para programa 2:
    Desarrollar un programa que realice el uso de wrappers
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;

public class wrappers {
    // Integer
    Integer entero;

    // Double
    Double decimal;

    // Boolean
    Boolean bandera;

    // Character
    Character letra;

    // Long y Short
    Long  grande;
    Short pequeno;

    // Autoboxing / Unboxing
    Integer boxed;// autoboxing

    // UUID — Identificador único universal
    UUID id1;
    UUID id2;

    // Para menu
    private String input;
    private int opc;
    BufferedReader br;

    //Constructor
    public wrappers() {
        // Integer
        this.entero = Integer.valueOf(42);

        // Double
        this.decimal = Double.valueOf(3.14);

        // Boolean
        this.bandera = Boolean.valueOf("true");

        // Character
        this.letra = 'A';

        // Long y Short
        this.grande = Long.MAX_VALUE;
        this.pequeno = Short.MIN_VALUE;

        // UUID — Identificador único universal
        this.id1 = UUID.randomUUID();
        this.id2 = UUID.fromString("550e8400-e29b-41d4-a716-446655440000");
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void consultWrapper() {
        System.out.println("\n\n Opción 1) \n");

        System.out.println("Short → "+ pequeno);
        System.out.println("Integer → " + entero);
        System.out.println("Long → " + grande);
        System.out.println("Double → " + decimal);
        System.out.println("Character → " + letra);
        System.out.println("Boolean → " + bandera);
        System.out.println("UUID → " + id1);
    }

    public void metodosWrapper() {
        System.out.println("\n\n Opçión 2) \n");

        System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE);
        System.out.println("Integer.toBinary(42) : " + Integer.toBinaryString(42));
        System.out.println("Integer.parseInt : " + Integer.parseInt("100"));

        System.out.println("Double.isNaN : " + Double.isNaN(decimal));
        System.out.println("Double.isInfinite : " + Double.isInfinite(1.0 / 0.0));

        System.out.println("Character.isLetter : " + Character.isLetter(letra));
        System.out.println("Character.toLowerCase : "+ Character.toLowerCase(letra));

        System.out.println("Boolean.toString : " + Boolean.toString(bandera));

        System.out.println("Long.MAX_VALUE : " + Long.MAX_VALUE);

        System.out.println("UUID aleatorio  : " + id1);
        System.out.println("UUID fijo       : " + id2);
        System.out.println("UUID.version (id1) : " + id1.version());
        System.out.println("Variante (id1) : " + id1.variant());
        System.out.println("¿Son iguales?   : " + id1.equals(id2));
    }

    public void menuProgram2() throws IOException {
        while(true) {
            try {
                System.out.println("\n\n Programa 2: Wrappers. \n\n");

                System.out.println(" 1) Consultar Wrappers");
                System.out.println(" 2) Métodos útiles de Wrappers");
                System.out.println(" Salir (Cualquier caracter) ");

                System.out.print("\n Ingrese una opción a realizar: ");
                input = br.readLine();
                opc = Integer.parseInt(input);

                if (opc < 1 || opc > 2) {
                    break;
                }

                switch (opc) {
                    case 1:
                        consultWrapper();
                        break;

                    case 2:
                        metodosWrapper();
                        break;

                    default:
                        System.out.println("\n Programa 2: bye...\n");
                        break;
                }
            }catch (Exception err) {
                //System.out.println("error: " + err.getMessage());
                break;
            }
        }
    }
}