import java.time.LocalDate;
import java.util.Date;

public abstract class Vehiculo {

    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int anho;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(int id, String placa, String marca, String modelo, int anho, double precio) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.precio = precio;
    }

    public String fechaVehiculo(){
        int actual = LocalDate.now().getYear();
        int result = actual - anho;
        return "Tu vehiculo tiene "+result+" años.";
    };

    @Override
    public String toString() {
        return
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + anho +
                ", precio=" + precio ;
    }
}
