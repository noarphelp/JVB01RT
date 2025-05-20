import entities.Vuelo;
import utils.FiltrosVuelo;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Main {


    public static void main(String[] args) {

        final LocalDate fechaInicio;
        final LocalDate fechaFin;

        List<Vuelo> listaVuelos = List.of(new Vuelo(UUID.randomUUID(), "I-1234M2-E", "Iberia", "Madrid",
                        "Valencia", LocalDate.of(2025, 1, 15), LocalDate.of(2025, 1, 20)),

                new Vuelo(UUID.randomUUID(), "V-2316M5-F", "Vueling", "Malaga",
                        "Venecia", LocalDate.of(2025, 2, 2), LocalDate.of(2025, 2, 7)),

                new Vuelo(UUID.randomUUID(), "A-8876M3-F", "Air Europa", "Barcelona",
                        "New York", LocalDate.of(2025, 2, 9), LocalDate.of(2025, 2, 15)),

                new Vuelo(UUID.randomUUID(), "I-2233M5-M", "Iberia", "Madrid",
                        "Roma", LocalDate.of(2025, 3, 12), LocalDate.of(2025, 3, 17)),

                new Vuelo(UUID.randomUUID(), "R-2546M5-M", "Ryanair", "Sevilla",
                        "Vigo", LocalDate.of(2025, 3, 22), LocalDate.of(2025, 3, 27)),

                new Vuelo(UUID.randomUUID(), "R-1221M1-A", "Ryanair", "Santiago Compostela",
                        "Valencia", LocalDate.of(2025, 4, 20), LocalDate.of(2025, 4, 28)),

                new Vuelo(UUID.randomUUID(), "L-2666M9-A", "Lufthansa", "Bilbao",
                        "Milan", LocalDate.of(2025, 4, 2), LocalDate.of(2025, 4, 7)),


                new Vuelo(UUID.randomUUID(), "A-2675M8-M", "Air Europa", "Valencia",
                        "Munich", LocalDate.of(2025, 5, 2), LocalDate.of(2025, 5, 12)),


                new Vuelo(UUID.randomUUID(), "L-1232M3-M", "Lufthansa", "Barcelona",
                        "Paris", LocalDate.of(2025, 5, 8), LocalDate.of(2025, 5, 13)),

                new Vuelo(UUID.randomUUID(), "E-2451N1-J", "EasyJet", "Oporto",
                        "Milan", LocalDate.of(2025, 6, 7), LocalDate.of(2025, 6, 15))

        );


        try {
            fechaInicio = LocalDate.of(2025, 2, 1);
            fechaFin = LocalDate.of(2025, 4, 27);
        } catch (DateTimeException e) {
            System.out.println("Fecha inválida detectada: " + e.getMessage());

            return;
        }
        //Listado de todos los vuelos al no ingresar parámetros de fecha
        //  FiltrosVuelo.listadoVuelos(listaVuelos,null,null);

        // Listado de vuelos con fecha solo de inicio en adelante.
        //  FiltrosVuelo.listadoVuelos(listaVuelos,fechaInicio,null);

        // Listado de vuelos con fecha solo de final y anteriores.
       //  FiltrosVuelo.listadoVuelos(listaVuelos, null, fechaFin);

        // Listado de vuelos con fecha comprendida entre fecha inicial y fecha final.
          FiltrosVuelo.listadoVuelos(listaVuelos, fechaInicio, fechaFin);


    }
}