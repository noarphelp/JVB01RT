import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MascotaUtils mascotaUtils = new MascotaUtils<>();

        mascotaUtils.agregar(new Perro(1,"Chuky",3,"Canina","BullDog"));
        mascotaUtils.agregar(new Perro(2,"Musky",1,"Canina","Pastor Aleman"));
        mascotaUtils.agregar(new Gato(3,"Michi",5,"Felina","Marron"));
        mascotaUtils.agregar(new Gato(4,"Caqui",3,"Felina","Negro"));
        mascotaUtils.agregar(new Ave(5,"Silva",6,"Gorrión","Amarillo"));
        mascotaUtils.agregar(new Ave(6,"Carlos",10,"Canario","negro"));

        System.out.println("------------------");

        //Buscar por nombre
        mascotaUtils.buscarNombre("carlos");
        System.out.println("------------------");

        //Buscar por especie
        mascotaUtils.buscarEspecie("gorrión");
        System.out.println("------------------");

        // cantidad total de mascotas
        mascotaUtils.cantidadMascotas();
        System.out.println("------------------");

        //Agregar mascotas random
        for (int i = 0; i <3 ; i++) {
            mascotaUtils.agregarConRandom();
        }



    }
}