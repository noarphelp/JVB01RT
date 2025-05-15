import java.time.LocalDate;

public class Evento {

    private String nombre;
    private LocalDate fecha;
    private Categoria categoria;

    public Evento() {
    }

    public Evento(String nombre, LocalDate fecha, Categoria categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre +
                ", Fecha: " + fecha +
                ", Categoria: " + categoria ;
    }
}
