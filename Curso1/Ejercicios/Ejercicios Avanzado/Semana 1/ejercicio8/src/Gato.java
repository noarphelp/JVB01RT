public class Gato extends Mascota{
    private int id;
    private String nombre;
    private int edad;
    private String especie;
    private String colorPelo;

    public Gato() {
    }

    public Gato(int id, String nombre, int edad, String especie, String colorPelo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.colorPelo = colorPelo;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String getEspecie() {
        return especie;
    }

    @Override
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                ", colorPelo='" + colorPelo + '\'' +
                '}';
    }
}
