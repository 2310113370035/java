package com.blog.model;

import java.time.LocalDate;
import java.util.UUID;

public class BlogPost {
    private UUID id;
    private String title;
    private String content;
    private String author;
    private LocalDate publishedDate;

    public BlogPost() {
        this.id = UUID.randomUUID();
    }

    public BlogPost(String title, String content, String author, LocalDate publishedDate) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.content = content;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public LocalDate getPublishedDate() { return publishedDate; }
    public void setPublishedDate(LocalDate publishedDate) { this.publishedDate = publishedDate; }
}