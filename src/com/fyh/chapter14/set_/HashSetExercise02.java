package com.fyh.chapter14.set_;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashSetExercise02 {
    public static void main(String[] args) {
        /**
         * 定义一个Employee类，该类包含： private成员属性name,sal,birthday(MyDate类
         * 型),其中 birthday 为 MyDate类型(属性包括: year, month, day),要求:
         * 1.创建3个Employee 放入 HashSet中
         * 2.当 name和birthday的值相同时，认为是相同员工,不能添加到HashSet集合中
         */

        HashSet hashSet = new HashSet();
        hashSet.add(new Employee02("jack",10000,new MyDate(2001,01,01)));
        hashSet.add(new Employee02("tom",20000,new MyDate(2002,02,02)));
        hashSet.add(new Employee02("jack",10000,new MyDate(2001,01,01)));

        System.out.println(hashSet);
    }
}

@SuppressWarnings({"all"})
class Employee02 {
    private String name;
    private int salary;
    private MyDate birthday;

    public Employee02(String name, int salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee02{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee02 that = (Employee02) o;
        return salary == that.salary && Objects.equals(name, that.name) && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, birthday);
    }
}

@SuppressWarnings({"all"})
class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month +  "-" + day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}