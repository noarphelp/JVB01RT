package org.example;

import org.example.controllers.ClienteController;
import org.example.entities.Cliente;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

            //Clase donde se encuentran todos los métodos usados en el menu principal, en ellos se encuentra toda la lógica para cada proceso, como crear,
            //actualizar,buscar y borrar clientes.
public class Utiles {

    public static final ClienteController controller = new ClienteController();
    public static Scanner scanner = new Scanner(System.in);
    public static LocalDate fechaNacimiento = null;
    public static String email;
    public static Long numTelf = 0L;
    public static Boolean valor = false;
    public static Boolean valorTel = false;
    public static boolean valorEmail = false;
    public static boolean valorEmail2 = false;
    public static boolean valorUpdate = false;
    public static boolean centinel = false;
    public static boolean centinelCase = false;
    public static String sino;

    public static void crearUsuario() {

        System.out.println("Introduce los datos del cliente: \n" +
                "1)Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("2)Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.println("3)Sexo (FEMENINO,MASCULINO o OTROS): ");
        String sexo = scanner.nextLine();
        System.out.println("4)Ciudad: ");
        String ciudad = scanner.nextLine();
        do {
            System.out.println("5)Fecha nacimiento (formato: yyyy-MM-dd):");
            String input = scanner.nextLine();
            try {
                fechaNacimiento = LocalDate.parse(input);
                centinel = true;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha inválida. Intentelo nuevamente.");
            }
        } while (!centinel);

        while (!valor) {
            System.out.println("6)Telefono :");
            String telef = scanner.nextLine();

            if (telef.matches("\\d+")) {
                numTelf = Long.parseLong(telef);
                valor = true;
            } else {
                System.out.println("El telefono tiene que ser solo numeros");
            }
        }

        while (!valorEmail) {
            System.out.println("7)Email: ");
            email = scanner.nextLine();
            if (email.contains("@")) {
                valorEmail = true;
            } else {
                System.out.println("La direccion de correo debe contener un @ ");
            }

        }

        Cliente cliente = new Cliente(nombre, apellidos, sexo, ciudad, fechaNacimiento, numTelf, email);
        try {
            controller.create(cliente);
            System.out.println("Cliente registrado con exito ");
        } catch (Exception e) {
            System.out.println("Error al guardar el cliente en la base de datos: " + e.getMessage());
        }
        System.out.println("Saliendo de registro de cliente......\n");
    }

    public static void listarClientes() {

        try {
            List<Cliente> list = controller.findAll();
            System.out.println("\n Listando todos los clientes: ");

            for (Cliente clien : list) {
                System.out.println(clien);
            }
        } catch (Exception e) {
            System.out.println("A ocurrido un problema al listar todos los clientes..." + e.getMessage());
        }
        System.out.println("Saliendo del listado de clientes...\n");
    }

    public static void updateClient() {

        System.out.println("\nIntroduzca el ID del cliente a actualizar: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        Cliente cliente = controller.findById(id);

        if (cliente == null) {
            System.out.println("Cliente no encontrado con ID: " + id+"\n");
            System.out.println("Saliendo de actualizar... \n");

            return;
        }

        boolean centinel = true;

        while (centinel) {
            System.out.println("\nCliente actual: " + cliente);
            System.out.println("¿Qué campo desea actualizar?");
            System.out.println("1. Nombre");
            System.out.println("2. Apellidos");
            System.out.println("3. Sexo");
            System.out.println("4. Ciudad");
            System.out.println("5. Fecha de nacimiento");
            System.out.println("6. Teléfono");
            System.out.println("7. Email");
            System.out.println("8. Finalizar actualización");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nuevo nombre: ");
                    cliente.setNombre(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Nuevos apellidos: ");
                    cliente.setApellidos(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Nuevo sexo: ");
                    cliente.setSexo(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Nueva ciudad: ");
                    cliente.setCiudad(scanner.nextLine());
                    break;
                case 5:
                    do {
                        System.out.println("Nueva fecha de nacimiento (formato: yyyy-MM-dd):");
                        String input = scanner.nextLine();
                        try {
                            fechaNacimiento = LocalDate.parse(input);
                            cliente.setFechaNacimiento(fechaNacimiento);
                            centinelCase = true;
                        } catch (DateTimeParseException e) {
                            System.out.println("Fecha inválida. Intentelo nuevamente.");
                        }
                    } while (!centinelCase);
                    break;
                case 6:
                    while (!valorTel) {
                        System.out.println("Nuevo telefono :");
                        String telef = scanner.nextLine();

                        if (telef.matches("\\d+")) {
                            numTelf = Long.parseLong(telef);
                            cliente.setTelefono(numTelf);
                            valorTel = true;
                        } else {
                            System.out.println("El telefono tiene que ser solo numeros");
                        }
                    }
                    break;
                case 7:
                    while (!valorEmail2) {
                        System.out.println("Nuevo email: ");
                        email = scanner.nextLine();
                        if (email.contains("@")) {
                            cliente.setEmail(email);
                            valorEmail2 = true;
                        } else {
                            System.out.println("La direccion de correo debe contener un @ ");
                        }
                    }
                    break;
                case 8:
                    centinel = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        try {
            controller.update(cliente);
            System.out.println("Cliente actualizado correctamente.");
            System.out.println("Saliendo de actualizar cliente...\n");
        } catch (Exception e) {
            System.out.println("Error al actualizar el cliente: " + e.getMessage());
        }


    }

    public static void deleteClient() {
        System.out.println("\nIntroduzca el ID del cliente a eliminar: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        Cliente cliente = controller.findById(id);

        if (cliente == null) {
            System.out.println("Cliente no encontrado con ID: " + id);
            System.out.println("Saliendo de opción eliminar cliente... \n");
            return;
        }

        System.out.println("Cliente encontrado : " + cliente.getNombre() + " " + cliente.getApellidos() + "\n");
        System.out.println("Seguro que quieres borrar el cliente? (Si o No)");
        String respuest = scanner.nextLine();

        if (respuest.equalsIgnoreCase("Si")) {
            try {
                controller.delete(cliente);
                System.out.println("Cliente borrado con exito. ");
                System.out.println("Saliendo de opción eliminar cliente... \n");

            } catch (Exception e) {
                System.out.println("No se a podido borrar cliente. " + e.getMessage());
            }
        } else {
            System.out.println("Saliendo de opción borrar cliente...");
        }
    }

    public static void clientByCiudad() {
        do {


            System.out.println("\nIntroduzca la ciudad deseada para poder ver que clientes existen en esa ciudad: ");
            String ciudad = scanner.nextLine();

            try {
                System.out.println("Lista de clientes encontrados por ciudad elegida (" + ciudad + "):\n");
                controller.findByCiudad(ciudad);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("\nQuieres volver a buscar por otra ciudad ? (Si o no):");
                sino = scanner.nextLine();

            }

        } while (sino.equalsIgnoreCase("si"));

    }
}
