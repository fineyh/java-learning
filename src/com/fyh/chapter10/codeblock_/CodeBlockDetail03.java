package com.fyh.chapter10.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}

class AAA {
    {
        System.out.println("AAA 的普通代码块");
    }
    public AAA() {
        super();
        System.out.println("AAA() 构造器被调用...");
    }
}

class BBB extends AAA{
    {
        System.out.println("BBB 普通代码块...");
    }
    public BBB() {
        //(1)super();
        //(2)调用本类的普通代码块
        super();
        System.out.println("BBB() 构造器被调用...");
    }
}