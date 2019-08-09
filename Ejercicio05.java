
/* Hacer el ejercicio 4.12 pág 34 de la guía 3 */

import java.util.*;

/**
 * Ejercicio05
 */
public class Ejercicio05 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el número de ventas: ");
        double numVentas = Teclado.nextDouble();

        int venta1000A = 0;
        int venta500y1000B = 0;
        int venta500C = 0;

        double totalVentasA = 0;
        double totalVentasB = 0;
        double totalVentasC = 0;

        double totalVentas = 0;
        int contadorVentas = 1;

        while (contadorVentas <= numVentas) {
            System.out.println("Ingrese el monto de venta "+contadorVentas);
            double montoVenta = Teclado.nextDouble(); /*
                                                       * la declaro dentro del while, porque si la primer condición no
                                                       * se cumple, va directo al false y no la necesito
                                                       */

            if (montoVenta > 1000) {
                venta1000A = venta1000A + 1;
                totalVentasA = totalVentasA + montoVenta;
            } else if (montoVenta > 500 && montoVenta <= 1000) {
                venta500y1000B = venta500y1000B + 1;
                totalVentasB = totalVentasB + montoVenta;

            } else {
                venta500C = venta500C + 1;
                totalVentasC = totalVentasC + montoVenta;
            }
            totalVentas = totalVentas + montoVenta;
            contadorVentas = contadorVentas + 1;

        }
        System.out.println("Las ventas mayores a 1000 son: " + venta1000A);
        System.out
                .println("Las ventas mayores a 500 y menores ó iguales a 1000 son: " + venta500y1000B);
        System.out.println("Las ventas mayores ó iguales a 500 son: " + venta500C);

        System.out.println("El total de las ventas mayores a 1000 es de: " + totalVentasA);
        System.out.println("El total de las ventas mayores a 500 y menores ó iguales a 1000 es de: " + totalVentasB);
        System.out.println("El total de las ventas menores ó iguales a 500 es de: " + totalVentasC);

        System.out.println("El total de ventas es de: " + totalVentas);

    }
}

