<<<<<<< HEAD
import excepciones.MyExcepcion;
import models.Electricos;
import models.Producto;
import models.Ropa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws MyExcepcion {

        Utils<Producto> inventario = new Utils<>();

        inventario.agregarPro(new Electricos("Tele","LG",300.50,true,220));
        inventario.agregarPro(new Electricos("Lavadora","Samsung",630.0,false,220));
        inventario.agregarPro(new Ropa("Pantalon","Levis",120.5,true,"Xl"));
        inventario.agregarPro(new Ropa("Camisa","Nike",40.5,false,"L"));
        System.out.println("-----------------------");

       // inventario.mostrarPro();

      /*  try {
            System.out.println("Datos de reserva por indice, introducelo: ");

            int indice = new Scanner(System.in).nextInt();
            System.out.println();

            inventario.GetIndice(indice);

        } catch (MyExcepcion e) {
            System.err.println("Error encontrado: "+e.getMessage());
        }*/

=======
public class Main {
    public static void main(String[] args) {
>>>>>>> 8bd8fee (añadido ejercicios)

    }
}