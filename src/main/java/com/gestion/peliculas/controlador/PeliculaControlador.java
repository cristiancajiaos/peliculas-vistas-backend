package com.gestion.peliculas.controlador;

import com.gestion.peliculas.excepciones.ResourceNotFoundException;
import com.gestion.peliculas.modelo.Pelicula;
import com.gestion.peliculas.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/peliculas/{id}")
    public ResponseEntity<Pelicula> obtenerPeliculaPorId(@PathVariable Long id) {
        Pelicula pelicula = repositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException("No existe la película con el ID " + id));
        return ResponseEntity.ok(pelicula);
    }
}
