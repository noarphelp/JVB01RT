import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

       EventoUtils eventoUtils = new EventoUtils();

       eventoUtils.crearEvento(new Evento("Arreglo coche",LocalDate.of(2025,7,2),Categoria.TALLER));
        eventoUtils.crearEvento(new Evento("Arreglo moto",LocalDate.of(2025,4,2),Categoria.TALLER));
        eventoUtils.crearEvento(new Evento("trabajo",LocalDate.of(2025,6,12),Categoria.REUNION));
        eventoUtils.crearEvento(new Evento("Animales",LocalDate.of(2025,11,12),Categoria.CONFERENCIA));
        eventoUtils.crearEvento(new Evento("Animales exóticos",LocalDate.of(2025,8,2),Categoria.CONFERENCIA));

        System.out.println("-------------------");

        // Encontrar evento por fecha
        LocalDate fecha = LocalDate.parse("2025-04-02");
        eventoUtils.eventFecha(fecha);

        System.out.println("-------------------");

        //Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría

        eventoUtils.eventoPorCategotia();
        System.out.println("-------------------");

        //Encuentra el evento más próximo en el tiempo utilizando Optionals

        LocalDate fechaPorx = LocalDate.parse("2025-06-28");
       
        System.out.print("El evento mas proximo por fecha ingresada es: ");

        eventoUtils.eventoProx(fechaPorx).ifPresent(System.out::println);

    }
}