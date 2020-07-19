package com.company2;

public class Adresa {
    private Tara tara;
    private String oras;
    private String codPostal;

    public Adresa(Tara tara, String oras, String codPostal) {
        this.tara = tara;
        this.oras = oras;
        this.codPostal = codPostal;
    }

    public Adresa() {
    }

    public Tara getTara() {
        return tara;
    }

    public void setTara(Tara tara) {
        this.tara = tara;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }
}
