package com.example.demo;

public class Student {
    private Long studentNumber;
    private Long id;
    private String studentName;
    private Long unit;
    private String enrollmentKey;
    //private Boolean validated;

    public Student(Long studentNumber, Long id, String studentName, Long unit, String enrollmentKey) {
        this.studentNumber = studentNumber;
        this.id = id;
        this.studentName = studentName;
        this.unit = unit;
        this.enrollmentKey = enrollmentKey;
        //this.validated = validated;
    }

    private Student(){}
    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Long getUnit() {
        return unit;
    }

    public void setUnit(Long unit) {
        this.unit = unit;
    }

    public String getEnrollmentKey() {
        return enrollmentKey;
    }

    public void setEnrollmentKey(String enrollmentKey) {
        this.enrollmentKey = enrollmentKey;
    }

   /* public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }*/
}
