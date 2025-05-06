package com.eventplanner.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Event {
    private UUID id;
    private String name;
    private LocalDateTime dateTime;
    private String location;
    private String organizer;

    public Event() {
        this.id = UUID.randomUUID();
    }

    public Event(String name, LocalDateTime dateTime, String location, String organizer) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
        this.organizer = organizer;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDateTime getDateTime() { return dateTime; }
    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getOrganizer() { return organizer; }
    public void setOrganizer(String organizer) { this.organizer = organizer; }
}