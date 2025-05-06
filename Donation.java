package com.charity.model;

import java.time.LocalDate;
import java.util.UUID;

public class Donation {
    private UUID id;
    private String donorName;
    private double amount;
    private LocalDate donationDate;
    private String purpose;

    public Donation() {
        this.id = UUID.randomUUID();
    }

    public Donation(String donorName, double amount, LocalDate donationDate, String purpose) {
        this.id = UUID.randomUUID();
        this.donorName = donorName;
        this.amount = amount;
        this.donationDate = donationDate;
        this.purpose = purpose;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getDonorName() { return donorName; }
    public void setDonorName(String donorName) { this.donorName = donorName; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public LocalDate getDonationDate() { return donationDate; }
    public void setDonationDate(LocalDate donationDate) { this.donationDate = donationDate; }
    public String getPurpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose = purpose; }
}