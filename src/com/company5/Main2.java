package com.company5;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        Person p1 = new Person(1234,"Ion");
        Person p2 = new Person(1254,"Maria");
        Person p3 = new Person(12345,"Vasile");

        Hobby swim = new Hobby("swim");
        Hobby sing = new Hobby("sing");
        Hobby football = new Hobby("football");
        Hobby dance = new Hobby("dance");


        List<Hobby> p1HobbiesList = new ArrayList<>();
        p1HobbiesList.add(swim);
        p1HobbiesList.add(football);

        List<Hobby> p2HobbiesList = new ArrayList<>();
        p2HobbiesList.add(dance);
        p2HobbiesList.add(sing);

        Map<Person,List<Hobby>> personListMap = new HashMap<>();
        personListMap.put(p1,p1HobbiesList);
        personListMap.put(p2,p2HobbiesList);

        for(Map.Entry<Person,List<Hobby>> personListEntry : personListMap.entrySet()){
            System.out.println("Persoana: " + personListEntry.getKey().getName() + " are urmatoarele hobby-uri: ");
            for(Hobby hobby : personListEntry.getValue()){
                System.out.println(hobby.getName());
            }


        }


    }
}

