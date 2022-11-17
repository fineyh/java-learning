package com.fyh.chapter10.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //类被加载的情况举例
        //1.创建对象实例时（new）
//        BB bb = new BB();

        //2.创建子类对象实例，父类也会被加载,而且父类先被加载，子类后被加载
//        AA aa = new AA();

        //3.使用类的静态成员时（静态属性，静态方法）
//        System.out.println(Cat.n1);

        //static代码块随着类的加载而执行，并且只会执行一次。
        //如果是普通代码块，每创建一个对象，就执行。

        //普通的代码块，在创建对象实例时，会被隐式的调用。
        //被创建一次，就会调用一次。
        //如果只是使用类的静态成员时，普通代码块并不会执行。

//        DD dd = new DD();
//        DD dd1 = new DD();

        System.out.println(DD.n1);
    }
}

class BB {
    static {
        System.out.println("BB 的静态代码1被执行...");
    }
}

class AA extends BB {
    static {
        System.out.println("AA 的静态代码1被执行...");
    }
}

class Animal {
    static {
        System.out.println("Animal 的静态代码1被执行...");
    }
}

class Cat extends Animal {
    public static int n1 = 999;//静态属性

    static {
        System.out.println("Cat 的静态代码1被执行...");
    }
}

class DD {
    public static int n1 = 100;

    static {
        System.out.println("DD 的静态代码1被执行...");
    }

    //普通代码块，在new对象时，被调用，而且是每创建一个对象，就调用一次
    //简单理解，普通代码块是构造器的补充
    {
        System.out.println("DD 的普通代码块被执行...");
    }
}