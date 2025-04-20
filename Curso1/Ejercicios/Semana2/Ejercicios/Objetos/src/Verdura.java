import java.util.ArrayList;

/*
* Trabajando en equipos de 2 o 3 integrantes, deberán crear una clase llamada Verdura, que tenga los siguientes atributos: id, nombre, color, calorías,
*  debeCocinarse (tener en cuenta todos sus atributos, constructores, métodos getters y setters).
Luego, realiza las siguientes acciones:
a) Crear un vector (array) de tipo Verdura que pueda almacenar 5 verduras. Crear 5 verduras y guardarlas en el vector.
b) Recorrer el vector creado y mostrar por pantalla el nombre y las calorías de las verduras almacenadas.
c) Cambiar todos los datos de dos verduras. Mostrar por pantalla los datos de todas las verduras luego del cambio.
d) Recorrer el vector y mostrar por pantalla únicamente a las verduras que sean de color verde.
* */
public class Verdura {
    private int id;
    private String nombre;
    private String color;
    private double calorias;

    public Verdura() {
    }

    public Verdura(int id, String nombre, String color, double calorias) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public static void main(String[] args) {

        Verdura verdura1 = new Verdura(2345,"Coliflor","Blanca",123.4);
        Verdura verdura2 = new Verdura(5467,"Espinaca","Verde",110);
        Verdura verdura3 = new Verdura(8723,"Brocoli","Verde",189);
        Verdura verdura4 = new Verdura(2123,"Tomate","Rojo",90.3);
        Verdura verdura5 = new Verdura(1123,"Zanahoria","Naranja",156.8);

        ArrayList<Verdura>listVerduras = new ArrayList<>();
        listVerduras.add(verdura1);
        listVerduras.add(verdura2);
        listVerduras.add(verdura3);
        listVerduras.add(verdura4);
        listVerduras.add(verdura5);

        for (Verdura ver : listVerduras){
            System.out.println("La verdura "+ver.nombre+", tiene "+ver.calorias+" calorias.");
        }

        System.out.println("--cambio de dos verudras--");

        verdura1.setNombre("Puerro");
        verdura1.setCalorias(120);
        verdura1.setColor("blanco");
        verdura1.setId(2314);

        verdura2.setNombre("Grelos");
        verdura2.setCalorias(60);
        verdura2.setColor("Verde");
        verdura2.setId(2059);


        for (Verdura ver : listVerduras){
            System.out.println("La verdura "+ver.nombre+", tiene "+ver.calorias+" calorias y de color "+ver.getColor());
        }

        System.out.println("--Solo mas de 30--");

        for (Verdura ver : listVerduras) {
            if (ver.getColor().equalsIgnoreCase("Verde"))
                System.out.println("La verdura "+ver.nombre+", tiene "+ver.calorias+" calorias y de color "+ver.getColor());
        }

    }
}
