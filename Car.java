package com.carrental.model;

import java.util.UUID;

public class Car {
    private UUID id;
    private String model;
    private String licensePlate;
    private boolean isRented;
    private double pricePerDay;

    public Car() {
        this.id = UUID.randomUUID();
    }

    public Car(String model, String licensePlate, boolean isRented, double pricePerDay) {
        this.id = UUID.randomUUID();
        this.model = model;
        this.licensePlate = licensePlate;
        this.isRented = isRented;
        this.pricePerDay = pricePerDay;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }
    public boolean isRented() { return isRented; }
    public void setRented(boolean rented) { isRented = rented; }
    public double getPricePerDay() { return pricePerDay; }
    public void setPricePerDay(double pricePerDay) { this.pricePerDay = pricePerDay; }
}