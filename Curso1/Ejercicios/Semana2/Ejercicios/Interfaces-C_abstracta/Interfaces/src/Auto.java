public class Auto implements Vehiculo{
    @Override
    public void acelerar() {
        System.out.println("coche acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("coche frenando...");
    }
}
