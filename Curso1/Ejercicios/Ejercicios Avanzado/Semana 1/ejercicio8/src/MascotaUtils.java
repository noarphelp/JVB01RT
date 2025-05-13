import java.util.*;

public class MascotaUtils<T extends Mascota> {
    private List<T> listado;

    public MascotaUtils() {
        this.listado = new ArrayList<>();
    }

    //Agregar Mascotas al Registro:
    public void agregar(T mascota) {

        if (mascota != null && listado != null) {
            listado.add(mascota);
            System.out.println("Mascota registrada correctamente");
        } else {
            System.out.println("No se a podido registrar mascota");
        }
    }

    //Buscar Mascotas por Nombre

    public void buscarNombre(String nombre) {
        Optional<T> mascota = listado.stream().
                filter(m -> m.getNombre().equalsIgnoreCase(nombre.trim()))
                .findAny();
        if (mascota.isPresent()) {
            System.out.println("La mascota encontrada por nombre: " + mascota.get());
        } else {

            System.out.println("Mascota no encontrada o nombre no valido.");
        }

    }

    //Buscar Mascotas por Especie:
    public void buscarEspecie(String especie) {
        Optional<T> mascota = listado.stream().
                filter(m -> m.getEspecie().equalsIgnoreCase(especie.trim()))
                .findAny();
        if (mascota.isPresent()) {
            System.out.println("La mascota encontrada por especie es: " + mascota.get());
        } else {

            System.out.println("Mascota no encontrada por especie o no valida.");
        }

    }
        //Contar cantidad de mascotas totales
    public void cantidadMascotas(){
        int cantidad = listado.size();
        System.out.println("La cantidad total de mascotas en lista es: "+cantidad);

    }

    public void agregarConRandom(){
        Random random = new Random();
        T mascota;

        String[] nombres ={"Paco","Maria","Leti","Luis"};
        int[] edades = {5,6,2,8,3,9};
        String[] especies  = {"Felina","Canina","Aves"};

        String nombre = nombres[random.nextInt(nombres.length)];
        int edad = edades[random.nextInt(edades.length)];
        String especie = especies[random.nextInt(especies.length)];
        int id = listado.size() +1;

        switch (especie) {
            case "Canina":
                String[] razas = {"Caniche", "Labrador", "Bulldog"};
                String raza = razas[random.nextInt(razas.length)];
                mascota = (T) new Perro(id, nombre, edad, especie, raza);
                break;

            case "Felina":
                String[] coloresPelo = {"Blanco", "Negro", "Gris"};
                String colorPelo = coloresPelo[random.nextInt(coloresPelo.length)];
                mascota = (T) new Gato(id, nombre, edad, especie, colorPelo);
                break;

            case "Aves":
                String[] coloresPico = {"Rojo", "Amarillo", "Naranja"};
                String colorPico = coloresPico[random.nextInt(coloresPico.length)];
                mascota = (T) new Ave(id, nombre, edad, especie, colorPico);
                break;

            default:
                System.out.println("Especie no reconocida.");
                return;
        }

        listado.add(mascota);
        System.out.println("Mascota aleatoria agregada: " + mascota);

    }
}
