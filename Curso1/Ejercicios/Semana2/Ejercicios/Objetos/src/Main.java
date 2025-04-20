import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //objeto sin constructor
        Electrodomestico electrodomestico = new Electrodomestico();

        //Al querer obtener la marca del objeto sin parametros da como resultado null pues esta iniciado sin valores.
        System.out.println(electrodomestico.getMarca());
        System.out.println("---------------------------");

        //objeto con contructores

        Electrodomestico vitro = new Electrodomestico(22345, "LG", "V5", 20.5, "Negro");
        Electrodomestico micro = new Electrodomestico(13354, "Balay", "future", 80.3, "Gris");
        Electrodomestico lavavajillas = new Electrodomestico(88675, "LG", "v54", 30, "Blanco");

        System.out.println("La marca de la vitro es " + vitro.getMarca() + ", el modelo " + vitro.getModelo() + ", y el color " + vitro.getColor());
        System.out.println("La marca del micro es " + micro.getMarca() + ", el modelo " + micro.getModelo() + ", y el color " + micro.getColor());
        System.out.println("La marca del lavavajillas es " + lavavajillas.getMarca() + ", el modelo " + lavavajillas.getModelo() + ", y el color " + lavavajillas.getColor());

        System.out.println("---------------------------");

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