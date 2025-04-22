public class Pago {
    private TipoPago tipoPago;

    public Pago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void tipoDePago(){
        System.out.println("tipo de pago escogido: "+tipoPago.name());
    }


}
