package com.fyh.chapter08.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        //多态的向上转型
        Animal animal = new Cat();
        Object obj = new Cat();

        animal.eat();
        //animal.catchMouse();错误
        animal.run();
        animal.show();
        animal.sleep();

        //==============
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.run();
        cat1.show();
        cat1.sleep();
        cat1.catchMouse();
        //==============

        //多态的向下转型
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //Dog dog = (Dog) animal;
    }
}
