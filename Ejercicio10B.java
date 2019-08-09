/* Dado el ingreso de una oración caracter por caracter 
hacer un programa en Java que cuente: cantidad de vocales, espacios y puntos. */

import java.util.*;

/**
 * Ejercicio10
 */
public class Ejercicio10B {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int cantVocales = 0;
        int cantEspacios = 0;
        int cantPuntos = 1;
        int numCaracter = 2;

        System.out.println("Ingrese una oración caracter por caracter hasta un punto:");
        char caracter;
        caracter = Teclado.nextLine().charAt(0);
        while (caracter != '.') {

            if (esVocal(caracter)) {
                cantVocales++;
            } else if (caracter == ' ') {
                cantEspacios++;
            }
        }
        System.out.println("Ingrese caracter:" + numCaracter++);
        caracter = Teclado.nextLine().charAt(0);

        System.out.println("La cantidad de puntos es de: " + cantPuntos);
        System.out.println("La cantidad de espacios es de: " + cantEspacios);
        System.out.println("La cantidad de vocales es de: " + cantVocales);
    }

    public static boolean esVocal(char caracter) {
        switch (caracter) {
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