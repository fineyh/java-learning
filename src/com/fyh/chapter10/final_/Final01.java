package com.fyh.chapter10.final_;

public class Final01 {
    public static void main(String[] args) {
//        E e = new E();
//        e.TAX_RATE = 0.09;
    }
}

//如果要求A类不能被其它类继承
//可以使用final修饰A类
final class A {
}

//class B extends A { }

class C {
    //如果要求hi不能被子类重写
    //可以使用final修饰hi方法
    public final void hi() {
    }

}

class D extends C {
//    @Override
//    public void hi() {
//        System.out.println("重写C类的hi方法...");
//    }
}

//当不希望类的某个属性的值被修改，可以用final修饰
class E {
    public final double TAX_RATE = 0.08;
}

//当不希望某个局部变量被修改，可以使用final修饰
class F {
    public void cry() {
        //这时，NUM 也称为 局部常量
        final double NUM = 0.01;
//        NUM = 0.9;
        System.out.println(NUM);
    }
}