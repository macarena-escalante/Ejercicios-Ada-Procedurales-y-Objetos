
/* Dado el ingreso de una oración 
hacer un programa en Java que cuente: cantidad de vocales, espacios y puntos. */

import java.util.*;

/**
 * Ejercicio013
 */
public class Ejercicio013 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int cantVocales = 0;
        int cantEspacios = 0;
        int cantPuntos = 0;
        String oracion;
        char[] letras;

        System.out.println("Ingrese una oración:");

        oracion = Teclado.nextLine();

        letras = oracion.toCharArray();

        for (int i = 0; i < letras.length; i++) {

            if (esVocal(letras[i])) { /* La función esVocal solo recibe UNA letra */
                cantVocales++;

            } else if (letras[i] == ' ') {
                cantEspacios++;
            } else if (letras[i] == '.') {
                cantPuntos++;
            }
        }
        System.out.println("La cantidad de vocales es de: " + cantVocales);
        System.out.println("La cantidad de espacios es de: " + cantEspacios);
        System.out.println("La cantidad de puntos es de: " + cantPuntos);

    }

    public static boolean esVocal(char letras) {
        switch (letras) {
        case 'A':
        case 'a':
        case 'á':
        case 'E':
        case 'e':
        case 'é':
        case 'I':
        case 'i':
        case 'í':
        case 'O':
        case 'o':
        case 'ó':
        case 'U':
        case 'u':
        case 'ú':
            return true;
        }
        return false;

    }
}