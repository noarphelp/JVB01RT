import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directorios direct = new Directorios();
        direct.setNombre("Raíz");

        Directorios fotos = new Directorios(1, "fotos",
                List.of(new Directorios(2, "2025", null, List.of("Examen.txt", "ReciboTelefono.txt"))), List.of("Verano.jpg", "Invierno.jpg", "Primavera.jpg"));

        Directorios musica = new Directorios(3, "Musica",
                List.of(new Directorios(4, "Rock", List.of(new Directorios(1, "Americano", null, null)), List.of("Letras canciones.txt"))), List.of("Grupos.txt"));

        Directorios estudios = new Directorios(5, "2ºESO ",
                List.of(new Directorios(6, "3ºTrimestre", null, List.of("Examen3.txt"))), List.of("Compañeros.jpg", "Examen1.txt", "Examen2.txt"));


        direct.anadirDirectorio(fotos);
        direct.anadirDirectorio(musica);
        direct.anadirDirectorio(estudios);

        System.out.println("---------------");


        ExploradorDirectorios explorador = new ExploradorDirectorios();
        System.out.println("Explorando sistema de archivos:\n");
        explorador.recorrerDirectorios(direct, "");
    }


}