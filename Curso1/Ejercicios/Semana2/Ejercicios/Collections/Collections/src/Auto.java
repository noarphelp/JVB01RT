
public class Auto extends Vehiculo implements Electrico{
    private double capacidadBateria;
    private double autonomia;

    public Auto() {
    }

    public Auto(int id, String placa, String marca, String modelo, int anho, double precio, double capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, anho, precio);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public void cargarEnergia() {

        System.out.println("Cargando batería...");
    }

    @Override
    public String fechaVehiculo() {
        return super.fechaVehiculo();
    }


    @Override
    public String toString() {
        return super.toString()
                +
                ", capacidadBateria=" + capacidadBateria +
                ", autonomia=" + autonomia ;
    }
}
