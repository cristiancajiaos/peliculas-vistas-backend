package com.gestion.peliculas.controlador;

import com.gestion.peliculas.modelo.Pelicula;
import com.gestion.peliculas.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class PeliculaControlador {

    @Autowired
    private PeliculaRepositorio repositorio;

    @GetMapping("/peliculas")
    public List<Pelicula> obtenerPeliculasVistas() {
        return repositorio.findAll();
    }
}
