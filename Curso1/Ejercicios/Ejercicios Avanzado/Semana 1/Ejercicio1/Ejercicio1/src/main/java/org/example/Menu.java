package org.example;

import org.example.controllers.ReservaController;
import org.example.entities.Reserva;
import org.example.entities.Vuelos;
import org.example.excepcion.ReservaInvalidaException;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    ReservaController reservaController = new ReservaController();
    Vuelos vuelos = new Vuelos();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        int opcion = -1;

        System.out.println(" ✈\uFE0F Bienvenidos a reservas de vuelo ✈\uFE0F \n");

        do {
            try {
                System.out.println("Ingrese la opción que desea hacer: \n" +
                        "1) Crear reserva \n" +
                        "2) Listar reservas \n" +
                        "0) Salir del programa");
                System.out.print("Opción: ");
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        crearReserva();
                        break;

                    case 2:
                        System.out.println("Listando reservas: ");
                        List<Reserva> list = reservaController.listar();
                        list.forEach(System.out::println);
                        System.out.println("Saliendo de listado...\n");
                        break;

                    case 0:
                        System.out.println("Saliendo... ¡BYE BYE!");
                        break;

                    default:
                        System.out.println("Opción inválida. Escoja un opción valida.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número válido.");
            } catch (ReservaInvalidaException e) {
                System.out.println("Error en la reserva: " + e.getMessage());
            }
        } while (opcion != 0);
    }

    private void crearReserva() throws ReservaInvalidaException{
        String nombre = "";
        String destino = "";
        LocalDate fecha = null;
        int numAsientos = 0;

        // Validar nombre
        boolean nombreValido = false;
        do {
            System.out.print("1) Nombre: ");
            nombre = scanner.nextLine();
            if (nombre.matches(".*[a-zA-Z]+.*")) {
                nombreValido = true;
            } else {
                System.out.println( "El nombre debe contener letras.");
            }
        } while (!nombreValido);

        // Validar destino
        boolean destinoValido = false;
        do {
            System.out.print("2) Destino: ");
            destino = scanner.nextLine();
            if (destino.matches(".*[a-zA-Z]+.*")) {
                destinoValido = true;
            } else {
                System.out.println("El destino debe contener letras.");
            }
        } while (!destinoValido);

        // Validar fecha
        boolean fechaValida = false;
        do {
            System.out.print("3) Fecha reserva (formato: yyyy-MM-dd): ");
            String inputFecha = scanner.nextLine();
            try {
                fecha = LocalDate.parse(inputFecha);
                fechaValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Formato fecha no valido,intentelo de nuevo.");
            }
        } while (!fechaValida);

        // Validar numero de asientos
        boolean asientosValidos = false;
        do {
            System.out.print("4) Número de asientos reservados: ");
            try {
                numAsientos = Integer.parseInt(scanner.nextLine());
                if (numAsientos > 0 && numAsientos <= vuelos.getPlazas()) {
                    asientosValidos = true;
                } else {
                    System.out.println("Número de asientos no valido o sin disponibilidad.");
                    System.out.println("Plazas disponibles: " + vuelos.getPlazas()+"\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número válido.");
            }
        } while (!asientosValidos);

        // Crear reserva
        Reserva reserva = new Reserva(nombre, destino, fecha, numAsientos);
        reservaController.createReserva(reserva);
        vuelos.setPlazas(vuelos.getPlazas() - numAsientos);

        System.out.println("Reserva creada con éxito.");
        System.out.println("Saliendo de reservas...\n");
    }

}


