package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Fila
 */
public class Fila {

    public String letra;
    

    public List <Asiento> asientos = new ArrayList<Asiento>();

    public Fila (String letra){
        this.letra= letra;
    }

}

   