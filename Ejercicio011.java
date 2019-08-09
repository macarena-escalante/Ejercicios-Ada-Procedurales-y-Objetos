
/* Dados 10 números que representan edades,
calcular el promedio, imprimirlo y luego imprimir todas las edades ingresadas */

import java.util.*;

/**
 * Ejercicio11
 */
public class Ejercicio011 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[] edades = new int[10]; /* en lugar de declarar int a; int b; int c; */
        int numEdad = 1;
        

        int suma = 0;
        int prom = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número "+(i+1));

            int numero;
            numero = Teclado.nextInt();
            edades[i] = numero; /*
                                 * las edades en la vuelta del iterador, va a valer el número que ingresé en esa
                                 * vuelta
                                 */
            /* en la vuelta 1 me guarda el primer número que ingreso */

        }
        for (int i = 0; i < 10; i++) {
            suma += edades[i]; /* es como suma = suma + edades */
        }
        prom = suma / 10;
        System.out.println("El promedio es de " + prom);

        for (int i = 0; i < 10; i++) {
            System.out.println("La edad recibida n° " + numEdad++ + " es "
                    + edades[i]); /* es [i] porque quiero que imprima edad por posición */

        }
    }
}