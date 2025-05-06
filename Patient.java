package com.hospital.model;

import java.time.LocalDate;
import java.util.UUID;

public class Patient {
    private UUID id;
    private String name;
    private String patientId;
    private String diagnosis;
    private LocalDate admissionDate;

    public Patient() {
        this.id = UUID.randomUUID();
    }

    public Patient(String name, String patientId, String diagnosis, LocalDate admissionDate) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.admissionDate = admissionDate;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public LocalDate getAdmissionDate() { return admissionDate; }
    public void setAdmissionDate(LocalDate admissionDate) { this.admissionDate = admissionDate; }
}