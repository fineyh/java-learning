package com.fyh.chapter07;

public class ConstructorDetail {
    public static void main(String[] args) {

    }
}

class PersonCD {
    String name;
    int age;

    public PersonCD(String pName, int pAge) {
        name = pName;
        age = pAge;
    }

    public PersonCD(String pName) {
        name = pName;
    }
}