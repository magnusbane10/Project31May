package com.company5;

import java.util.HashMap;
import java.util.Map;

public class MainMapExample {
    public static void main(String[] args) {
        Person p1 = new Person(1234,"Ion");
        Person p2 = new Person(1234,"Maria");
        Person p3 = new Person(12345,"Vasile");
        Person p4 = p1;
        Map<Person,String> personStringMap = new HashMap<>();
        personStringMap.put(p1,"p1");
        personStringMap.put(p2,"p2");
        personStringMap.put(p3,"p3");
        personStringMap.put(p4,"p4");

        System.out.println(personStringMap.get(p4));
     }
}
