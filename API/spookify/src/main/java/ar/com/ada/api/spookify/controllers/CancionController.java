package ar.com.ada.api.spookify.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.spookify.entities.Cancion;

/**
 * CancionController
 */
@RestController
public class CancionController {

    @GetMapping(value= "/temas")
    public List<Cancion> getTodas()
    {
        
        List<Cancion> temas = new ArrayList<Cancion>();

        Cancion c = new Cancion();
        c.setTitulo("Stay with me");
        c.setDuracion(2.53);

        temas.add(c);
        
        c = new Cancion();
        c.setTitulo("All i ask");
        c.setDuracion(4.32);

        temas.add(c);

        return temas;
    }


}