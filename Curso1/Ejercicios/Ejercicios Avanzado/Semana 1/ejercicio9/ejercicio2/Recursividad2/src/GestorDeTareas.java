import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDeTareas {

    private final Scanner scanner = new Scanner(System.in);
    private final List<Tarea> tareasPrincipales = new ArrayList<>();

    public void iniciar() {
        System.out.println("Nombre de la tarea principal:");
        String nombre = scanner.nextLine();
        Tarea tarea = crearTareaConSubtareas(nombre);
        tareasPrincipales.add(tarea);
    }

    private Tarea crearTareaConSubtareas(String nombre) {
        Tarea tarea = new Tarea(nombre);

        while (true) {
            System.out.print("¿Agregar subtarea a '" + nombre + "'? (si/no): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                System.out.print("Nombre de la subtarea: ");
                String subNombre = scanner.nextLine();
                Tarea subtarea = crearTareaConSubtareas(subNombre);
                tarea.agregarSubTarea(subtarea);
            } else {
                break;
            }
        }

        return tarea;
    }

    public void mostrarTareas() {
        for (Tarea tarea : tareasPrincipales) {
            mostrarTareaRecursiva(tarea, 0);
        }
    }

    private void mostrarTareaRecursiva(Tarea tarea, int nivel) {
        System.out.println("  ".repeat(nivel) + "- " + tarea.getNombre());
        for (Tarea sub : tarea.getSubTareas()) {
            mostrarTareaRecursiva(sub, nivel + 1);
        }
    }
}
