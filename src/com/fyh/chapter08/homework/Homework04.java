package com.fyh.chapter08.homework;

public class Homework04 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 300, 20, 1.2);
        jack.setBonus(10000);
        jack.printSalary();

        Worker mary = new Worker("mary", 200, 30, 1.0);
        mary.printSalary();
    }
}

class Employee {
    private String name;
    private double salary;
    private int days;
    private double grade;

    public Employee(String name, double salary, int days, double grade) {
        this.name = name;
        this.salary = salary;
        this.days = days;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printSalary() {
        System.out.println(name + " 工资：" + salary * days * grade);
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int days, double grade) {
        super(name, salary, days, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("经理 " + getName() + " 工资：" + (bonus + getSalary() * getDays() * getGrade()));
    }
}

class Worker extends Employee{
    public Worker(String name, double salary, int days, double grade) {
        super(name, salary, days, grade);
    }

    @Override
    public void printSalary() {
        System.out.print("普通员工 ");
        super.printSalary();
    }
}








