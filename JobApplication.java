package com.jobtracker.model;

import java.time.LocalDate;
import java.util.UUID;

public class JobApplication {
    private UUID id;
    private String companyName;
    private String position;
    private LocalDate applicationDate;
    private String status;

    public JobApplication() {
        this.id = UUID.randomUUID();
    }

    public JobApplication(String companyName, String position, LocalDate applicationDate, String status) {
        this.id = UUID.randomUUID();
        this.companyName = companyName;
        this.position = position;
        this.applicationDate = applicationDate;
        this.status = status;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public LocalDate getApplicationDate() { return applicationDate; }
    public void setApplicationDate(LocalDate applicationDate) { this.applicationDate = applicationDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}