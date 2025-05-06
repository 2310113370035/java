package com.course.model;

import java.util.UUID;

public class Course {
    private UUID id;
    private String title;
    private String instructor;
    private int durationHours;
    private double price;

    public Course() {
        this.id = UUID.randomUUID();
    }

    public Course(String title, String instructor, int durationHours, double price) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.instructor = instructor;
        this.durationHours = durationHours;
        this.price = price;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) { this.instructor = instructor; }
    public int getDurationHours() { return durationHours; }
    public void setDurationHours(int durationHours) { this.durationHours = durationHours; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}