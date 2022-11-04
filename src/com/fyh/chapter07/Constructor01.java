package com.fyh.chapter07;

public class Constructor01 {
    public static void main(String[] args) {
        PersonC p1 = new PersonC("smith",80);
        System.out.println(p1.name);
    }
}

class PersonC {
    String name;
    int age;

    public PersonC(String pName,int pAge) {
        name = pName;
        age = pAge;
    }
}
