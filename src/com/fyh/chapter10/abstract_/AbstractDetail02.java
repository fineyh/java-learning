package com.fyh.chapter10.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}

//抽象类可以有任意成员【抽象类本质还是类】 ，比如：非抽象方法、构造器、静态属性等等
abstract class D {
    public int n1 = 10;
    public static String name = "tom";

    public void hi() {
        System.out.println("hi");
    }

    public abstract void hello();

    public static void ok() {
        System.out.println("ok");
    }
}

//如果一个类继承了抽象类， 则它必须实现抽象类的所有抽象方法, 除非它自己也声明为abstract类
abstract class E {
    public abstract void hi();
}
abstract class F extends E {
    @Override
    public void hi() {

    }
}
class G extends E {
    @Override
    public void hi() {//这里相当于G子类实现了父类E的抽象方法，所谓实现方法，就是有方法体

    }
}

//抽象方法不能使用private、 因为这些关键字都是和重写相违背的