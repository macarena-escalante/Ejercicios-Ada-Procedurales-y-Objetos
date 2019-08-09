
/* Dado un número que representa un año, imprimir si es año bisiesto o no.
Calcular el año bisiesto con función.*/

import java.util.*;

/**
 * Ejercicio09
 */
public class Ejercicio09 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresar el año: ");
        int anio;                                                    /* Ingreso y guardo el año */
        anio = Teclado.nextInt();

        if (esBisiesto(anio)) {                                      /* Imprimo fuera de la función, en el main */
            System.out.println("El año es bisiesto");                /* Llamo a la función esBisiesto y llamo al parámetro anio */
        } else {                                                     /* Si es V el año que ingresé: imprime es bisiesto */
            System.out.println("El año NO es bisiesto");             /* Si es F imrpime NO es bisiesto */
        }

    }

    private static boolean esBisiesto(int anioB) {                       /* anioB es el nombre del parámetro, anio es el contenido*/

        if (anioB % 4 == 0 && (anioB % 400 == 0 || anioB % 100 != 0)) {  /*El boolean solo me devuelve V ó F */
            return true;                                                  /*Y para que lo haga tengo que poner RETURN */
        } else {                                                        
            return false;                                                /* La función solo actúa como función */
        }

    }

}