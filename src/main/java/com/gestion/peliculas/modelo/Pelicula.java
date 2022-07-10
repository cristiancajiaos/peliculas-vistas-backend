package com.gestion.peliculas.modelo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "seen_movies")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 255, nullable = false)
    private String title;

    @Column(name = "original_title", length = 255, nullable = false)
    private String originalTitle;

    @Column(name = "year", length = 4, nullable = false)
    private int year;

    @Column(name = "date_seen", length = 10, nullable = false)
    private LocalDate dateSeen;

    @Column(name = "movie_language", length = 255, nullable = false)
    private String language;

    @Column(name = "seen_on", length = 255, nullable = false)
    private String seenOn;

    public Pelicula() {

    }

    public Pelicula(Long id, String title, String originalTitle, int year, LocalDate dateSeen, String language, String seenOn) {
        super();
        this.id = id;
        this.title = title;
        this.originalTitle = originalTitle;
        this.year = year;
        this.dateSeen = dateSeen;
        this.language = language;
        this.seenOn = seenOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getDateSeen() {
        return dateSeen;
    }

    public void setDateSeen(LocalDate dateSeen) {
        this.dateSeen = dateSeen;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSeenOn() {
        return seenOn;
    }

    public void setSeenOn(String seenOn) {
        this.seenOn = seenOn;
    }

}

