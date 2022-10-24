package com.fyh.chapter08.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("jack", 10, '男');
        System.out.println(person1.equals(person2));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    //重写Object的equals方法
    public boolean equals(Object obj) {
        //判断如果比较的两个对象是同一个对象，则返回true，反之false
        if (this == obj) {
            return true;
        }
        //类型判断
        if (obj instanceof Person) {
            //进行向下转型
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}