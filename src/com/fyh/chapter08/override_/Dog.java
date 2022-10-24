package com.fyh.chapter08.override_;

public class Dog extends Animal{
    //名称、返回类型、参数一样
    //就说Dog的cry方法，重写了Animal的cry方法
    public void cry(){
        System.out.println("小狗🐕汪汪叫...");
    }
}
