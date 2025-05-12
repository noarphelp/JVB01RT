import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InventarioAutos<T extends Auto> {

    public List<T> list;

    public InventarioAutos() {
        this.list = new ArrayList<>();
    }

    public void agregarAuto(T auto) {

        if (auto != null) {
            System.out.println("Auto registrado correctamente");
            this.list.add(auto);
        } else {
            System.out.println("Auto no registrado, auto nulo o invalido");
        }
    }

    public void buscarAno(int ano){

        try {
            List<T> porAnho = list.stream().filter(m ->m.getAnho() == ano).toList();
            System.out.println("Listando autos encontrados por el año: "+ano+".");
            System.out.println(porAnho);
        } catch (Exception e) {
            System.out.println("Año no valido, o no se encuentra auto con ese año.");
        }
    }

    public void buscarMarca(String marca){

        if(marca != null && !list.isEmpty()){
            List<T> porMarca = list.stream().filter(m ->m.getMarca().equalsIgnoreCase(marca)).toList();
            System.out.println("Listando autos encontrados por la marca: "+marca+".");
            System.out.println(porMarca);
         }else{
            System.out.println("Auto no encontrado por marca, o marca invalida.");
        }
    }

    public void calTotal(){
        double total = list.stream().mapToDouble(m -> m.getPrecio()).sum();

        System.out.println("El calculo total de la suma de todos los autos en inventario es: "+total+"€");
    }
}
