import excepciones.MyExcepcion;
import models.Producto;

import java.util.ArrayList;
import java.util.List;

public class Utils <T extends Producto>{

    private List<T> list;



    public Utils() {
        this.list = new ArrayList<>();
    }

    public void agregarPro(T producto){
        list.add(producto);
        System.out.println("Se agrego el producto: "+producto);

    }

    public void mostrarPro(){
        System.out.println("Inventario: ");
        list.stream().forEach(System.out::println);

    }

    public void GetIndice(int indice)throws MyExcepcion{
        try {
            T reserva = list.get(indice);
            System.out.println("El producto por indice es: "+reserva+"\n");
        } catch (Exception e) {
           throw new MyExcepcion("Indice invalido o no encontrado");
        }

    }
}
