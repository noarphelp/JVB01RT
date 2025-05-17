import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea {

    private String nombre;
    private List<Tarea> subTareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subTareas = new ArrayList<>();
    }

    public void agregarSubTarea(Tarea subTarea) {
        subTareas.add(subTarea);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Tarea> getSubTareas() {
        return subTareas;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
