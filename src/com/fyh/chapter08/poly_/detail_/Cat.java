package com.fyh.chapter08.poly_.detail_;

public class Cat extends Animal{
    public void eat(){//放大重写
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){//Cat特有的
        System.out.println("猫抓老鼠");
    }
}
