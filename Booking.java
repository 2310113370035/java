package com.hotel.model;

import java.time.LocalDate;
import java.util.UUID;

public class Booking {
    private UUID id;
    private String roomNumber;
    private String guestName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Booking() {
        this.id = UUID.randomUUID();
    }

    public Booking(String roomNumber, String guestName, LocalDate checkInDate, LocalDate checkOutDate) {
        this.id = UUID.randomUUID();
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public String getGuestName() { return guestName; }
    public void setGuestName(String guestName) { this.guestName = guestName; }
    public LocalDate getCheckInDate() { return checkInDate; }
    public void setCheckInDate(LocalDate checkInDate) { this.checkInDate = checkInDate; }
    public LocalDate getCheckOutDate() { return checkOutDate; }
    public void setCheckOutDate(LocalDate checkOutDate) { this.checkOutDate = checkOutDate; }
}