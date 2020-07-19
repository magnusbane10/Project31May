package com.company2;

public class Persoana {
    private int varsta;
    private String nume;
    private String cnp;
    private Adresa adresa;

    public Persoana(int varsta, String nume, String cnp, Adresa adresa) {
        this.varsta = varsta;
        this.nume = nume;
        this.cnp = cnp;
        this.adresa = adresa;
    }

    public Persoana() {
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public int getNrOreSaptamanalLucrate(){
        return 0;
    }
}
