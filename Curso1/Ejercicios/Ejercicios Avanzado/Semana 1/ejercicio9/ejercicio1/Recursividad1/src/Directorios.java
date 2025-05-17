import java.util.ArrayList;
import java.util.List;

public class Directorios {

    private int id ;
    private String nombre;
    private List<Directorios> subDirectorios;
    private List<String> archivos;

    public Directorios() {
        this.subDirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public Directorios(int id, String nombre, List<Directorios> subDirectorios, List<String> archivos) {
        this.id = id;
        this.nombre = nombre;
        this.subDirectorios = (subDirectorios != null) ? subDirectorios : new ArrayList<>();
        this.archivos = (archivos != null) ? archivos : new ArrayList<>();

    }

    public void anadirDirectorio(Directorios directorios){

            subDirectorios.add(directorios);
            System.out.println("Directorio añadido correctamente");
        

    }


    public void anadirArchivo(String archivo){
        if (archivo !=null){
            archivos.add(archivo);
            System.out.println("Archivo añadido correctamente");
        }else {
            System.out.println("No se a podido añadir archivo");
        }

    }

    public void leer(){
        subDirectorios.stream().forEach(System.out::println);
        archivos.stream().forEach(System.out::println);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorios> getSubDirectorios() {
        return subDirectorios;
    }

    public void setSubDirectorios(List<Directorios> subDirectorios) {
        this.subDirectorios = subDirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Directorios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", subDirectorios=" + subDirectorios +
                ", archivos=" + archivos +
                '}';
    }
}
