import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EventoUtils {

    public List<Evento> list;
    public Categoria categoria;

    public EventoUtils() {
        this.list = new ArrayList<>();
    }

    public void crearEvento(Evento evento) {
        if (evento != null) {
            list.add(evento);
            System.out.println("Evento "+evento.getNombre()+": creado correctamente.");
        } else {
            System.out.println("Evento no registrado o no valido.");
        }

    }

    public List<Evento> eventFecha(LocalDate fecha) {

        if (fecha != null && !list.isEmpty()) {
            List<Evento> eventoLIst = list.stream().filter(m -> m.getFecha().equals(fecha)).toList();


            if (eventoLIst.isEmpty()) {
                System.out.println("No se encontraron eventos con esa fecha.");
            } else {
                System.out.println("\nListando eventos por fecha "+fecha+": ");
                eventoLIst.forEach(System.out::println);
            }
            return eventoLIst;
        }

        return null;

    }

    public void eventoPorCategotia() {

        Map<Categoria, List<Evento>> collect = list.stream().collect(Collectors.groupingBy(Evento::getCategoria));
        System.out.println("Eventos ordenados por categoría: \n");

        // para poder imprimir cada grupo por separado
        collect.forEach((categoria, eventos) -> {
            System.out.println("Categoría: " + categoria);
            eventos.forEach(evento -> System.out.println("  - " + evento));
            System.out.println();
        });
    }


    public Optional<Evento> eventoProx(LocalDate fecha) {

        return list.stream().filter(m ->!m.getFecha().isBefore(fecha))
                .min(Comparator.comparing(Evento::getFecha));
    }
}
