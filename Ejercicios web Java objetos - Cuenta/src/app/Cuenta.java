package app;

/**
 * Cuenta
 */
public class Cuenta {

    public String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this (titular, 0); // llamo al constructor de 2 parámetros de abajo y el 0 es porque inicia sin nada
    }

    public Cuenta (String titular, double cantidad){
        this.titular= titular;
        if (cantidad <0){
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        
        if (titular.equals("NADIE")) // valida que no ingresen un titular NADIE
        return;
        this.titular= titular;
    }

    public double getCantidad(){
        return cantidad;
    }

    public void setCantidad(double cantidad){
        if (cantidad <0)
        return;
        this.cantidad= cantidad;
    }

    public void ingresarCantidad(double cantidad){
        if (cantidad <0){
            return;
        } else {
            this.cantidad= this.cantidad+ cantidad;
        }

    } 

    public void retirarCantidad(double cantidad){
        if (this.cantidad - cantidad <0){
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    public String toString(){
        return ("El titular "+ titular+ " tiene "+ cantidad + " euros en su cuenta");
    }
}
