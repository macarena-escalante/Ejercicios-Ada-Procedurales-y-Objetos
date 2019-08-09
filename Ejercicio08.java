
/* Realice un algoritmo que, con base a una calificación proporcionada (0-10)
indique con letra la calificación que le corresponde:
10 es "A"
9 es "B"
8 es "C"
7 y 6 son "D"
de 5 a 0 son "F" */

import java.util.*;

/**
 * Ejercicio08
 */
public class Ejercicio08 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int calificacion;

        System.out.println("Ingrese la calificación a evaluar: ");
        calificacion= Teclado.nextInt();

        switch (calificacion) {
        case 10:
            System.out.println("Su calificación equivale a una A");

            break;

        case 9:
            System.out.println("Su calificación equivale a una B");

            break;

        case 8:
            System.out.println("Su calificación equivale a una C");

            break;

        case 7:
        case 6:
            System.out.println("Su calificación equivale a una D");
            System.out.println("¡Puedes hacerlo mejor!");
            break;

        case 5:
        case 4:
        case 3:
        case 2:
        case 1:
        case 0:
            System.out.println("Su calificación equivale a una F");
            System.out.println("Por favor estudia más");
            break;

        default:
           break;
    
        } 
}}