public class Moto extends Vehiculo implements  Combustion {

    private int cilindrada;
    private String tipoMotor;

    public Moto() {
    }

    public Moto(int id, String placa, String marca, String modelo, int anho, double precio, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anho, precio);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String fechaVehiculo() {
        return super.fechaVehiculo();
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando gasolina...");
    }

    @Override
    public String toString() {
        return super.toString()
                +
                ", cilindrada=" + cilindrada +
                ", tipoMotor=" + tipoMotor ;
    }
}
