package app;

public class App {
    public static void main(String[] args){
        
        Cuenta cuenta1= new Cuenta ("Miguel");
        Cuenta cuenta2 = new Cuenta ("José", 450.50);

        cuenta1.ingresarCantidad (350);
        cuenta2.ingresarCantidad (680);

        cuenta1.retirarCantidad (120);
        cuenta2.retirarCantidad (230);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    
    }

    
}