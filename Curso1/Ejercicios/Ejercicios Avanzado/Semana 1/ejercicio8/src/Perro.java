public class Perro extends Mascota{

    private int id;
    private String nombre;
    private int edad;
    private String especie;
    private String raza;

    public Perro() {
    }

    public Perro(int id, String nombre, int edad, String especie, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.raza = raza;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
