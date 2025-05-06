package com.fitness.model;

import java.time.LocalDate;
import java.util.UUID;

public class Workout {
    private UUID id;
    private String exerciseType;
    private int durationMinutes;
    private LocalDate date;
    private int caloriesBurned;

    public Workout() {
        this.id = UUID.randomUUID();
    }

    public Workout(String exerciseType, int durationMinutes, LocalDate date, int caloriesBurned) {
        this.id = UUID.randomUUID();
        this.exerciseType = exerciseType;
        this.durationMinutes = durationMinutes;
        this.date = date;
        this.caloriesBurned = caloriesBurned;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getExerciseType() { return exerciseType; }
    public void setExerciseType(String exerciseType) { this.exerciseType = exerciseType; }
    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public int getCaloriesBurned() { return caloriesBurned; }
    public void setCaloriesBurned(int caloriesBurned) { this.caloriesBurned = caloriesBurned; }
}