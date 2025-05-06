package com.petadoption.model;

import java.util.UUID;

public class Pet {
    private UUID id;
    private String name;
    private String species;
    private int age;
    private boolean isAdopted;

    public Pet() {
        this.id = UUID.randomUUID();
    }

    public Pet(String name, String species, int age, boolean isAdopted) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.species = species;
        this.age = age;
        this.isAdopted = isAdopted;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public boolean isAdopted() { return isAdopted; }
    public void setAdopted(boolean adopted) { isAdopted = adopted; }
}