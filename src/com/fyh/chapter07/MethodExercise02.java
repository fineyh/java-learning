package com.fyh.chapter07;

public class MethodExercise02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "milan";
        p.age = 100;

        MyTools tools = new MyTools();
        Person p2 = tools.copyPerson(p);
        //到此p和p2是Person对象，但是是两个独立的对象，属性相同
        System.out.println(p.name + p.age);
        System.out.println(p2.name + p2.age);
        System.out.println(p == p2);
    }
}

//class Person {
//	String name;
//	int age;
//}

class MyTools {
    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;

        return p2;
    }
}
