package com.movie.model;

import java.util.UUID;

public class Movie {
    private UUID id;
    private String title;
    private String director;
    private String genre;
    private int releaseYear;

    public Movie() {
        this.id = UUID.randomUUID();
    }

    public Movie(String title, String director, String genre, int releaseYear) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public int getReleaseYear() { return releaseYear; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
}