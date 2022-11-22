package com.fyh.chapter10.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("悟空");
        littleMonkey.climbing();
        littleMonkey.swimming();
        littleMonkey.flying();
    }
}

//接口和继承解决的问题不同
//继承的价值主要在于：解决代码的复用性和可维护性。
//接口的价值主要在于：设计，设计好各种规范(方法)，让其它类去实现这些方法。即更加的灵活..

// 接口比继承更加灵活
// 接口比继承更加灵活，继承是满足 is-a的关系，而接口只需满足 like-a的关系
// 接口在一定程度上实现代码解耦[即:接口规范性+动态绑定机制]

//猴子
class Monkey {
    private String name;
    public void climbing() {
        System.out.println(name + "会爬树...");
    }

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//继承
//小结： 当子类继承了父类，就自动拥有父类的功能
//      如果子类需要扩展功能，可以通过实现接口的方式扩展.
//      可以理解实现接口是对java 单继承机制的一种补充.
class LittleMonkey extends Monkey implements Fishable,Birdable{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习可以像鱼一样会游泳...");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习可以像鸟一样会飞翔...");
    }
}

//接口
interface Fishable {
    void swimming();
}
interface Birdable {
    void flying();
}