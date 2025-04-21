import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
     * #################
     * ## Ejercicio 2 ##
     * #################
     *
     * Realizar un algoritmo que calcule el valor de la letra de un número de DNI (Documento nacional de indentidad).
     *
     * Buscar en Google como se genera la letra del DNI.
     *
     * Usad funciones para una mejor organización del código.
     *
     * formula : numerodni / 23 = resultado - parte entera = la parte decimal * 23 = resto , el resto a comparar en la lista de letras
     *
     * RESTO	0	1	2	3	4	5	6	7	8	9	10	11
     * LETRA	T	R	W	A	G	M	Y	F	P	D	X	B
     *
     *
     * RESTO	12	13	14	15	16	17	18	19	20	21	22
     * LETRA	N	J	Z	S	Q	V	H	L	C	K	E
     */
public class Ejercicio2 {
    public static void letraDni(){
         Map<Integer,String>letras = new HashMap<>();
         Scanner scanner = new Scanner(System.in);

        letras.put(0,"T"); letras.put(1,"R"); letras.put(2,"W"); letras.put(3,"A"); letras.put(4,"G"); letras.put(5,"M"); letras.put(6,"Y"); letras.put(7,"F");
        letras.put(8,"P");  letras.put(9,"D"); letras.put(10,"X"); letras.put(11,"B"); letras.put(12,"N"); letras.put(13,"J");
        letras.put(14,"Z"); letras.put(15,"S"); letras.put(16,"Q"); letras.put(17,"V"); letras.put(18,"H"); letras.put(19,"L");
        letras.put(20,"C"); letras.put(21,"K"); letras.put(22,"E");

        System.out.println("Hola! introduce tu numero entero de DNI para saber la letra: ");
        Integer dni = scanner.nextInt();

        double division = (double)dni / 23;      //<----- casteo el dni porq es numero entero , pero queremos q lo trate como double par poder hacer la operacion
        int parteEntera = (int) division;        //<------- casteo de division , porque es doble  y al castearlo nos quedamos con la parte entera
        double parteDecimal = division - parteEntera;
        double resto =parteDecimal * 23 + 0.1;  // <------ el 0.1 lo puse por culpa del redoneo

        for (Integer val : letras.keySet()) {

            if((int)resto == val){   //<------ casteo de resto porque viene de un doble

                System.out.println("Tu Dni completo es :"+dni+letras.get(val));

            }
        }
    }

        public static void main(String[] args) {

            letraDni();
        }
}
