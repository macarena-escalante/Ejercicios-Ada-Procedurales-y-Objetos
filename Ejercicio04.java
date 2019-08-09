/*Dado un conjunto de 15 valores positivos, desarrollar un programa que imprima
el valor máximo del conjunto y su posición relativa*/

import java.util.*;

/**
 * Ejercicios04
 */
public class Ejercicio04 {

    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) {
        
        int MAX;
        MAX = 0;

        int POSICION;
        POSICION= 0;

        /* para que cuente de atrás para adelante: 
           int i = 15; i >=1; i --
           arranco desde el 15, y pregunta:
           el 15 es mayor o igual a 1? si, entonces decrementa de 1 en 1*/
           
        for (int i = 1; i <= 15; i++) {
         System.out.println("Ingresar un valor positivo ");
         int valor;
         valor= Teclado.nextInt();
         if (valor <0) {
             System.out.println("Se ingresó un número negativo"); 
             break;
         } else {
            if (valor > MAX) {
                MAX= valor;
                POSICION= i;
   
            }
             
         }
         
         
        }
        System.out.println("El valor máximo es: "+ MAX);
        System.out.println("Y su posición relativa es la número: "+ POSICION);
    }
}