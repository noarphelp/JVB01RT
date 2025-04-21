

public class Piramides {

    /* ################
     * ## Pirámide 1 ##
     * ################
     *
     * Utiliza el bucle "for" para crear las siguiente figura con asteriscos (*). Debe existir
     * una variable que permita modificar la altura de la pirámide. Para el ejemplo expuesto a
     * continuación se ha tomado como referencia una altura de 4:
     *
     * - Figura 1:
     *
     *      😁
     *      😁😁
     *      😁😁😁
     *      😁😁😁😁
     */

    public static void caritas(int filas) {

        for (int i = 1; i <= filas; i++) {
            String mensje = "\uD83D\uDE01";
            String repit = mensje.repeat(i);
            System.out.println(repit);
        }
        System.out.println("----------------------------------");
    }

    /**
     * ################
     * ## Pirámide 2 ##
     * ################
     * <p>
     * Crea una función que reciba una altura y dibuje una figura
     * como la que sigue:
     * <p>
     * 1
     * 22
     * 333
     * 4444
     * 55555
     */

    public static void numeros(int altura) {

        for (int i = 1; i <= altura; i++) {
            String mensje = "" + i;
            String repit = mensje.repeat(i);
            System.out.println(repit);
        }
        System.out.println("----------------------------------");
    }

    /**
     * ################
     * ## Pirámide 3 ##
     * ################
     * <p>
     * Crea una función que reciba una altura y dibuje una figura
     * como la que sigue:
     * <p>
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */
    public static void crechendo(int altura) {

        for (int i = 1; i <=altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        caritas(5);

        numeros(5);

        crechendo(5);
    }
}
