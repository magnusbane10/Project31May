package com.company2;

public class Companie {
    private String numeCompanie;
    private Tara tara;

    public Companie(String numeCompanie, Tara tara) {
        this.numeCompanie = numeCompanie;
        this.tara = tara;
    }

    public Companie() {
    }

    public String getNumeCompanie() {
        return numeCompanie;
    }

    public void setNumeCompanie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }

    public Tara getTara() {
        return tara;
    }

    public void setTara(Tara tara) {
        this.tara = tara;
    }
}
