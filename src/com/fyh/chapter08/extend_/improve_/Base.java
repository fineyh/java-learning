package com.fyh.chapter08.extend_.improve_;

public class Base extends TopBase{
    public Base(){
        System.out.println("父类Base()...");
    }

    public Base(String name,int age){
        System.out.println("父类Base(String name,int age)构造器被调用...");
    }

    public Base(String name){
        System.out.println("父类Base(String name)构造器被调用...");
    }
}
