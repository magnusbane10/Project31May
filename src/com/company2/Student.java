package com.company2;

public class Student extends Persoana{
    private Facultate facultate;
    private int anStudiu;

    public Student(int varsta, String nume, String cnp, Adresa adresa, Facultate facultate, int anStudiu) {
        super(varsta, nume, cnp, adresa);
        this.facultate = facultate;
        this.anStudiu = anStudiu;
    }


    public Facultate getFacultate() {
        return facultate;
    }

    public void setFacultate(Facultate facultate) {
        this.facultate = facultate;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }

    @Override
    public int getNrOreSaptamanalLucrate(){
        return 20;
    }
}
