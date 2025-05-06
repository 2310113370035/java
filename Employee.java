package com.employee.model;

import java.util.UUID;

public class Employee {
    private UUID id;
    private String name;
    private String employeeId;
    private String department;
    private double salary;

    public Employee() {
        this.id = UUID.randomUUID();
    }

    public Employee(String name, String employeeId, String department, double salary) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}