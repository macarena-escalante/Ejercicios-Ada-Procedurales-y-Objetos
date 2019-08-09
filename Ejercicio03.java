/** Dado un conjunto de valores, donde cada uno representa el sueldo de un empleado
* (Escepto el último que es 0 e indica el fin del conjunto.)
* Desarrollar un programa que determine e imprima:
* Cuántos empleados ganan menos de 520 pesos
* Cuántos ganan entre 520 y 780 pesos
* Cuántos entre 780 y 999 pesos
* Cúantos ganan más de 999 **/

import java.util.*;

/**
 * Ejercicio03
 */
public class Ejercicio03 {

public static Scanner Teclado = new Scanner (System.in);
public static void main(String[] args) {
    
    int A;
    A= 0;

    int B;
    B= 0;

    int C;
    C= 0;

    int D;
    D= 0;

    int sueldo;
    System.out.println("Ingrese un sueldo: ");
    sueldo= Teclado.nextInt();

    while (sueldo >0) {
        if (sueldo <520) {
            A= A+1;  
        } else {
            if (sueldo >=520 && sueldo <780) {
                B= B+1;
            } else {
                if (sueldo >780 && sueldo <999) {
                    C= C+1;
                } else {
                    D= D+1;
                }
            }
            
        }
      /* NO SE VUELVE A DECLARAR CON INT SUELDO PORQUE YA LO HICE ARRIBA*/
      
      System.out.println("Ingrese otro sueldo: ");
      sueldo= Teclado.nextInt();  
    }
System.out.println("La cantidad de empleados que ganan menos de 520 es: " + A);
System.out.println("La cantidad de empleados que ganan entre 520 y 780 es: " + B);
System.out.println("La cantidad de empleados que ganan entre 780 y 999 es: " + C);
System.out.println("La cantidad de empleados que ganan más de 999 es: " + D);
}
}