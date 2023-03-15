package com.fyh.chapter15.generic.improve;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        //1. 当我们 ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是Dog类型 (细节后面说...)
        //2. 如果编译器发现添加的类型，不满足要求，就会报错
        //3. 在遍历的时候，可以直接取出 Dog 类型而不是 Object
        //4. public class ArrayList<E> {} E称为泛型,那么 Dog->E
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("旺财", 10));
        dogs.add(new Dog("发财", 1));
        dogs.add(new Dog("小黄", 5));
        //假如我们的程序员，不小心，添加了一只猫
        //dogs.add(new Cat("招财猫", 8));
        System.out.println("===使用泛型====");
        for (Dog dog : dogs) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
    }
}

class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat { //Cat类
    private String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
