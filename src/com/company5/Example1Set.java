package com.company5;

import java.util.*;

public class Example1Set {
    public static void main(String[] args) {

        Set<String> sports = new TreeSet<>();
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Baseball");
        sports.add("Boxing");
        sports.add("Cycling");
        sports.add("Boxing");

        for(String sport : sports){
            System.out.println(sport);
        }
    }
}
