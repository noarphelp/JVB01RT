public class Auto {

    private String marca;
    private String modelo;
    private int anho;
    private double precio;

    public Auto() {
    }

    public Auto(String marca, String modelo, int anho, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return
                "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Año: " + anho +
                ", Precio: " + precio ;
    }
}
