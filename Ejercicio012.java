
/* Dados 2 arrays de números enteros de 7 posiciones, 
generar un tercer array con 7 elementos
donde cada elemento sea la suma de los dos arrays anteriores 

ARRAY A 7 POSICIONES
ARRAY B 7 POSICIONES
ARRAY C LA SUMA DE A0+B0 LA GUARDA EN C0 */

import java.util.*;

/**
 * Ejercicios012
 */
public class Ejercicio012 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] A = new int[7];
        int[] B = new int[7];
        int[] C = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el número " + (i + 1) + " de A");
            A[i] = Teclado.nextInt();
        }

        for (int i = 0; i < 7; i++) {

            System.out.println("Ingrese el número " + (i + 1) + " de B");
            B[i] = Teclado.nextInt();
        }

        for (int i = 0; i < 7; i++) {

            C[i] = A[i] + B[i];

            System.out.println("La suma de " + A[i] + " en A y " + B[i] + " en B es de: " + C[i] + " en C");
        }
    }
}