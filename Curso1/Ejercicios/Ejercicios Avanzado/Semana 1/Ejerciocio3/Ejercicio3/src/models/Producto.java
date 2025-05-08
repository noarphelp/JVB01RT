package models;

public class Producto <t>{

    private String name ;
    private String marca;
    private double precio;
    private boolean disponibilidad;

    public Producto() {
    }

    public Producto(String name, String marca, double precio, boolean disponibilidad) {
        this.name = name;
        this.marca = marca;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "models.Producto{" +
                "name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
