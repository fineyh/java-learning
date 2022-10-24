package com.fyh.chapter08.modifier;

public class B {
    public void say(){
        A a = new A();
        //不能访问private
        System.out.println(a.n1+" "+a.n2+" "+a.n3);
        a.m1();
        a.m2();
        a.m3();
    }
}
