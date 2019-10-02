package ar.com.ada.api.spookify.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.spookify.entities.Album;

/**
 * AlbumController
 */
@RestController
public class AlbumController {

    @GetMapping (value = "albums")
    public List<Album> getTodos()
    {
        List<Album> albums = new ArrayList<Album>();

        Album a = new Album();
        a.setTitulo("In the lonely tour");
        a.setAnio(2014);
        a.setDuracion(32);
        albums.add(a);

        a = new Album();
        a.setTitulo("25");
        a.setAnio(2016);
        a.setDuracion(48);
        albums.add(a);

        return albums;
        

    }
    
}