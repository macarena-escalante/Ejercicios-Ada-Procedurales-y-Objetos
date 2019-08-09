
/* Devolver la suma de elementos de un array 
El número 13 es de mala suerte asi que no debe sumarse
Ignorar también el número siguiente al 13. 

{1,5,7} = 13

{2,7,13}= 9

{11,15,13,4}= 30 */

import java.util.*;

/**
 * Ejercicio014
 */
public class Ejercicio014 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int cantNumeros;
        int contadorNumeros = 1;
        int suma = 0;

        System.out.println("Ingrese la cantidad de números");
        cantNumeros = Teclado.nextInt();

        boolean hay13 = false;

        // declaro el array de N posiciones
        int[] elementos = new int[cantNumeros];

        // recorro el array para llenarlo
        for (int i = 0; i < cantNumeros; i++) {
            System.out.println("Ingrese el número " + (contadorNumeros++));

            elementos[i] = Teclado.nextInt();
        }

        // aca recorro y pregunto por 13
        for (int i = 0; i < cantNumeros; i++) {
            if (elementos[i] == 13) {
                hay13 = true;
            } else {
                if (!hay13) {

                    suma = suma + elementos[i];
                } else {
                    hay13 = false;
                }
            }

        }

        System.out.println("La suma es de" + suma);
    }

}