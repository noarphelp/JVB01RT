import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Producto telefono = new Producto(2212,"12ProMax","Iphone","Mobil",1000,1500,23);
        Producto telefono2 = new Producto(2567,"Galaxy20","Samsung","Mobil",800,1250.60,11);
        Producto portatil = new Producto(4256,"Macbook","Appel","Ordenador",1780,2500,5);
        Producto portatil2 = new Producto(4996,"GamingPro","Msi","Ordenador",1500,2100,3);
        Producto auriculares = new Producto(3312,"Airpod","Apple","Auriculares",100,150,12);
        Producto auriculares2 = new Producto(3452,"Future3","Oppo","Auriculares",30,70,9);

        ArrayList<Producto>list= new ArrayList<>();
        list.add(telefono);
        list.add(telefono2);
        list.add(portatil);
        list.add(portatil2);
        list.add(auriculares);
        list.add(auriculares2);

        double precio = 0;
        for (Producto prod : list){
            if (prod.getPrecioVenta() >= precio){
                precio = prod.getPrecioVenta();
            }
        }

        System.out.println("El precio de venta mayor de todo el estocaje es: "+precio+"€");

        double precioCosto = 999999;
        for (Producto prod : list){
            if (prod.getPrecioCosto() <= precioCosto){
                precioCosto = prod.getPrecioCosto();
            }
        }

        System.out.println("El precio menor de costo de todo el estocaje es: "+precioCosto+"€");

        list.remove(4);
        list.get(3).setNombre("");

        System.out.println("------------------");

        System.out.println(list);

        System.out.println("------------------");

        Producto stockProducto = null;
        int stock = 0;
        int des = 3;
        for (Producto prod : list){
            if (prod.getCantidadStock() >= stock){
                stock = prod.getCantidadStock();
                stockProducto = prod;
                stockProducto.setCantidadStock((stock-des));
            }
        }
        System.out.println("El producto con mayor estocaje tiene: "+stock+" unidades");
        System.out.println("Actualizado la cantidad del "+stockProducto.getNombre()+", despues del descuento de "+des+" unidades a: "+(stock-des)+" unidades");
        int index = list.indexOf(stockProducto);
        System.out.println(list.get(index));

    }


}