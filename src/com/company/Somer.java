package com.company;

public class Somer  extends Person {
    private String meserieDeBaza;

    public Somer(String nume, String meserieDeBaza) {
        super(nume);
        this.meserieDeBaza = meserieDeBaza;
    }

    public String getMeserieDeBaza() {
        return meserieDeBaza;
    }

    public void setMeserieDeBaza(String meserieDeBaza) {
        this.meserieDeBaza = meserieDeBaza;
    }


}
