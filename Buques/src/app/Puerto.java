package app;

import java.util.ArrayList;
import java.util.List;

public class Puerto {

    public String nombre;
    public String lugar;
    public int nroPuerto;

    public Puerto() {

    }

    public List<Contenedor> ContenedoresARecibir = new ArrayList<Contenedor>();
    public static List<Puerto> PuertosDelMundo = Puerto.GetPuertosDelMundo();

    /*
     * No es static la list porque si lo fuese, todos los puertos tendrian la misma
     * lista
     */

    public static List<Puerto> GetPuertosDelMundo() {

        List<Puerto> puertos = new ArrayList<Puerto>();

        Puerto p = new Puerto();
        p.nroPuerto = 1;
        p.nombre = "Puerto de Frutos";
        p.lugar = "El tigre, BA";

        puertos.add(p);

        p = new Puerto();
        p.nroPuerto = 2;
        p.nombre = "Buena suerte";
        p.lugar = "China";

        puertos.add(p);

        p = new Puerto();
        p.nroPuerto = 3;
        p.nombre = "La guaira";
        p.lugar = "Venezuela";

        puertos.add(p);

        return puertos;

    }

    public static Puerto BuscaPuerto(int nro) {
        for (Puerto p : PuertosDelMundo) {
            if (p.nroPuerto == nro)

                return p;
        }
        return null;
    }

}
