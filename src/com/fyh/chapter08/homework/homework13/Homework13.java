package com.fyh.chapter08.homework.homework13;

import java.util.function.Predicate;

public class Homework13 {
    public static void main(String[] args) {
        Student student = new Student("小明", '男', 15, "00023102");
        student.printInfo();
        System.out.println("-------------------");
        Teacher teacher = new Teacher("张飞", '男', 30, 5);
        teacher.printInfo();

        Person[] persons = new Person[4];
        persons[0] = new Student("jack", '男', 10, "0001");
        persons[1] = new Student("mary", '女', 20, "0002");
        persons[2] = new Teacher("tom", '男', 36, 1);
        persons[3] = new Teacher("mike", '男', 26, 5);

        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(persons);

        System.out.println("----排序----");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        System.out.println("===============");
        for (int i = 0; i < persons.length; i++) {
            homework13.test(persons[i]);
        }
    }

    public void bubbleSort(Person[] persons) {
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }

            }
        }
    }

    //这里会使用到向下转型和类型判断
    public void test(Person p) {
        if (p instanceof Student) {
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("do nothing...");
        }
    }
}
