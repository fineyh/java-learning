package com.fyh.chapter07;

public class ConstructorExercise {
    public static void main(String[] args) {
        PersonCE p1 = new PersonCE();
        System.out.println(p1.name + " " + p1.age);
        System.out.println(p1.hashCode());

        System.out.println("=========");

        PersonCE p2 = new PersonCE("scott", 50);
        System.out.println(p2.name + " " + p2.age);
        System.out.println(p2.hashCode());

    }
}

class PersonCE {
    String name; //默认值null
    int age; //默认值0

    public PersonCE() {
        age = 18;
    }

    public PersonCE(String pName, int pAge) {
        name = pName;
        age = pAge;
        System.out.println(this.hashCode());
    }
}
