package com.taskmanager.model;

import java.time.LocalDate;
import java.util.UUID;

public class Task {
    private UUID id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private String status;

    public Task() {
        this.id = UUID.randomUUID();
    }

    public Task(String title, String description, LocalDate dueDate, String status) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}