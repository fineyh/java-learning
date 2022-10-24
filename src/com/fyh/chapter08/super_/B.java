package com.fyh.chapter08.super_;

public class B extends A {

    public int n1 = 888;

    public void test() {
        System.out.println("super.n1=" + super.n1);
    }

    public void hi() {
        System.out.println(super.n1 + super.n2 + super.n3);
    }

    public void sum() {
        System.out.println("B类的sum()...");
        //调用父类-A 的cal()

        //先找本类，如果有，则调用，如果没有，则找父类...

//        cal();
//        this.cal();//等价于cal();
        super.cal();//直接查找父类

        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(this.n2);
        System.out.println(super.n1);

    }

    public void ok() {
        super.test100();
        super.test200();
        super.test300();
    }

//    public void hello(){
//
//    }

    public B() {
//        super();
        super("jack", 10);
    }
}
