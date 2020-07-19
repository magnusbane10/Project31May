package com.company1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            List<String> sports = new ArrayList<>();
            sports.add("Football");
            sports.add("Basketball");
            sports.add("Baseball");
            sports.add("Boxing");
            sports.add("Cycling");
            Iterator<String> iterator = sports.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals("Boxing")) {
                    iterator.remove();
                }
            }
            for(String sport : sports){
                System.out.println(sport);
            }
        }
    }

