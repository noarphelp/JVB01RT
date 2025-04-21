/*
* Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación (con sus métodos y constructores correspondientes).
*  Agregar también un método llamado saludar que emita un mensaje por pantalla que diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos:
a) Crear sus clases hijas que compartan sus atributos y métodos:
"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
b) Una vez creadas las clases, crear los siguientes métodos:
"Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".
"Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".
"Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".
c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.
d) Crear un objeto de tipo animal e intentar asignarle al Mamífero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?
E) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?
* */
public class Animal {
    private int id;
    private String nombre;
    private int edad;
    private  enum tipoPiel{SUAVE,ASPERA,ESCAMOSA,PELUDA,LISA,PLUMAS};
    private enum  tipoAlimentacion{HERBIVORO,CARNIVORO,OBNIVORO,INSECTIVORO}

    public Animal() {
    }

    public Animal(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola soy un animal ");
    };


    public static class  Mamifero extends Animal {

        private int numPatas;
        private String colorPelaje;
        private String habitat;
        private String tipoReproduccion;

        @Override
        public void saludar() {
            System.out.println("Hola soy un mamifero");
        }
    };

    public  static  class  Ave extends Animal {
        private double tamAlas;
        private String colorPlumaje;
        private String tipoVuelo;
        private String tipoPico;

        @Override
        public void saludar() {
            System.out.println("Hola soy un ave");
        }
    };

    public  static class Reptil extends Animal{
        private double longitud;
        private String tipoEscamas;
        private String tipoVeneno;
        private String habitat;

        @Override
        public void saludar() {
            System.out.println("Hola soy un reptil con tipo de piel: "+tipoPiel.ASPERA);
        }

    };


    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.saludar();

        Mamifero mamifero = new Mamifero();
        mamifero.saludar();

        Ave ave = new Ave();
        ave.saludar();

        Reptil reptil = new Reptil();
        reptil.saludar();

    }
}
