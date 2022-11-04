package com.fyh.chapter07;

public class MethodParameter {
    public static void main(String[] args) {
        B b = new B();

        Person p = new Person();
        p.name = "jack";
        p.age = 10;
        b.test200(p);
        System.out.println(p.age);
    }
}

class Person {
    String name;
    int age;
}

class B {
    public void test200(Person p) {
        p = new Person();
        p.name = "tom";
        p.age = 99;
    }
}
