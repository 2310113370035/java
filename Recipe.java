package com.recipe.model;

import java.util.UUID;

public class Recipe {
    private UUID id;
    private String name;
    private String ingredients;
    private String instructions;
    private String cuisineType;

    public Recipe() {
        this.id = UUID.randomUUID();
    }

    public Recipe(String name, String ingredients, String instructions, String cuisineType) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.cuisineType = cuisineType;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }
    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }
    public String getCuisineType() { return cuisineType; }
    public void setCuisineType(String cuisineType) { this.cuisineType = cuisineType; }
}