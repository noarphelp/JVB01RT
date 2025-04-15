/* Ejercicio Nº 1 - Estructuras Condicionales
a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que,
a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
El programa debe mostrar (según cada caso) un mensaje informando la situación.
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, bienvenido al recital, por favor ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ahora introduce tu edad  por favor: ");
        int edad = scanner.nextInt();

        if(edad < 18){

            System.out.println("Lo siento "+nombre+" no puede pasar, porque eres menor de edad");

        } else if(edad > 40) {
            System.out.println("Ufff! "+nombre+" eres muy mayor,no puede pasar");

        } else {
            System.out.println("Enorabuena "+nombre+" puede pasar");

        }

    }
}