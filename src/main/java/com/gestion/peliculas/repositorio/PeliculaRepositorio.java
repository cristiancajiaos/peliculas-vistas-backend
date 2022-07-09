package com.gestion.peliculas.repositorio;

import com.gestion.peliculas.modelo.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PeliculaRepositorio extends JpaRepository<Pelicula, Long> {

}
