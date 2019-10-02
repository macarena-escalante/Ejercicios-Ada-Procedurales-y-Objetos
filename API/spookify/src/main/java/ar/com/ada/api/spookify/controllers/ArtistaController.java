package ar.com.ada.api.spookify.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.spookify.entities.Artista;

/**
 * ArtistaController
 */
@RestController
public class ArtistaController {

    @GetMapping(value = "/cantantes")
    public List<Artista> getTodos()
    {
        List<Artista> artistas = new ArrayList<Artista>();

        Artista a = new Artista ();
        a.setNombre("Sam Smith");
        a.setEdad(27);

        artistas.add(a);

        a = new Artista ();
        a.setNombre("Adele Adkins");
        a.setEdad(31);

        artistas.add(a);

        return artistas;
    }
    
}