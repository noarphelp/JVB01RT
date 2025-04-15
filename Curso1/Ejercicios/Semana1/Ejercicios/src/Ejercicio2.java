import java.util.Scanner;

public class Ejercicio2 {
    /*  Ejercicio Nº 2 - Estructuras Repetitivas
a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar.
 Luego, muestra el total de la compra que debe abonar.
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double total = 0.0;
        Integer opcion;

        do {
            System.out.println("Elija operacion deseada. \n" +
                    "opcion 1: introducir producto \n" +
                    "opcion 2: acabar compra y pagar ");
            System.out.println("--> ");
             opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Eligue un producto y introduzca su precio:\n" +
                        " 1 manzana: 2€\n"+
                        " 2 plantano: 1.23€\n"+
                        " 3 uvas: 3.51€\n"+
                        " 4 mandarina: 1.3€");
                System.out.println("--> ");
                Double producto = scanner.nextDouble();
                 total += producto;
            } else if (opcion > 2) {
                System.out.println("La opcion escogida no es valida, escoja 1 o 2");
            }
        } while (opcion != 2);
        if (total == 0.0) {
            System.out.println("Gracias por su visita.");
        } else {
            System.out.println("El precio final de su compra es: " + total + " €.\nGracias por su compra.");
        }





    }
}
