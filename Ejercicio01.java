import java.util.*;

/**
 * Ejercicio01
 */
public class Ejercicio01 {
public static Scanner Teclado= new Scanner (System.in);

public static void main(String[] args) {
    
    int a, b, c, d;
    double f;
    System.out.println("Ingrese el valor A: ");
    a= Teclado.nextInt();

    System.out.println("Ingrese el valor B: ");
    b= Teclado.nextInt();

    System.out.println ("Ingrese el valor C: ");
    c= Teclado.nextInt();

    d= a+ b+ c;
    f= d / 3d; /*d de double, porque el 3 solo es entero, y lo % dando un entero */
    System.out.println ("El promedio es de: "+ f);
}}