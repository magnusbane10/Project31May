package com.company;

public class Angajat extends Person {
    private int salariu;

    public Angajat(String nume, int salariu) {
        super(nume);
        this.salariu = salariu;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }


}
