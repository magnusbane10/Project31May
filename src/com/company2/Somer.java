package com.company2;

public class Somer extends Persoana {
    private boolean timpLiber;
    private String meserieDeBaza;

    public Somer(int varsta, String nume, String cnp, Adresa adresa, boolean timpLiber, String meserieDeBaza) {
        super(varsta, nume, cnp, adresa);
        this.timpLiber = timpLiber;
        this.meserieDeBaza = meserieDeBaza;
    }

    public Somer() {
    }

    public boolean isTimpLiber() {
        return timpLiber;
    }

    public void setTimpLiber(boolean timpLiber) {
        this.timpLiber = timpLiber;
    }

    public String getMeserieDeBaza() {
        return meserieDeBaza;
    }

    public void setMeserieDeBaza(String meserieDeBaza) {
        this.meserieDeBaza = meserieDeBaza;
    }
}
