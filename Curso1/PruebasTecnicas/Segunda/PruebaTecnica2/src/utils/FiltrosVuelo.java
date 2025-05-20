package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrosVuelo {

    public static void listadoVuelos(List<Vuelo> list, LocalDate fechaIni, LocalDate fechaFin) {

        if (list == null)
            System.out.println("⚠\uFE0F Lista no valida o nula, introduce una correcta. ⚠\uFE0F");


        else if (fechaIni == null && fechaFin == null) {
            System.out.println("Listando todos lo vuelos... \n");
            list.forEach(System.out::println);

        } else if (fechaIni != null && fechaFin == null) {
            System.out.println("\n \uD83D\uDCC5 Listando todos lo vuelos con fecha de inicio " + fechaIni + " y posteriores: \uD83D\uDCC5 \n");
            list.stream().filter(e -> e.getFechaInicio().equals(fechaIni) || e.getFechaInicio().isAfter(fechaIni))
                    .forEach(System.out::println);


        } else if (fechaIni == null && fechaFin != null) {
            System.out.println("\n \uD83D\uDCC5 Listando todos lo vuelos con fecha final " + fechaFin + " y anteriores: \uD83D\uDCC5 \n");
            list.stream().filter(e -> e.getFechaFinal().equals(fechaFin) || e.getFechaFinal().isBefore(fechaFin))
                    .forEach(System.out::println);


        } else if (fechaIni != null && fechaFin != null) {
            System.out.println("\n \uD83D\uDCC5 Listando todos lo vuelos comprendidos entre fecha inicio " + fechaIni + " y fecha final "+fechaFin+" . \uD83D\uDCC5 \n");

             list.stream().filter(e -> (e.getFechaInicio().equals(fechaIni) || e.getFechaInicio().isAfter(fechaIni)) && (e.getFechaFinal().equals(fechaFin) || e.getFechaFinal().isBefore(fechaFin)))
                     .forEach(System.out::println);


        }


    }

}