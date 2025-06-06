/*
* Ejercicio Nº 1 - Clases y Objetos
Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos:
*  cod, marca, modelo, consumo y color.
Luego, realiza las siguientes acciones:
a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
* */
public class Electrodomestico {

    private int cod;
    private String marca;
    private String modelo;
    private double consumo;
    private String color;

    public Electrodomestico() {
    }

    public Electrodomestico(int cod, String marca, String modelo, double consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "cod=" + cod +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //objeto sin constructor
        Electrodomestico electrodomestico = new Electrodomestico();

        //Al querer obtener la marca del objeto sin parametros da como resultado null pues esta iniciado sin valores.
        System.out.println(electrodomestico.getMarca());
        System.out.println("---------------------------");

        //objeto con contructores

        Electrodomestico vitro = new Electrodomestico(22345, "LG", "V5", 20.5, "Negro");
        Electrodomestico micro = new Electrodomestico(13354, "Balay", "future", 80.3, "Gris");
        Electrodomestico lavavajillas = new Electrodomestico(88675, "LG", "v54", 30, "Blanco");

        System.out.println("La marca de la vitro es " + vitro.getMarca() + ", el modelo " + vitro.getModelo() + ", y el consumo " + vitro.getConsumo());
        System.out.println("La marca del micro es " + micro.getMarca() + ", el modelo " + micro.getModelo() + ", y el consumo " + micro.getConsumo());
        System.out.println("La marca del lavavajillas es " + lavavajillas.getMarca() + ", el modelo " + lavavajillas.getModelo() + ", y el consumo " + lavavajillas.getConsumo());

        System.out.println(vitro); //<----- imprime valores con metodo toString
    }
}
