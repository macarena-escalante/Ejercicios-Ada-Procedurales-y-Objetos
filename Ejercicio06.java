/*  Una copañía de paquetería internacional tiene servicio en algunos países 
de América del Norte, América Central, América del Sur, Europa y Asia. 
El costo por el servicio de paquetería se basa en el peso del paquete y la zona a la que va dirigido.
Lo anterior se muestra en la siguiente tabla:

América del norte: $11.00 costo/gramo
América central: $10.00 costo/gramo
América del sur: $12.00 costo/gramo
Europa: $24.00 costo/gramo
Asia: $27.00 costo/gramo

Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados.
Realice un algorítmo para determinar el cobro por la entrega de un paquete o, en su caso,
el rechazo de la entrega. */

import java.util.*;

/**
 * Ejercicio06
 */
public class Ejercicio06 {

    public static Scanner Teclado= new Scanner (System.in);
    public static void main(String[] args) {
        int ubicacion;

        double costoGrAmNorte= 11.00;
        double costoGrAmCen= 10.00;
        double costoGrAmSur= 12.00;
        double costoGrEur= 24.00;
        double costoGrAsia= 27.00;

        double costoPaquete= 0;
        double pesoPaquete;

        System.out.println("Ingrese el peso del paquete en gramos:");
        pesoPaquete= Teclado.nextInt();

        if (pesoPaquete < 5000) {
            
            System.out.println("Ingrese la zona a donde quiere enviar:"); // imprimo que ingrese un num de ubicación/ 
            System.out.println("Zona 1: América del Norte");              // que se va a guardar en teclado.nextInt/
            System.out.println("Zona 2: América central");                // y llamo a la funcion ubicacion que inicialicé arriba/
            System.out.println("Zona 3: América del sur");                // y si el num es entre 1 y 5 va a ver en el case/
            System.out.println("Zona 4: Europa");
            System.out.println("Zona 5: Asia");

            ubicacion= Teclado.nextInt();

            while (ubicacion <=0 || ubicacion >5) {                        // si el numero no está entre 1 y 5/
            System.out.println("La zona ingresada es incorrecta");         // pide que vuelva a ingresar hasta que/
            System.out.println("Ingrese la zona a donde quiere enviar:");  // sea correcto/
            System.out.println("Zona 1: América del Norte");              
            System.out.println("Zona 2: América central");                
            System.out.println("Zona 3: América del sur");
            System.out.println("Zona 4: Europa");
            System.out.println("Zona 5: Asia");

            ubicacion= Teclado.nextInt();
            }
            switch (ubicacion) {
                case 1: costoPaquete= pesoPaquete * costoGrAmNorte;
                System.out.println("El costo del envío a América del norte por su paquete de " + pesoPaquete+ "grs, es de: $"+ costoPaquete);  
                    break;

                case 2: costoPaquete= pesoPaquete * costoGrAmCen;
                System.out.println("El costo del envío a América central por su paquete de " + pesoPaquete+ "grs, es de: $"+ costoPaquete);
                    break;

                case 3: costoPaquete= pesoPaquete * costoGrAmSur;
                System.out.println("El costo del envío a América del sur por su paquete de " + pesoPaquete+ "grs, es de: $"+ costoPaquete);
                    break;

                case 4: costoPaquete= pesoPaquete * costoGrEur;
                System.out.println("El costo del envío a Europa por su paquete de " + pesoPaquete+ "grs, es de: $"+ costoPaquete);
                    break;

                case 5: costoPaquete= pesoPaquete * costoGrAsia;
                System.out.println("El costo del envío a Asia por su paquete de " + pesoPaquete+ "grs, es de: $"+ costoPaquete);
                    break;

                default:
                    break;
            }
        } else {
            System.out.println("El paquete supera el peso máximo para ser transportado");
        }
    }
}