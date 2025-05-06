package com.parking.model;

import java.util.UUID;

public class ParkingSpot {
    private UUID id;
    private String spotNumber;
    private String vehicleType;
    private boolean isOccupied;

    public ParkingSpot() {
        this.id = UUID.randomUUID();
    }

    public ParkingSpot(String spotNumber, String vehicleType, boolean isOccupied) {
        this.id = UUID.randomUUID();
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
        this.isOccupied = isOccupied;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getSpotNumber() { return spotNumber; }
    public void setSpotNumber(String spotNumber) { this.spotNumber = spotNumber; }
    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }
    public boolean isOccupied() { return isOccupied; }
    public void setOccupied(boolean occupied) { isOccupied = occupied; }
}