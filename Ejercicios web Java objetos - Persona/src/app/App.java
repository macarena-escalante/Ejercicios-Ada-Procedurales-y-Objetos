package app;

import java.util.*;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre;
        int edad;
        long dni;
        char sexo;
        double peso;
        double altura;
        System.out.println("Ingrese el nombre");
        nombre = Teclado.nextLine();                     //Lo que ingreso por pantalla se va a usar 

        System.out.println("Ingrese el dni: ");
        dni = Teclado.nextInt();

        System.out.println("Ingrese el sexo: ");
        sexo = Teclado.next().charAt(0);

        System.out.println("Ingrese la edad: ");
        edad = Teclado.nextInt();

        System.out.println("Ingrese el peso: ");
        peso = Teclado.nextDouble();

        System.out.println("Ingrese la altura: ");
        altura = Teclado.nextDouble();

        Persona person = new Persona();
        Persona person2 = new Persona(nombre, edad, sexo);    // acá en nombre, edad y sexo, porque es lo que estoy pidiendo
        Persona person3= new Persona ();
        Persona person4 = new Persona(nombre, edad, sexo, peso, altura, dni);

        person.setNombre("José");
        person.setEdad(42);
        person.setSexo('H');
        person.setDni(16940289);
        person.setPeso(80.500);
        person.setAltura(1.82);

        person2.setDni(37084232);
        person2.setPeso(52.200);
        person2.setAltura(1.68);

        person3.setNombre("Mariana");
        person3.setEdad(31);
        person3.setSexo('M');
        person3.setDni(19002837);
        person3.setPeso(62.400);
        person3.setAltura(1.69);

        System.out.println(person.toString());
        MuestraMensajePeso(person);
        MuestraMayorEdad(person);

        System.out.println(person2.toString());
        MuestraMensajePeso(person2);
        MuestraMayorEdad(person2);

        System.out.println(person3.toString());
        MuestraMensajePeso(person3);
        MuestraMayorEdad(person3);

        System.out.println(person4.toString());
        MuestraMensajePeso(person4);
        MuestraMayorEdad(person4);
    }

    public static void MuestraMensajePeso(Persona p) {
        int Imc = p.calcularImc();
        switch (Imc) {
        case Persona.PESO_IDEAL:
            System.out.println("La persona está en su peso ideal");
            break;

        case Persona.INFRAPESO:
            System.out.println("La persona está por debajo de su peso ideal");
            break;

        case Persona.SOBREPESO:
            System.out.println("La persona está por encima de su peso ideal");
            break;
        }

    }

    public static void MuestraMayorEdad(Persona p) {
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es menor de edad");
        } else {
            System.out.println("La persona es mayor de edad");
        }
    }
}
