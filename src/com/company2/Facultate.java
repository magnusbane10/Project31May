package com.company2;

public class Facultate {
    private String universitate;
    private String numeFacultate;
    private Tara tara;

    public Facultate(String universitate, String numeFacultate, Tara tara) {
        this.universitate = universitate;
        this.numeFacultate = numeFacultate;
        this.tara = tara;
    }

    public Facultate() {
    }

    public String getUniversitate() {
        return universitate;
    }

    public void setUniversitate(String universitate) {
        this.universitate = universitate;
    }

    public String getNumeFacultate() {
        return numeFacultate;
    }

    public void setNumeFacultate(String numeFacultate) {
        this.numeFacultate = numeFacultate;
    }

    public Tara getTara() {
        return tara;
    }

    public void setTara(Tara tara) {
        this.tara = tara;
    }
}
