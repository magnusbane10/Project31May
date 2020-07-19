package com.company2;

public class Angajat extends Persoana {
    private Companie companie;
    private int salariu;

    public Angajat(int varsta, String nume, String cnp, Adresa adresa, Companie companie, int salariu) {
        super(varsta, nume, cnp, adresa);
        this.companie = companie;
        this.salariu = salariu;
    }

    public Angajat() {
    }

    public Companie getCompanie() {
        return companie;
    }

    public void setCompanie(Companie companie) {
        this.companie = companie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

   @Override
    public int getNrOreSaptamanalLucrate(){
        return 40;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "companie=" + companie +
                ", salariu=" + salariu +
                '}';
    }
}
