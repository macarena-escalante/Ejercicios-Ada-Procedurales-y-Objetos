import java.util.*;

/** Dados dos valores enteros, imprimir si el primero es > que el segundo, o < o =
 * Ejercicio02
 */
public class Ejercicio02 {
public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) {
        int numero1, numero2;
        System.out.println("Ingrese el numero 1: ");
        numero1= Teclado.nextInt ();

        System.out.println("Ingrese el numero 2: ");
        numero2= Teclado.nextInt ();
       
        if (numero1== numero2){
            System.out.println("Son iguales");
        }
        else{
            if ( numero1 > numero2){
            System.out.println("El numero 1 es mayor");}
            
            else{
            System.out.println("El numero 1 es menor");
        }

    }}

}