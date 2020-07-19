package com.company2;

public class Tara {
    private String numeTara;
    private String cod;
    private boolean isEu;

    public Tara(String numeTara, String cod, boolean isEu) {
        this.numeTara = numeTara;
        this.cod = cod;
        this.isEu = isEu;
    }

    public Tara() {
    }

    public String getNumeTara() {
        return numeTara;
    }

    public void setNumeTara(String numeTara) {
        this.numeTara = numeTara;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public boolean isEu() {
        return isEu;
    }

    public void setEu(boolean eu) {
        isEu = eu;
    }
}
