package com.fyh.chapter07;

public class ThisPerson {
    public static void main(String[] args) {
        PersonT p1 = new PersonT("mary", 30);
        PersonT p2 = new PersonT("smith", 29);
        System.out.println(p1.compareTo(p2));

    }
}

class PersonT {
    String name;
    int age;

    public PersonT(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(PersonT p) {
        return this.name.equals(p.name) && this.age == p.age;
    }
}
