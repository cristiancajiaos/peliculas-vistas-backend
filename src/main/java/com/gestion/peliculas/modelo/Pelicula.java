package com.gestion.peliculas.modelo;

import java.time.LocalDate;

public class Pelicula {
    private int id;
    private String title;
    private String originalTitle;
    private int year;
    private LocalDate dateSeen;
    private String language;

    public Pelicula(int id, String title, String originalTitle, int year, LocalDate dateSeen, String language) {
        this.id = id;
        this.title = title;
        this.originalTitle = originalTitle;
        this.year = year;
        this.dateSeen = dateSeen;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}

