package com.company;

public class Student extends Person {
    private String facultate;


    public Student(String nume, String facultate) {
        super(nume);
        this.facultate = facultate;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
}
