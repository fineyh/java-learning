package com.fyh.chapter10.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}

class Outer05 {
    private int n1 = 99;
    public void f1() {
        //创建一个基于类的匿名内部类
        //不能添加访问修饰符，因为它的地位就是一个局部变量
        //作用域 : 仅仅在定义它的方法或代码块中
        Person p = new Person() {
            private int n1 = 88;
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法 n1=" + n1 + " 外部类的n1=" + Outer05.this.n1);
                //Outer05.this 就是调用 f1的对象
            }
        };
        p.hi();//动态绑定，运行类型是Outer05

        //也可以直接调用
        new Person() {
            @Override
            public void hi() {
                System.out.println("2. 匿名内部类重写了 hi方法");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");
    }
}

class Person {//类
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str) {
        System.out.println("Person ok()" + str);
    }
}
//抽象类、接口