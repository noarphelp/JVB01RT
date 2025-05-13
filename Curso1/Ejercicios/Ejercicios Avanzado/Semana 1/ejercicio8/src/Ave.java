public class Ave extends Mascota {
    private int id;
    private String nombre;
    private int edad;
    private String especie;
    private String colorPico;

    public Ave() {
    }

    public Ave(int id, String nombre, int edad, String especie, String colorPico) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.colorPico = colorPico;
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

    public String getColorPico() {
        return colorPico;
    }

    public void setColorPico(String colorPico) {
        this.colorPico = colorPico;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                ", colorPico='" + colorPico + '\'' +
                '}';
    }
}
