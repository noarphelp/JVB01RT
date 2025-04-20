import javax.annotation.processing.Generated;

/*
* Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono
* (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas,
*  cuyos nombres fueron cambiados.
d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
* */
public class Persona {

    private Long id ;
    private String nombre;
    private int edad;
    private String direccion;
    private int numTelefono;

    public Persona() {
    }

    public Persona(Long id, String nombre, int edad, String direccion, int numTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
}
