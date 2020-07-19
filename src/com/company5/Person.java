package com.company5;



import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private int cnp;
    private String name;

    public Person(int cnp, String name) {
        this.cnp = cnp;
        this.name = name;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return cnp-o.cnp;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return cnp == person.cnp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }
}
