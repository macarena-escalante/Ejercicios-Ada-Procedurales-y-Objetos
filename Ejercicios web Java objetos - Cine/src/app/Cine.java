package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Cine
 */
public class Cine {

    public int salas;
    public static double precioEntrada;
    public String peliculaDelDia;

    public static List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();

    public static void AgregarPelicula() {
        Pelicula p = new Pelicula("El silencio de los inocentes");
        p.director = "Jonathan Demm";
        p.duracion = 118;
        p.edadMinima = 18;
        listaPeliculas.add(p);
    }

    public static void InicializarListaSalas() {
        Cine.AgregarSala();
    }

    public static void AgregarSala() {

        Sala s = new Sala();
        s.numero = 1;

        Fila f = new Fila("A");

        Asiento a = new Asiento(1);
        a.asientoLibre = true;
        f.asientos.add(a);

        a = new Asiento(2);
        a.asientoLibre= true;
        f.asientos.add(a);

        a = new Asiento(3);
        a.asientoLibre= false;
        f.asientos.add(a);

        a = new Asiento(4);
        a.asientoLibre= true;
        f.asientos.add(a);

        a = new Asiento(5);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(6);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(7);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(8);
        a.asientoLibre=false;
        f.asientos.add(a);

        s.filas.add(f);

        f = new Fila("B");

        a = new Asiento(1);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(2);
        a.asientoLibre= false;
        f.asientos.add(a);

        a = new Asiento(3);
        a.asientoLibre= false;
        f.asientos.add(a);

        a = new Asiento(4);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(5);
        a.asientoLibre= true;
        f.asientos.add(a);

        a = new Asiento(6);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(7);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(8);
        a.asientoLibre=true;
        f.asientos.add(a);

        s.filas.add(f);

        f = new Fila("C");

        a = new Asiento(1);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(2);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(3);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(4);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(5);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(6);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(7);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(8);
        a.asientoLibre=true;
        f.asientos.add(a);

        s.filas.add(f);

        f = new Fila("D");

        a = new Asiento(1);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(2);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(3);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(4);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(5);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(6);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(7);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(8);
        a.asientoLibre=false;
        f.asientos.add(a);

        s.filas.add(f);

        f = new Fila("E");

        a = new Asiento(1);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(2);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(3);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(4);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(5);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(6);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(7);
        a.asientoLibre= false;
        f.asientos.add(a);

        a = new Asiento(8);
        a.asientoLibre=false;
        f.asientos.add(a);

        s.filas.add(f);

        f = new Fila("F");

        a = new Asiento(1);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(2);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(3);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(4);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(5);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(6);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(7);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(8);
        a.asientoLibre=false;
        f.asientos.add(a);

        s.filas.add(f);

        f = new Fila("G");

        a = new Asiento(1);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(2);
        a.asientoLibre= false;
        f.asientos.add(a);

        a = new Asiento(3);
        a.asientoLibre= true;
        f.asientos.add(a);

        a = new Asiento(4);
        a.asientoLibre=false;
        f.asientos.add(a);

        a = new Asiento(5);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(6);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(7);
        a.asientoLibre=true;
        f.asientos.add(a);

        a = new Asiento(8);
        a.asientoLibre=true;
        f.asientos.add(a);

        s.filas.add(f);

    }

    public void verificarEspectador(Espectador ep){
        if (ep.edad >= Pelicula.edadMinima && )
        
    }
}