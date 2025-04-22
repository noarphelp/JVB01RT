import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Vehiculo coche = new Auto(22345, "2344JDD", "Opel", "Corsa", 2014, 23000, 304.50, 23);
        Vehiculo camioneta = new Camioneta(56678, "1234HDD", "Fiat", "Ducato", 2000, 6500, 65, 10.4);
        Vehiculo moto = new Moto(22365, "2134FDJ", "Aprilia", "RS125", 2021, 8940, 125, "Monocilíndrico");

        ArrayList<Vehiculo> list = new ArrayList<>();
        list.add(coche);
        list.add(camioneta);
        list.add(moto);

        System.out.println(coche.fechaVehiculo());
        System.out.println(camioneta.fechaVehiculo());
        System.out.println(moto.fechaVehiculo());

        for (Vehiculo vehiculo: list){

            System.out.println(vehiculo);
        }


    }
}