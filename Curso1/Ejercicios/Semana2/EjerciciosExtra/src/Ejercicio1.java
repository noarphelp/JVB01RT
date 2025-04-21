import java.util.Random;

/**
 * #################
 * ## Ejercicio 1-A ##
 * #################
 * <p>
 * Crea una función que imprima X resultados aleatorios de una
 * quiniela 1 X 2. Ejemplo, si le decimos que imprima 14 resultados:
 * <p>
 * Resultado 1: 1
 * Resultado 2: X
 * Resultado 3: 2
 * (...)
 * Resultado 14: 2
 */
public class Ejercicio1 {

    private static String[] resultados = {"1", "2", "X"};
    static Random random = new Random();

    public static void quiniela(String[] resultados) {

        for (int i = 0; i < 14; i++) {

            System.out.println("Resultado " + (i + 1) + ": " + resultados[random.nextInt(resultados.length)]);
        }
    }

    /**
     * #################
     * ## Ejercicio 1-B ##
     * #################
     * <p>
     * Crea una función que imprima X resultados aleatorios de una
     * quiniela 1 X 2 con la probabilidad de que salga el 1 sea del 60%, la de la X del 30% y la del 2 del 10%
     * Ejemplo, si le decimos que imprima 14 resultados:
     * Resultado 1: 1
     * Resultado 2: X
     * Resultado 3: 2
     * (...)
     * Resultado 14: 2
     */

    public static void quinielaPorcentaje(){

        String[] resultado = {"1","1","1","1","1","1","1","1","2","2","X","X","X","X"};

        for (int i = 0; i < 14; i++) {

            System.out.println("Resultado " + (i + 1) + ": " + resultado[random.nextInt(resultado.length)]);
        }
    }


    public static void main(String[] args) {
       //ejercicio 1-A
        // quiniela(resultados);

        //ejercicio 1-B
        quinielaPorcentaje();

    }
}
