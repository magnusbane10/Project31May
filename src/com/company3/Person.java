package com.company3;

import com.company4.Angajat;

public class Person {
    private Somer somer;
    private Angajat angajat;
    private Student student;

    public Person() {
    }

    public Person(Somer somer, Angajat angajat, Student student) {
        this.somer = somer;
        this.angajat = angajat;
        this.student = student;
    }

    public Somer getSomer() {
        return somer;
    }

    public void setSomer(Somer somer) {
        this.somer = somer;
    }

    public Angajat getAngajat() {
        return angajat;
    }

    public void setAngajat(Angajat angajat) {
        this.angajat = angajat;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Person{" +
                "somer=" + somer +
                ", angajat=" + angajat +
                ", student=" + student +
                '}';
    }
}
