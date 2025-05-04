package org.example;

import java.util.Scanner;

            //Clase donde se encuentra el método menuClientes, es el menu principal el cual da opciones como crear,
            //actualizar,buscar o borrar clientes
public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    public static int opcion;

    public static void menuClientes() {
        System.out.println("**** BIENVENIDOS A LA APP DE CLIENTES ****\n");
        do {
            System.out.println("Ingrese una opción:\n" +
                    "1 - Crear cliente nuevo\n" +
                    "2 - Listar todos los clientes\n" +
                    "3 - Actualizar los datos de un cliente\n" +
                    "4 - Eliminar un cliente\n" +
                    "5 - Buscar clientes por ciudad\n" +
                    "0 - Salir");
            System.out.println("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Utiles.crearUsuario();
                    break;
                case 2:
                    Utiles.listarClientes();
                    break;
                case 3:
                    Utiles.updateClient();
                    break;
                case 4:
                    Utiles.deleteClient();
                    break;
                case 5:
                    Utiles.clientByCiudad();
                    break;
            }
            if (opcion >= 6){
                System.out.println("La opción escogida no es valida, escoja otra.");
            }

        } while (opcion != 0);
        System.out.println("Vuelva pronto!!. Saliendo de la app.....");
    }
}
