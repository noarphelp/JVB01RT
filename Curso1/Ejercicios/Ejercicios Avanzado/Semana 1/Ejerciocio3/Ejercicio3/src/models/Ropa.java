package models;

<<<<<<< HEAD
public class Ropa extends Producto{
=======
public class Ropa <T extends Producto>{
>>>>>>> 8bd8fee (añadido ejercicios)

    private String name ;
    private String marca;
    private double precio;
    private boolean disponibilidad;
    private String talla;

    public Ropa() {
    }

    public Ropa(String name, String marca, double precio, boolean disponibilidad, String talla) {
        this.name = name;
        this.marca = marca;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.talla = talla;
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

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", disponibilidad=" + disponibilidad +
                ", talla='" + talla + '\'' +
                '}';
    }
}
