
/* Devolver la suma de elementos de un array 
El número 13 es de mala suerte asi que no debe sumarse
Ignorar también el número siguiente al 13. 

{1,5,7} = 13

{2,7,13}= 9

{11,15,13,4}= 26 */

import java.util.*;

/**
 * Ejercicio014B
 */
public class Ejercicio014B {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int n;

        System.out.println("Ingrese cuántos número contiene");
        n = Teclado.nextInt();

        int[] nros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un número");
            nros[i] = Teclado.nextInt();

        }
        int contador = 0;
        boolean pasoPor13 = false;

        for (int i = 0; i < n; i++) {
            if (pasoPor13 == false) {

                if (nros[i] != 13) {
                    contador += nros[i];
                } else {
                    pasoPor13 = true;
                }
            } else {
                pasoPor13 = false;
            }
        }

        System.out.println("La suma es de: " + contador);

    }
}
