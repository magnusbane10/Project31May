package com.company2;

public class Main {
    public static void main(String[] args) {
        Tara romania = new Tara("Romania","RO", true);

        Companie SDA = new Companie("SDA", romania);

        Adresa adresa = new Adresa(romania,"Iasi","70074");
        Adresa adresaStudent = new Adresa(romania,"Bucuresti","45993");

        Angajat angajat = new Angajat(29, "IOn Popescu","1923123323",adresa,SDA,1000);

        System.out.println(angajat.getNume() + " este din orasul: " + angajat.getAdresa().getOras()+
                " si a lucrat: " + angajat.getNrOreSaptamanalLucrate() + " " + "de ore");

        Facultate facultate = new Facultate("Gh Asachi", "AC",romania);
        Student student = new Student(20,"Ion","21312321",adresaStudent,facultate,1);

        System.out.println("Studentul " + student.getNume() + " invata la " + student.getFacultate().getNumeFacultate() +
                " si a lucrat " + student.getNrOreSaptamanalLucrate() + " " + "de ore");

    }
}
