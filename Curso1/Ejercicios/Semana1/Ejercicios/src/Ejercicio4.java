import java.util.Scanner;

public class Ejercicio4 {
    /*
    Ejercicio Nº 4 - Matrices
Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que represente,
un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:


Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").


Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2").
 El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.


Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.


A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.


El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.
    */
    private static final int FILAS = 5;
    private static final int Columnas = 5;
    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static String[][] asientos = new String[FILAS][Columnas];

    static Scanner scanner = new Scanner(System.in);

    public static void funMatriz() {
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                asientos[f][c] = VERDE+"0"+RESET;

            }
        }

        System.out.println("----PLAZAS DISPONIBLES------");
        asientos[1][2] = ROJO+"x"+RESET;
        asientos[2][3] = ROJO+"x"+RESET;
        asientos[4][2] = ROJO+"x"+RESET;

        // Mostrar la matriz
        for (String[] fila : asientos) {
            for (String valor : fila) {
                System.out.printf("%2s ", valor);
            }
            System.out.println();
        }

        int fil = 0;
        int colum = 0;
        System.out.println("\nIntroduce el asiento que quieres reservar.\n" +
                "Marca el numero de fila :");
        int fila = scanner.nextInt();
        System.out.println("ahora pon el numero de columna: ");
        int columna = scanner.nextInt();
        scanner.nextLine();  //  <---- salto de linea para que no falle scanner por usar un nextInt y seguidamennte un nextLine

        if (asientos[fila][columna] == VERDE+"0"+RESET) {
            System.out.println("Asiento disponible, quiere reservarlo?(si,no) ");
            String resp = scanner.nextLine();
            if (resp.equalsIgnoreCase("si")) {

                asientos[fila][columna] = ROJO+"X"+RESET;

                for (String[] fila1 : asientos) {
                    for (String valor : fila1) {
                        System.out.printf("%2s ", valor);
                    }
                    System.out.println();
                }

                System.out.println("Asiento reservado");

            } else {

                System.out.println("Gracias por su visita");
            }

        } else {
            System.out.println("Asiento no disponible, desea reservar otro?(si,no) ");
            String resp1 = scanner.nextLine();
            if (resp1.equalsIgnoreCase("si")) {
                System.out.println("Introduce el asiento que quieres reservar.\n" +
                        "Marca el numero de fila :");
                fil = scanner.nextInt();
                System.out.println("ahora pon el numero de columna: ");
                colum = scanner.nextInt();
                scanner.nextLine();

            }
            if (asientos[fil][colum] == VERDE+"0"+RESET) {
                System.out.println("Asiento disponible, quiere reservarlo?(si,no) ");
                String resp = scanner.nextLine();
                if (resp.equalsIgnoreCase("si")) {

                    asientos[fil][colum] =ROJO+ "X"+RESET;

                    for (String[] fila2 : asientos) {
                        for (String valor : fila2) {
                            System.out.printf("%2s ", valor);
                        }
                        System.out.println();
                    }
                    System.out.println("Asiento reservado");
                }
            } else {
                System.out.println("Gracias por su visita");

            }
        }
    }


    public static void main(String[] args) {

        funMatriz();
    }
}
