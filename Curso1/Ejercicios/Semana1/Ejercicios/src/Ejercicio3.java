import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    /*
    Ejercicio Nº 3 - Arreglos: Vectores
Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana,
 calcule la temperatura máxima promedio que hubo.
Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día.
 Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
    */
    public static void pedirTemp(){

        Scanner scanner= new Scanner(System.in);
        int todas= 0;
        System.out.println("Hola, por favor ingresa la temperatura maxima de cada dia de la semana: \n"+
                "lunes: ");
        int lunes = scanner.nextInt();
        todas += lunes;
        System.out.println("Martes: ");
        int martes = scanner.nextInt();
        todas += martes;
        System.out.println("Miercoles: ");
        int miercoles = scanner.nextInt();
        todas += miercoles;
        System.out.println("Jueves: ");
        int jueves = scanner.nextInt();
        todas += jueves;
        System.out.println("Viernes: ");
        int viernes = scanner.nextInt();
        todas += viernes;
        System.out.println("Sabado: ");
        int sabado = scanner.nextInt();
        todas += sabado ;
        System.out.println("Domingo: ");
        int domingo = scanner.nextInt();
        todas += domingo;

        int fin = todas / 7;
        System.out.println("La temperatura media de esta semana fue: "+ fin+"ª");

    };


// Ejercicio desarollado con arrayList
    public static  void arrayTemp(){
        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer>todas = new ArrayList<>();
        System.out.println("Hola, por favor ingresa la temperatura maxima de cada dia de la semana: \n"+
                "lunes: ");
        int lunes = scanner.nextInt();
         todas.add(lunes);
        System.out.println("Martes: ");
        int martes = scanner.nextInt();
        todas.add(martes);
        System.out.println("Miercoles: ");
        int miercoles = scanner.nextInt();
        todas.add(miercoles);
        System.out.println("Jueves: ");
        int jueves = scanner.nextInt();
        todas.add(jueves);
        System.out.println("Viernes: ");
        int viernes = scanner.nextInt();
        todas.add(viernes);
        System.out.println("Sabado: ");
        int sabado = scanner.nextInt();
        todas.add(sabado);
        System.out.println("Domingo: ");
        int domingo = scanner.nextInt();
        todas.add(domingo);

        int fin = 0;
        int resul= 0;

        for (Integer param : todas){

            fin +=param;

            resul = fin /todas.size();
        };

        System.out.println("La temperatura media de esta semana fue: "+ resul+ "ª");
    };
    public static void main(String[] args) {

       //pedirTemp();
        arrayTemp();


    }
}
