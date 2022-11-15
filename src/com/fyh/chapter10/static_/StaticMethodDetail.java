package com.fyh.chapter10.static_;

public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();//ok

        //非静态方法，不能通过类名调用
        //需要先创建对象，再调用
        new D().say();
    }
}

class D {

    private int n1 = 100;
    private static int n2 = 200;

    public void say() {

    }

    public static void hi() {
        //类方法中不允许使用和对象有关的关键字
        //比如this和super，普通方法可以
        //System.out.println(this.n1);
    }

    //类方法（静态方法），只能访问 静态变量 或 静态方法
    //口诀：静态方法只能访问静态成员
    public static void hello() {
        System.out.println(n2);
        System.out.println(D.n2);
        //System.out.println(this.n2);不能使用
        hi();
        //say();错误
    }

    //普通成员方法，既可以访问 非静态成员，也可以访问静态成员
    //非静态方法可以访问 静态成员和非静态成员
    public void ok() {
        System.out.println(n1);
        say();
        System.out.println(n2);
        hi();
    }
}