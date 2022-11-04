package com.fyh.chapter07;

public class VarScope {
    public static void main(String[] args) {
        PersonS p1 = new PersonS();
        Person2 p2 = new Person2();
        p2.test();
        p2.test2(p1);
    }
}

class Person2 {
    public void test() {
        PersonS p1 = new PersonS();
        System.out.println(p1.name);
    }

    public void test2(PersonS p) {
        System.out.println(p.name);
    }
}

class PersonS {
    String name = "jack";
}

