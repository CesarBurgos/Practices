/*
    Para programa 3:
    Uso de condicionales
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class condicionales {
    // Para menu
    private String input;
    private int opc;
    BufferedReader br;
    private int num;
    private double num2;
    String result;

    //Constructor
    public condicionales() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String determinarEdad(int edad) {
        if (edad < 0) {
            return "Edad inválida";
        } else if (edad < 13) {
            return "Niño";
        } else if (edad < 18) {
            return "Adolescente";
        } else if (edad < 65) {
            return "Adulto";
        } else if (edad > 65) {
            return "Adulto mayor (supongo)";
        }else{
            return "Desconcido";
        }
    }

    public String diaSemana(int nSemana) {
        switch (nSemana) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Día inválido";
        }
    }

    public void menuProgram3() throws IOException {
        while (true) {
            try {
                System.out.println("\n\n Programa 3: Condicionales. \n\n");

                System.out.println(" 1) Uso de if-else: Determinar edad");
                System.out.println(" 2) Uso switch: Determinar día de la semana");
                System.out.println(" 3) Operador Ternario: Determinar calificacion alumno");

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
                        while (true) {
                            try {
                                System.out.print(" Ingresa tu edad: ");
                                input = br.readLine();
                                num = Integer.parseInt(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                            } catch (Exception egrl) {
                                System.out.println(egrl.toString());
                            }
                        }

                        result = determinarEdad(num);
                        System.out.println("Eres un " + result);
                        break;

                    case 2:
                        while (true) {
                            try {
                                System.out.print(" Ingrese un día de la semana (numero): ");
                                input = br.readLine();
                                num = Integer.parseInt(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                            } catch (Exception egrl) {
                                System.out.println(egrl.toString());
                            }
                        }

                        result = diaSemana(num);
                        System.out.println("El día es " + result);
                        break;

                    case 3:
                        while (true) {
                            try {
                                System.out.print(" Ingrese una calificación: ");
                                input = br.readLine();
                                num2 = Double.parseDouble(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("\n Error, no ha ingresado un numero: " + e.toString() + "\n");
                            } catch (Exception egrl) {
                                System.out.println(egrl.toString());
                            }
                        }

                        String resultado = (num2 >= 6.0) ? "Aprobado" : "Reprobado";
                        System.out.println("\n Nota " + num2 + " → " + resultado);
                        break;

                    default:
                        System.out.println("\n Programa 3: bye...\n");
                        break;
                }
            } catch (Exception err) {
                //System.out.println("error: " + err.getMessage());
                break;
            }
        }
    }
}