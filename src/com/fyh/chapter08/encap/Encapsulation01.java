package com.fyh.chapter08.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        Person smith = new Person("smith", 80, 50000);
        System.out.println("====smith=====");
        System.out.println(smith.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    //构造器
    public Person() {
    }

    //有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //可以将set方法写在构造器中，这样仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        //加入对数据的校验
        if(name.length()>=2&&name.length()<=6){
            this.name = name;
        } else{
            System.out.println("名字长度不对，需要2-6字符,默认名字小明");
            this.name = "小明";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >=1 && age <= 120){
            this.age = age;
        } else{
            System.out.println("你设置的年龄不对，年龄需要在1-120，给默认年龄18");
            this.age = 18;//给一个默认年龄
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为 name=" + name + " age=" + age + " salary=" + salary;
    }
}