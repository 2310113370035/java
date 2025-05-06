package com.music.model;

import java.util.UUID;

public class Song {
    private UUID id;
    private String title;
    private String artist;
    private String genre;
    private int durationSeconds;

    public Song() {
        this.id = UUID.randomUUID();
    }

    public Song(String title, String artist, String genre, int durationSeconds) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.durationSeconds = durationSeconds;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public int getDurationSeconds() { return durationSeconds; }
    public void setDurationSeconds(int durationSeconds) { this.durationSeconds = durationSeconds; }
}