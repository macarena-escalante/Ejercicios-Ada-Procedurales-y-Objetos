/* De la carpeta 22/07, carpeta 2, hacer los ejercicios 4 hoja 31 y 14 hoja 33 */

/* El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que le
permita determinar cuánto debe cobrar por el uso del estacionamiento a sus clientes.
Las tarifas que se tienen son las siguientes:
a. Las dos primeras horas a $5.00 c/u.
b. Las siguientes tres a $4.00 c/u.
c. Las cinco siguientes a $3.00 c/u.
d. Después de diez horas el costo por cada una es de dos pesos. */

import java.util.*;

/**
 * Ejercicio07
 */
public class Ejercicio07 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double tarifaCobrar = 0.00;

        double dosPrimerasHs = 5.00;
        double tresSiguientesHs = 4.00;
        double cincoSiguientesHs = 3.00;
        double diezSiguientesHs = 2.00;

        int horasEstacionadas;
        System.out.println("Ingrese la cantidad de horas que utilizó el estacionamiento");
        horasEstacionadas = Teclado.nextInt();

        if (horasEstacionadas <= 10) {

            if (horasEstacionadas <= 2) {
                tarifaCobrar = dosPrimerasHs * horasEstacionadas;
                System.out.println(
                        "La tarifa a cobrar por un total de " + horasEstacionadas + "hs en estacionamiento es de: $" + tarifaCobrar);
            } else if (horasEstacionadas <= 5) {
                tarifaCobrar = (dosPrimerasHs * 2) + ((horasEstacionadas - 2) * tresSiguientesHs);
                System.out.println(
                        "La tarifa a cobrar por un total de " + horasEstacionadas + "hs en estacionamiento es de: $" + tarifaCobrar);
            } else {
                tarifaCobrar = (dosPrimerasHs * 2) + (tresSiguientesHs * 3)
                        + ((horasEstacionadas - 5) * cincoSiguientesHs);
                System.out.println(
                        "La tarifa a cobrar por un total de " + horasEstacionadas + "hs en estacionamiento es de: $" + tarifaCobrar);
            }
        } else {
            tarifaCobrar= horasEstacionadas * diezSiguientesHs;
            System.out.println(
                        "La tarifa a cobrar por un total de " + horasEstacionadas + "hs en estacionamiento es de: $" + tarifaCobrar);
        }

    }
}