package com.company3;

public class Somer {
    private String nameSomer;

    public Somer() {
    }

    public Somer(String nameSomer) {
        this.nameSomer = nameSomer;
    }

    public String getNameSomer() {
        return nameSomer;
    }

    public void setNameSomer(String nameSomer) {
        this.nameSomer = nameSomer;
    }

    @Override
    public String toString() {
        return "Somer{" +
                "nameSomer='" + nameSomer + '\'' +
                '}';
    }
}
