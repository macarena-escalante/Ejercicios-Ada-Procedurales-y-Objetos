import java.util.*;

/**
 * Ejercicio00
 */
public class Ejercicio00 {

    public static Scanner Teclado= new Scanner (System.in);

    public static void main(String[] args) {
     
        int a;
        System.out.println("Ingrese el primer numero");
        a= Teclado.nextInt();

        int b;
        System.out.println("Ingrese el segundo numero");
        b= Teclado.nextInt();

        int c;
        c= a*b;

        System.out.println ("El resultado de la multiplicacion es: " + c);
    }
    
}
    
