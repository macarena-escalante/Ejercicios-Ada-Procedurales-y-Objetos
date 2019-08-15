package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Netflix
 */
public class Netflix {

    public static List<Peli> CatalogoPelis = new ArrayList<Peli>();
    public static List<Serie> CatalogoSeries = new ArrayList<Serie>();

    

    public static Serie BuscarSerie(String nombre) {

        for (Serie s : Netflix.CatalogoSeries) {
            if (nombre.equals(s.nombre)) { // Se puede buscar por nombre, año, genero poniendo s.genero
                return s;

            }
        }
        return null;
    }

    public static Peli BuscarPeli(String nombre) {

        for (Peli p : Netflix.CatalogoPelis) {
            if (nombre.equals(p.nombre)) {
                return p;
            }

        }
        return null;
    }

    public static void InicializarCatalogo() {
         Netflix.AgregarTwd ();
    }
    public static void AgregarTwd ()
    {
        Serie twd = new Serie ();
        twd.nombre = "The walking dead";
        twd.anio= 2010;
        twd.genero= "Drama post apocalíptico";

        Temporada t1 = new Temporada ();
        t1.nroTemporada = 1;
        t1.anio= 2010;
        
        Episodio ep1 = new Episodio ();
        ep1.nroEpisodio = 1;
        ep1.titulo ="Days Gone Bye";
        t1.episodios.add(ep1);


        Episodio ep2 = new Episodio ();
        ep2.nroEpisodio = 2;
        ep2.titulo = "Guts";
        t1.episodios.add(ep2);

        Episodio ep3 = new Episodio ();
        ep3.nroEpisodio = 3;
        ep3.titulo = "Tell It to the Frogs";
        t1.episodios.add(ep3);

        Episodio ep4 = new Episodio ();
        ep4.nroEpisodio = 4;
        ep4.titulo = "Vatos";
        t1.episodios.add(ep4);

        Episodio ep5 = new Episodio ();
        ep5.nroEpisodio = 5;
        ep5.titulo = "Wildfire";
        t1.episodios.add(ep5);

        Episodio ep6 = new Episodio ();
        ep6.nroEpisodio = 6;
        ep6.titulo = "TS-19";
        t1.episodios.add(ep6);

        twd.temporadas.add(t1);

        Temporada wep1 = new Temporada ();
        wep1.nroTemporada= 1-1;
        wep1.nombre= "Torn Apart";
        wep1.anio= 2011;

        Websodio w1= new Websodio ();
        w1.nroEpisodio = 1;
        w1.titulo= "A New Day";
        wep1.episodios.add(w1);

        Websodio w2= new Websodio ();
        w2.nroEpisodio = 2;
        w2.titulo= "Family Matters";
        wep1.episodios.add(w2);

        Websodio w3= new Websodio ();
        w3.nroEpisodio = 3;
        w3.titulo= "Domestic Violence";
        wep1.episodios.add(w3);

        Websodio w4= new Websodio ();
        w4.nroEpisodio = 4;
        w4.titulo= "Neighborly Advice";
        wep1.episodios.add(w4);

        Websodio w5= new Websodio ();
        w5.nroEpisodio = 5;
        w5.titulo= "Step-Mother";
        wep1.episodios.add(w5);

        Websodio w6= new Websodio ();
        w6.nroEpisodio = 6;
        w6.titulo= "Everything Dies";
        wep1.episodios.add(w6);

        twd.temporadas.add(wep1);

        Temporada t2 = new Temporada ();
        t2.nroTemporada = 2;
        t2.anio= 2011/2012;

        Episodio ep1t2= new Episodio();
        ep1t2.nroEpisodio = 1;
        ep1t2.titulo= "What Lies Ahead";
        t2.episodios.add(ep1t2);

        Episodio ep2t2= new Episodio();
        ep2t2.nroEpisodio = 2;
        ep2t2.titulo= "Bloodletting";
        t2.episodios.add(ep2t2);

        Episodio ep3t2= new Episodio();
        ep3t2.nroEpisodio = 3;
        ep3t2.titulo= "Save the Last One";
        t2.episodios.add(ep3t2);

        Episodio ep4t2= new Episodio();
        ep4t2.nroEpisodio = 4;
        ep4t2.titulo= "Cherokee Rose";
        t2.episodios.add(ep4t2);

        Episodio ep5t2= new Episodio();
        ep5t2.nroEpisodio = 5;
        ep5t2.titulo= "Chupacabra";
        t2.episodios.add(ep5t2);

        Episodio ep6t2= new Episodio();
        ep6t2.nroEpisodio = 6;
        ep6t2.titulo= "Secrets";
        t2.episodios.add(ep6t2);

        Episodio ep7t2= new Episodio();
        ep7t2.nroEpisodio = 7;
        ep7t2.titulo= "Pretty Much Dead Already";
        t2.episodios.add(ep7t2);

        Episodio ep8t2= new Episodio();
        ep8t2.nroEpisodio = 8;
        ep8t2.titulo= "Nebraska";
        t2.episodios.add(ep8t2);

        Episodio ep9t2= new Episodio();
        ep9t2.nroEpisodio = 9;
        ep9t2.titulo= "Triggerfinger";
        t2.episodios.add(ep9t2);

        Episodio ep10t2= new Episodio();
        ep10t2.nroEpisodio = 10;
        ep10t2.titulo= "18 Miles Out";
        t2.episodios.add(ep10t2);

        Episodio ep11t2= new Episodio();
        ep11t2.nroEpisodio = 11;
        ep11t2.titulo= "Judge, Jury, Executioner";
        t2.episodios.add(ep11t2);

        Episodio ep12t2= new Episodio();
        ep12t2.nroEpisodio = 12;
        ep12t2.titulo= "Better Angels";
        t2.episodios.add(ep12t2);

        Episodio ep13t2= new Episodio();
        ep13t2.nroEpisodio = 13;
        ep13t2.titulo= "Beside the Dying Fire";
        t2.episodios.add(ep13t2);

        twd.temporadas.add(t2);

        Temporada wep2 = new Temporada ();
        wep2.nroTemporada = 2-2;
        wep2.nombre = "Cold Storage";
        wep2.anio = 2012;

        Websodio w1wep2 = new Websodio ();
        w1wep2.nroEpisodio = 1;
        w1wep2.titulo = "Hide and Seek";
        wep2.episodios.add(w1wep2);

        Websodio w2wep2 = new Websodio ();
        w2wep2.nroEpisodio = 2;
        w2wep2.titulo = "Keys to the Kingdom";
        wep2.episodios.add(w2wep2);

        Websodio w3wep2 = new Websodio ();
        w3wep2.nroEpisodio = 3;
        w3wep2.titulo = "The Chosen Ones";
        wep2.episodios.add(w3wep2);

        Websodio w4wep2 = new Websodio ();
        w4wep2.nroEpisodio = 4;
        w4wep2.titulo = "Parting Shots";
        wep2.episodios.add(w4wep2);

        twd.temporadas.add(wep2);
        

        Temporada t3 = new Temporada ();
        t3.nroTemporada = 3;
        t3.anio= 2012/2013;

        Episodio ep1t3= new Episodio();
        ep1t3.nroEpisodio = 1;
        ep1t3.titulo= "Seed";
        t3.episodios.add(ep1t3);

        Episodio ep2t3= new Episodio();
        ep2t3.nroEpisodio = 2;
        ep2t3.titulo= "Sick";
        t3.episodios.add(ep2t3);

        Episodio ep3t3= new Episodio();
        ep3t2.nroEpisodio = 3;
        ep3t2.titulo= "Walk with Me";
        t3.episodios.add(ep3t3);

        Episodio ep4t3= new Episodio();
        ep4t3.nroEpisodio = 4;
        ep4t3.titulo= "Killer Within";
        t3.episodios.add(ep4t3);

        Episodio ep5t3= new Episodio();
        ep5t3.nroEpisodio = 5;
        ep5t3.titulo= "Say the Word";
        t3.episodios.add(ep5t3);

        Episodio ep6t3= new Episodio();
        ep6t3.nroEpisodio = 6;
        ep6t3.titulo= "Hounded";
        t3.episodios.add(ep6t3);

        Episodio ep7t3= new Episodio();
        ep7t3.nroEpisodio = 7;
        ep7t3.titulo= "When the Dead Come Knocking";
        t3.episodios.add(ep7t3);

        Episodio ep8t3= new Episodio();
        ep8t3.nroEpisodio = 8;
        ep8t3.titulo= "Made to Suffer";
        t3.episodios.add(ep8t3);

        Episodio ep9t3= new Episodio();
        ep9t3.nroEpisodio = 9;
        ep9t3.titulo= "The Suicide King";
        t3.episodios.add(ep9t3);

        Episodio ep10t3= new Episodio();
        ep10t3.nroEpisodio = 10;
        ep10t3.titulo= "Home";
        t3.episodios.add(ep10t3);

        Episodio ep11t3= new Episodio();
        ep11t3.nroEpisodio = 11;
        ep11t3.titulo= "I Ain't a Judas";
        t3.episodios.add(ep11t3);

        Episodio ep12t3= new Episodio();
        ep12t3.nroEpisodio = 12;
        ep12t3.titulo= "Clear";
        t3.episodios.add(ep12t3);

        Episodio ep13t3= new Episodio();
        ep13t3.nroEpisodio = 13;
        ep13t3.titulo= "Arrow on the Doorpost";
        t3.episodios.add(ep13t3);

        Episodio ep14t3= new Episodio();
        ep14t3.nroEpisodio = 14;
        ep14t3.titulo= "Prey";
        t3.episodios.add(ep14t3);

        Episodio ep15t3= new Episodio();
        ep15t3.nroEpisodio = 15;
        ep15t3.titulo= "This Sorrowful Life";
        t3.episodios.add(ep15t3);

        Episodio ep16t3= new Episodio();
        ep16t3.nroEpisodio = 16;
        ep16t3.titulo= "Welcome to the Tombs";
        t3.episodios.add(ep16t3);

        twd.temporadas.add(t3);

        Temporada wep3 = new Temporada ();
        wep3.nroTemporada = 3-3;
        wep3.nombre = "The Oath";
        wep3.anio = 2013;

        Websodio w1wep3 = new Websodio ();
        w1wep3.nroEpisodio = 1;
        w1wep3.titulo = "Alone";
        wep3.episodios.add(w1wep3);

        Websodio w2wep3 = new Websodio ();
        w2wep3.nroEpisodio = 2;
        w2wep3.titulo = "Choice";
        wep3.episodios.add(w2wep3);

        Websodio w3wep3 = new Websodio ();
        w3wep3.nroEpisodio = 3;
        w3wep3.titulo = "Bond";
        wep3.episodios.add(w3wep3);

        twd.temporadas.add(wep3);

        Temporada t4 = new Temporada ();
        t4.nroTemporada = 4;
        t4.anio= 2013/2014;

        Episodio ep1t4= new Episodio();
        ep1t4.nroEpisodio = 1;
        ep1t4.titulo= "30 Days Without an Accident";
        t4.episodios.add(ep1t4);

        Episodio ep2t4= new Episodio();
        ep2t4.nroEpisodio = 2;
        ep2t4.titulo= "Infected";
        t4.episodios.add(ep2t4);

        Episodio ep3t4= new Episodio();
        ep3t4.nroEpisodio = 3;
        ep3t4.titulo= "Insolation";
        t4.episodios.add(ep3t4);

        Episodio ep4t4= new Episodio();
        ep4t4.nroEpisodio = 4;
        ep4t4.titulo= "Indifference";
        t4.episodios.add(ep4t4);

        Episodio ep5t4= new Episodio();
        ep5t4.nroEpisodio = 5;
        ep5t4.titulo= "Internment";
        t4.episodios.add(ep5t4);

        Episodio ep6t4= new Episodio();
        ep6t4.nroEpisodio = 6;
        ep6t4.titulo= "Live Bait";
        t4.episodios.add(ep6t4);

        Episodio ep7t4= new Episodio();
        ep7t4.nroEpisodio = 7;
        ep7t4.titulo= "Dead Weight";
        t4.episodios.add(ep7t4);

        Episodio ep8t4= new Episodio();
        ep8t4.nroEpisodio = 8;
        ep8t4.titulo= "Too Far Gone";
        t4.episodios.add(ep8t4);

        Episodio ep9t4= new Episodio();
        ep9t4.nroEpisodio = 9;
        ep9t4.titulo= "After";
        t4.episodios.add(ep9t4);

        Episodio ep10t4= new Episodio();
        ep10t4.nroEpisodio = 10;
        ep10t4.titulo= "Inmate";
        t4.episodios.add(ep10t4);

        Episodio ep11t4= new Episodio();
        ep11t4.nroEpisodio = 11;
        ep11t4.titulo= "Claimed";
        t4.episodios.add(ep11t4);

        Episodio ep12t4= new Episodio();
        ep12t4.nroEpisodio = 12;
        ep12t4.titulo= "Still";
        t4.episodios.add(ep12t4);

        Episodio ep13t4= new Episodio();
        ep13t4.nroEpisodio = 13;
        ep13t4.titulo= "Alone";
        t4.episodios.add(ep13t4);

        Episodio ep14t4= new Episodio();
        ep14t4.nroEpisodio = 14;
        ep14t4.titulo= "The Grove";
        t4.episodios.add(ep14t4);

        Episodio ep15t4= new Episodio();
        ep15t4.nroEpisodio = 15;
        ep15t4.titulo= "US";
        t4.episodios.add(ep15t4);

        Episodio ep16t4= new Episodio();
        ep16t4.nroEpisodio = 16;
        ep16t4.titulo= "A";
        t4.episodios.add(ep16t4);

        twd.temporadas.add(t4);


        Temporada t5 = new Temporada ();
        t5.nroTemporada = 5;
        t5.anio= 2014/2015;

        Episodio ep1t5= new Episodio();
        ep1t5.nroEpisodio = 1;
        ep1t5.titulo= "No Sanctuary";
        t5.episodios.add(ep1t5);

        Episodio ep2t5= new Episodio();
        ep2t5.nroEpisodio = 2;
        ep2t5.titulo= "Strangers";
        t5.episodios.add(ep2t5);

        Episodio ep3t5= new Episodio();
        ep3t5.nroEpisodio = 3;
        ep3t5.titulo= "Four Walls and a Roof";
        t5.episodios.add(ep3t5);

        Episodio ep4t5= new Episodio();
        ep4t5.nroEpisodio = 4;
        ep4t5.titulo= "Slabtown";
        t5.episodios.add(ep4t5);

        Episodio ep5t5= new Episodio();
        ep5t5.nroEpisodio = 5;
        ep5t5.titulo= "Self Help";
        t5.episodios.add(ep5t5);

        Episodio ep6t5= new Episodio();
        ep6t5.nroEpisodio = 6;
        ep6t5.titulo= "Consumed";
        t5.episodios.add(ep6t5);

        Episodio ep7t5= new Episodio();
        ep7t5.nroEpisodio = 7;
        ep7t5.titulo= "Crossed";
        t5.episodios.add(ep7t5);

        Episodio ep8t5= new Episodio();
        ep8t5.nroEpisodio = 8;
        ep8t5.titulo= "Coda";
        t5.episodios.add(ep8t5);

        Episodio ep9t5= new Episodio();
        ep9t5.nroEpisodio = 9;
        ep9t5.titulo= "What Happened and What's Going On";
        t5.episodios.add(ep9t5);

        Episodio ep10t5= new Episodio();
        ep10t5.nroEpisodio = 10;
        ep10t5.titulo= "Them";
        t5.episodios.add(ep10t5);

        Episodio ep11t5= new Episodio();
        ep11t5.nroEpisodio = 11;
        ep11t5.titulo= "The Distance";
        t5.episodios.add(ep11t5);

        Episodio ep12t5= new Episodio();
        ep12t5.nroEpisodio = 12;
        ep12t5.titulo= "Remember";
        t5.episodios.add(ep12t5);

        Episodio ep13t5= new Episodio();
        ep13t5.nroEpisodio = 13;
        ep13t5.titulo= "Forget";
        t5.episodios.add(ep13t5);

        Episodio ep14t5= new Episodio();
        ep14t5.nroEpisodio = 14;
        ep14t5.titulo= "Spend";
        t5.episodios.add(ep14t5);

        Episodio ep15t5= new Episodio();
        ep15t5.nroEpisodio = 15;
        ep15t5.titulo= "Try";
        t5.episodios.add(ep15t5);

        Episodio ep16t5= new Episodio();
        ep16t5.nroEpisodio = 16;
        ep16t5.titulo= "Conquer";
        t5.episodios.add(ep16t5);

        twd.temporadas.add(t5);

        Temporada t6 = new Temporada ();
        t6.nroTemporada = 6;
        t6.anio= 2015/2016;

        Episodio ep1t6= new Episodio();
        ep1t6.nroEpisodio = 1;
        ep1t6.titulo= "First Time Again";
        t6.episodios.add(ep1t6);

        Episodio ep2t6= new Episodio();
        ep2t6.nroEpisodio = 2;
        ep2t6.titulo= "JSS";
        t6.episodios.add(ep2t6);

        Episodio ep3t6= new Episodio();
        ep3t6.nroEpisodio = 3;
        ep3t6.titulo= "Thank You";
        t6.episodios.add(ep3t6);

        Episodio ep4t6= new Episodio();
        ep4t6.nroEpisodio = 4;
        ep4t6.titulo= "Here's Not Here";
        t6.episodios.add(ep4t6);

        Episodio ep5t6= new Episodio();
        ep5t6.nroEpisodio = 5;
        ep5t6.titulo= "Now";
        t6.episodios.add(ep5t6);

        Episodio ep6t6= new Episodio();
        ep6t6.nroEpisodio = 6;
        ep6t6.titulo= "Always Accountable";
        t6.episodios.add(ep6t6);

        Episodio ep7t6= new Episodio();
        ep7t6.nroEpisodio = 7;
        ep7t6.titulo= "Heads Up";
        t6.episodios.add(ep7t6);

        Episodio ep8t6= new Episodio();
        ep8t6.nroEpisodio = 8;
        ep8t6.titulo= "Start to Finish";
        t6.episodios.add(ep8t6);

        Episodio ep9t6= new Episodio();
        ep9t6.nroEpisodio = 9;
        ep9t6.titulo= "No Way Out";
        t6.episodios.add(ep9t6);

        Episodio ep10t6= new Episodio();
        ep10t6.nroEpisodio = 10;
        ep10t6.titulo= "The Next World";
        t6.episodios.add(ep10t6);

        Episodio ep11t6= new Episodio();
        ep11t6.nroEpisodio = 11;
        ep11t6.titulo= "Knots Untie";
        t6.episodios.add(ep11t6);

        Episodio ep12t6= new Episodio();
        ep12t6.nroEpisodio = 12;
        ep12t6.titulo= "Not Tomorrow Yet";
        t6.episodios.add(ep12t6);

        Episodio ep13t6= new Episodio();
        ep13t6.nroEpisodio = 13;
        ep13t6.titulo= "The Same Boat";
        t6.episodios.add(ep13t6);

        Episodio ep14t6= new Episodio();
        ep14t6.nroEpisodio = 14;
        ep14t6.titulo= "Twice as Far";
        t6.episodios.add(ep14t6);

        Episodio ep15t6= new Episodio();
        ep15t6.nroEpisodio = 15;
        ep15t6.titulo= "East";
        t6.episodios.add(ep15t6);

        Episodio ep16t6= new Episodio();
        ep16t6.nroEpisodio = 16;
        ep16t6.titulo= "Last Day on Earth";
        t6.episodios.add(ep16t6);

        twd.temporadas.add(t6);

        Temporada t7 = new Temporada ();
        t7.nroTemporada = 7;
        t7.anio= 2016/2017;

        Episodio ep1t7= new Episodio();
        ep1t7.nroEpisodio = 1;
        ep1t7.titulo= "The Day Will Come When You Won't Be";
        t7.episodios.add(ep1t7);

        Episodio ep2t7= new Episodio();
        ep2t7.nroEpisodio = 2;
        ep2t7.titulo= "The Well";
        t7.episodios.add(ep2t7);

        Episodio ep3t7= new Episodio();
        ep3t7.nroEpisodio = 3;
        ep3t7.titulo= "The Cell";
        t7.episodios.add(ep3t7);

        Episodio ep4t7= new Episodio();
        ep4t7.nroEpisodio = 4;
        ep4t7.titulo= "Service";
        t7.episodios.add(ep4t7);

        Episodio ep5t7= new Episodio();
        ep5t7.nroEpisodio = 5;
        ep5t7.titulo= "Go Getters";
        t7.episodios.add(ep5t7);

        Episodio ep6t7= new Episodio();
        ep6t7.nroEpisodio = 6;
        ep6t7.titulo= "Swear";
        t7.episodios.add(ep6t7);

        Episodio ep7t7= new Episodio();
        ep7t7.nroEpisodio = 7;
        ep7t7.titulo= "Sing Me a Song";
        t7.episodios.add(ep7t7);

        Episodio ep8t7= new Episodio();
        ep8t7.nroEpisodio = 8;
        ep8t7.titulo= "Hearts Still Beating";
        t7.episodios.add(ep8t7);

        Episodio ep9t7= new Episodio();
        ep9t7.nroEpisodio = 9;
        ep9t7.titulo= "Rock in the Road";
        t7.episodios.add(ep9t7);

        Episodio ep10t7= new Episodio();
        ep10t7.nroEpisodio = 10;
        ep10t7.titulo= "New Best Friends";
        t7.episodios.add(ep10t7);

        Episodio ep11t7= new Episodio();
        ep11t7.nroEpisodio = 11;
        ep11t7.titulo= "Hostiles and Calamities";
        t7.episodios.add(ep11t7);

        Episodio ep12t7= new Episodio();
        ep12t7.nroEpisodio = 12;
        ep12t7.titulo= "Say Yes";
        t7.episodios.add(ep12t7);

        Episodio ep13t7= new Episodio();
        ep13t7.nroEpisodio = 13;
        ep13t7.titulo= "Bury Me Here";
        t7.episodios.add(ep13t7);

        Episodio ep14t7= new Episodio();
        ep14t7.nroEpisodio = 14;
        ep14t7.titulo= "The Other Side";
        t7.episodios.add(ep14t7);

        Episodio ep15t7= new Episodio();
        ep15t7.nroEpisodio = 15;
        ep15t7.titulo= "Something They Need";
        t7.episodios.add(ep15t7);

        Episodio ep16t7= new Episodio();
        ep16t7.nroEpisodio = 16;
        ep16t7.titulo= "The First Day of the Rest of Your Life";
        t7.episodios.add(ep16t7);

        twd.temporadas.add(t7);

        Temporada t8 = new Temporada ();
        t8.nroTemporada = 8;
        t8.anio= 2017/2018;

        Episodio ep1t8= new Episodio();
        ep1t8.nroEpisodio = 1;
        ep1t8.titulo= "Mercy";
        t8.episodios.add(ep1t8);

        Episodio ep2t8= new Episodio();
        ep2t8.nroEpisodio = 2;
        ep2t8.titulo= "The Damned";
        t8.episodios.add(ep2t8);

        Episodio ep3t8= new Episodio();
        ep3t8.nroEpisodio = 3;
        ep3t8.titulo= "Monsters";
        t8.episodios.add(ep3t8);

        Episodio ep4t8= new Episodio();
        ep4t8.nroEpisodio = 4;
        ep4t8.titulo= "Some Guy";
        t8.episodios.add(ep4t8);

        Episodio ep5t8= new Episodio();
        ep5t8.nroEpisodio = 5;
        ep5t8.titulo= "The Big Scary U";
        t8.episodios.add(ep5t8);

        Episodio ep6t8= new Episodio();
        ep6t8.nroEpisodio = 6;
        ep6t8.titulo= "The King, the Widow and Rick";
        t8.episodios.add(ep6t8);

        Episodio ep7t8= new Episodio();
        ep7t8.nroEpisodio = 7;
        ep7t8.titulo= "Time for After";
        t8.episodios.add(ep7t8);

        Episodio ep8t8= new Episodio();
        ep8t8.nroEpisodio = 8;
        ep8t8.titulo= "How It's Gotta Be";
        t8.episodios.add(ep8t8);

        Episodio ep9t8= new Episodio();
        ep9t8.nroEpisodio = 9;
        ep9t8.titulo= "Honor";
        t8.episodios.add(ep9t8);

        Episodio ep10t8= new Episodio();
        ep10t8.nroEpisodio = 10;
        ep10t8.titulo= "The Lost and the Plunderers";
        t8.episodios.add(ep10t8);

        Episodio ep11t8= new Episodio();
        ep11t8.nroEpisodio = 11;
        ep11t8.titulo= "Dead or Alive Or";
        t8.episodios.add(ep11t8);

        Episodio ep12t8= new Episodio();
        ep12t8.nroEpisodio = 12;
        ep12t8.titulo= "The Key";
        t8.episodios.add(ep12t8);

        Episodio ep13t8= new Episodio();
        ep13t8.nroEpisodio = 13;
        ep13t8.titulo= "Do Not Send Us Astray";
        t8.episodios.add(ep13t8);

        Episodio ep14t8= new Episodio();
        ep14t8.nroEpisodio = 14;
        ep14t8.titulo= "Still Gotta Mean Something";
        t8.episodios.add(ep14t8);

        Episodio ep15t8= new Episodio();
        ep15t8.nroEpisodio = 15;
        ep15t8.titulo= "Worth";
        t8.episodios.add(ep15t8);

        Episodio ep16t8= new Episodio();
        ep16t8.nroEpisodio = 16;
        ep16t8.titulo= "Wrath";
        t8.episodios.add(ep16t8);

        twd.temporadas.add(t8);

        Temporada t9 = new Temporada ();
        t9.nroTemporada = 9;
        t9.anio= 2018/2019;

        Episodio ep1t9= new Episodio();
        ep1t9.nroEpisodio = 1;
        ep1t9.titulo= "A New Beginning";
        t9.episodios.add(ep1t9);

        Episodio ep2t9= new Episodio();
        ep2t9.nroEpisodio = 2;
        ep2t9.titulo= "The Bridge";
        t9.episodios.add(ep2t9);

        Episodio ep3t9= new Episodio();
        ep3t9.nroEpisodio = 3;
        ep3t9.titulo= "Warning Signs";
        t9.episodios.add(ep3t9);

        Episodio ep4t9= new Episodio();
        ep4t9.nroEpisodio = 4;
        ep4t9.titulo= "The Obliged";
        t9.episodios.add(ep4t9);

        Episodio ep5t9= new Episodio();
        ep5t9.nroEpisodio = 5;
        ep5t9.titulo= "What Comes After";
        t9.episodios.add(ep5t9);

        Episodio ep6t9= new Episodio();
        ep6t9.nroEpisodio = 6;
        ep6t9.titulo= "Who Are You Now?";
        t9.episodios.add(ep6t9);

        Episodio ep7t9= new Episodio();
        ep7t9.nroEpisodio = 7;
        ep7t9.titulo= "Stradivarius";
        t9.episodios.add(ep7t9);

        Episodio ep8t9= new Episodio();
        ep8t9.nroEpisodio = 8;
        ep8t9.titulo= "Evolution";
        t9.episodios.add(ep8t9);

        Episodio ep9t9= new Episodio();
        ep9t9.nroEpisodio = 9;
        ep9t9.titulo= "Adaptation";
        t9.episodios.add(ep9t9);

        Episodio ep10t9= new Episodio();
        ep10t9.nroEpisodio = 10;
        ep10t9.titulo= "Omega";
        t9.episodios.add(ep10t9);

        Episodio ep11t9= new Episodio();
        ep11t9.nroEpisodio = 11;
        ep11t9.titulo= "Bounty";
        t9.episodios.add(ep11t9);

        Episodio ep12t9= new Episodio();
        ep12t9.nroEpisodio = 12;
        ep12t9.titulo= "Guardians";
        t9.episodios.add(ep12t9);

        Episodio ep13t9= new Episodio();
        ep13t9.nroEpisodio = 13;
        ep13t9.titulo= "Chokepoint";
        t9.episodios.add(ep13t9);

        Episodio ep14t9= new Episodio();
        ep14t9.nroEpisodio = 14;
        ep14t9.titulo= "Scars";
        t9.episodios.add(ep14t9);

        Episodio ep15t9= new Episodio();
        ep15t9.nroEpisodio = 15;
        ep15t9.titulo= "The Calm Before";
        t9.episodios.add(ep15t9);

        Episodio ep16t9= new Episodio();
        ep16t9.nroEpisodio = 16;
        ep16t9.titulo= "The Storm";
        t9.episodios.add(ep16t9);

        twd.temporadas.add(t9);


        Temporada t10 = new Temporada ();
        t10.nroTemporada = 10;
        t10.anio= 2019/2020;  //cómo le agrego un "próximamente?"

        twd.temporadas.add(t10);

        Netflix.CatalogoSeries.add(twd);

        
        


    }
}