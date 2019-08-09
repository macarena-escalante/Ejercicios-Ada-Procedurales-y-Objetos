/* Dadas 2 matrices de entradas, ayb, 
devuelven verdadero si tienen el mismo primer elemento 
o tienen el mismo último elemento. 
Ambas matrices serán de longitud 1 o más.


commonEnd ([1, 2, 3], [7, 3]) → true 
commonEnd ([1, 2, 3], [7, 3, 2]) → false 
commonEnd ([1, 2, 3], [1 , 3]) → verdadero */

import java.util.*;

/**
 * Ejercicio015
 */
public class Ejercicio015 {

    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) {

        int n1= 0;
        int[] A = new int[n1];
        int n2= 0;
        int[] B = new int[n2];
       
        System.out.println("Ingrese la cantidad de números en A:");
        n1= Teclado.nextInt();
        
        System.out.println("Ingrese la cantidad de números en B:");
        n2= Teclado.nextInt();
       
        for (int i = 0; i < n1; i++) {
            
            System.out.println("Ingrese el número en A");
            A [i] = Teclado.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            
            System.out.println("Ingrese el número en B");
            B [i] = Teclado.nextInt();
        }

        for (int i = 0; i < n1; i++) {
            
        
        if (A [0] == B [0] || A [n1] == B [n2]) {
            System.out.println("VERDADERO");
            
        } else {
            System.out.println("FALSO");
        }
    }
}}