package com.fyh.chapter08.extend_.improve_;

public class Sub extends Base{
    public Sub(){
        //super();  //默认调用父类的无参构造器
        super("smith",10);
        System.out.println("子类Sub()...");
    }

    public Sub(String name,int age){
//        super();
//        super("nancy");
        super("nancy",18);
        System.out.println("子类Sub(String name,int age)被调用");
    }

    public Sub(String name){
        super("tom",19);
        System.out.println("子类Sub(String name)被调用");
    }
}
