public class Main {
    public static void main(String[] args) {




        InventarioAutos inventarioAutos = new InventarioAutos<>();

        inventarioAutos.agregarAuto(new Auto("Fiat","500",2010,23500.50));
        inventarioAutos.agregarAuto(new Auto("Kia","Ceed",2000,12400.0));
        inventarioAutos.agregarAuto(new Auto("Renault","Clio",1990,500.0));

            // Buscar auto por año
        inventarioAutos.buscarAno(2000);

        //Buscar auto por marca

        inventarioAutos.buscarMarca("fiat");

        // Sumar todos los precios de los autos en inventario

        inventarioAutos.calTotal();

    }
}