package com.travel.model;

import java.time.LocalDate;
import java.util.UUID;

public class Itinerary {
    private UUID id;
    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;
    private String activities;
    private double budget;

    public Itinerary() {
        this.id = UUID.randomUUID();
    }

    public Itinerary(String destination, LocalDate startDate, LocalDate endDate, String activities, double budget) {
        this.id = UUID.randomUUID();
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.activities = activities;
        this.budget = budget;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }
    public String getActivities() { return activities; }
    public void setActivities(String activities) { this.activities = activities; }
    public double getBudget() { return budget; }
    public void setBudget(double budget) { this.budget = budget; }
}