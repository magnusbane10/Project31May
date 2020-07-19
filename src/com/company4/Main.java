package com.company4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person somer = new Somer("Ion","Tamplar");
        Person angajat = new Angajat("Vasile", 1000);
        Person student = new Student("Gheorghe", "UMF");

        List<Person> personList = new LinkedList<>();
        personList.add(somer);
        personList.add(angajat);
        personList.add(student);
        personList.add(angajat);

        for (Person person : personList) {
            System.out.println(person.getName());
        }

        System.out.println("--------------------");
        System.out.println(personList.get(2).getName());
        System.out.println(personList.indexOf(angajat));
    }
}
