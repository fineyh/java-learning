package com.fyh.chapter11.homework;

/*
编一个类A，在类中定义局部内部类B，B中有一个私有final常量name，有一个方法show()打印常量name。进行测试
进阶：A中也定义一个私有的变量name，在show方法中打印测试

 */
public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A {
    private String NAME = "Hello";
    public void f1() {
        class B {
            private final String NAME = "tom";
            public void show() {
                System.out.println("NAME=" + NAME + " 外部类的NAME=" + A.this.NAME);
            }
        }

        B b = new B();
        b.show();
    }
}