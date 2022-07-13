package com.gestion.peliculas.controlador;

import com.gestion.peliculas.excepciones.ResourceNotFoundException;
import com.gestion.peliculas.modelo.Pelicula;
import com.gestion.peliculas.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @PostMapping("/peliculas")
    public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
        return repositorio.save(pelicula);
    }

    @DeleteMapping("/peliculas/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarPelicula(@PathVariable Long id) {
        Pelicula pelicula = repositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException(("No existe la película con el ID " + id)));
        repositorio.delete(pelicula);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar", Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}
