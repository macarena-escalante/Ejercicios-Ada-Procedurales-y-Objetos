package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Espectador
 */
public class Espectador {

    public String nombre;
    public int edad;
    public double dineroDisponible;

    public Espectador (String nombre){
        this.nombre= nombre;
    }

    public static List<Espectador> espectadores = new ArrayList<Espectador>();

    public void agregarEspectadores(){
        Espectador e = new Espectador("Maria");
        e.edad= 16;
        e.dineroDisponible= 260;
        espectadores.add(e);

        e= new Espectador("Carlos");
        e.edad= 43;
        e.dineroDisponible= 700;
        espectadores.add(e);

        e= new Espectador("Tatiana");
        e.edad= 23;
        e.dineroDisponible= 140;
        espectadores.add(e);
    }


   
}