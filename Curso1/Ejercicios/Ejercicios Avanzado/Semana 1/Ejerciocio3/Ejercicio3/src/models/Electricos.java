package models;

public class Electricos extends Producto{

    private String name ;
    private String marca;
    private double precio;
    private boolean disponibilidad;
    private int voltaje;

    public Electricos() {
    }

    public Electricos(String name, String marca, double precio, boolean disponibilidad, int voltaje) {
        this.name = name;
        this.marca = marca;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.voltaje = voltaje;
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

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public String toString() {
        return "Electricos{" +
                "name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", disponibilidad=" + disponibilidad +
                ", voltaje=" + voltaje +
                '}';
    }
}
