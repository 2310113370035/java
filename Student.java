package com.school.model;

import java.util.UUID;

public class Student {
    private UUID id;
    private String name;
    private String studentId;
    private int gradeLevel;
    private String enrolledCourses;

    public Student() {
        this.id = UUID.randomUUID();
    }

    public Student(String name, String studentId, int gradeLevel, String enrolledCourses) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.enrolledCourses = enrolledCourses;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public int getGradeLevel() { return gradeLevel; }
    public void setGradeLevel(int gradeLevel) { this.gradeLevel = gradeLevel; }
    public String getEnrolledCourses() { return enrolledCourses; }
    public void setEnrolledCourses(String enrolledCourses) { this.enrolledCourses = enrolledCourses; }
}