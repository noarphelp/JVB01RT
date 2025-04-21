import javax.annotation.processing.Generated;
import java.util.ArrayList;

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


    public static void main(String[] args) {

        //a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        Persona Luis = new Persona(23423424L, "Luis", 34, "Ordes", 666666666);
        Persona Mario = new Persona(39923145L, "Mario", 64, "Sigueiro", 666467666);
        Persona Maria = new Persona(23668712L, "Maria", 39, "Santiago", 784567234);
        Persona Nico = new Persona(67812345L, "Nico", 19, "Madrid", 543467890);
        Persona Laura = new Persona(25676532L, "Laura", 23, "Lugo", 445678912);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(Luis);
        personas.add(Laura);
        personas.add(Maria);
        personas.add(Mario);
        personas.add(Nico);

        for (Persona person : personas) {
            System.out.println("Nombre: " + person.getNombre() + ", edad: " + person.getEdad());
        }

        System.out.println("--despues de modicar nombres--");
        Luis.setNombre("Paco");
        Maria.setNombre("Estela");

        for (Persona person : personas) {
            System.out.println("Nombre: " + person.getNombre() + ", edad: " + person.getEdad());
        }

        System.out.println("--Solo mas de 30--");

        for (Persona person : personas) {
            if (person.getEdad() >= 30)
                System.out.println(person.getNombre().toUpperCase()+", eres mayor de "+person.getEdad()+", puedes pasar.");
        }

        System.out.println("---------------------------");


    }


}
