package com.fyh.chapter08.extend_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);
        System.out.println(son.getAge());
        System.out.println(son.hobby);

    }
}

class Grandpa {
    String name = "爷✌";
    String hobby = "旅游";
}

class Father extends Grandpa {
    String name = "跌";
    private int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    String name = "大头er";
}