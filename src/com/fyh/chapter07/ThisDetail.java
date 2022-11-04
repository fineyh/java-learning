package com.fyh.chapter07;

public class ThisDetail {
    public static void main(String[] args) {
        ThisD d = new ThisD();
        d.f1();
        d.f2();
        d.f3();
    }
}

class ThisD {
    String name = "jack";
    int age = 100;

    public ThisD() {
        this("jack", 18);
        System.out.println("ThisD()构造器");
    }

    public ThisD(String name, int age) {
        System.out.println("ThisD(String name,int age)构造器");
    }


    public void f1() {
        System.out.println("f1()method..");
    }

    public void f2() {
        System.out.println("f2()method..");

        f1();
        this.f1();
    }

    public void f3() {
        String name = "smith";
        System.out.println(name + age);
        System.out.println(this.name + this.age);

    }
}
