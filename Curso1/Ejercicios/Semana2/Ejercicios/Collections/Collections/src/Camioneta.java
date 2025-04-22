public class Camioneta extends Vehiculo implements Combustion{

    private double capacidadTanque;
    private double consumoCombutible;

    public Camioneta() {
    }

    public Camioneta(int id, String placa, String marca, String modelo, int anho, double precio, double capacidadTanque, double consumoCombutible) {
        super(id, placa, marca, modelo, anho, precio);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombutible = consumoCombutible;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombutible() {
        return consumoCombutible;
    }

    public void setConsumoCombutible(double consumoCombutible) {
        this.consumoCombutible = consumoCombutible;
    }

    @Override
    public String fechaVehiculo() {
        return super.fechaVehiculo();
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Repostando gasolina...");
    }

    @Override
    public String toString() {
        return super.toString()
                +
                ", capacidadTanque=" + capacidadTanque +
                ", consumoCombustible=" + consumoCombutible ;
    }
}
