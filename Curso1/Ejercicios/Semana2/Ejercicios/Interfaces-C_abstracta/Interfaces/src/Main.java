public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto();
        auto.acelerar();
        auto.frenar();

        Pago pago = new Pago(TipoPago.EFECTIVO);
        pago.tipoDePago();

        Perro perro = new Perro();
        perro.sonido();

        Persona persona = new Persona();
        persona.imprimirDireccion("Manuel");
    }
}