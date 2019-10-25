package app;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

    public int idContenedor;
    public int peso; // en toneladas
    public Puerto puertoArribo; // puertoArribo es tipo Puerto (obj)

    public List<Puerto> PuertosDeArribo = new ArrayList<Puerto>();

    public Puerto getPuerto(String puertoArribo) {
        for (Puerto p : this.PuertosDeArribo) {
            if (puertoArribo.equals(p.nombre)) {
                return p;
            }

        }
        return null;
    }

    public Contenedor() {

    }
}