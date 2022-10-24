package com.fyh.chapter08.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        bmw = null;//这时car对象就是一个垃圾，垃圾回收期就会回收（销毁）对象
        //在销毁对象前，会调用该对象的finalize方法
        //程序员就可以在finalize中，写自己的业务逻辑代码（比如释放资源，数据库连接，或打开文件）
        System.gc();//主动触发垃圾回收机制
        System.out.println("程序退出");

    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    //重写finalize

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车" + name);
    }
}