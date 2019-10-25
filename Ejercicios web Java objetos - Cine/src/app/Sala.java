package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Sala
 */
public class Sala {

    public int numero;

    public List<Fila> filas = new ArrayList<Fila>();{

    public static Pelicula BuscarPelicula(String titulo) {

        for (Pelicula p : Cine.ListaPeliculas) {
            if (titulo.equals(p.peliculaDelDia)){
                return p;
            }
        }
}
    }

    


}