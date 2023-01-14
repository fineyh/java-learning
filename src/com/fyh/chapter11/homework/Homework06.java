package com.fyh.chapter11.homework;
/*
1.有一个交通工具接口类Vehicles，有work接口
2.有Horse类和Boat类分别实现Vehicles
3.创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
4.有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
5.实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具
6.增加一个情况，如果唐僧过火焰山, 使用 飞机 ==> 程序扩展性, 我们前面的程序结构就非常好扩展 10min
使用代码实现上面的要求
编程 需求---->理解---->代码-->优化
 */
public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();
        tang.passRiver();
        tang.passFireHill();
    }
}

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("一般情况下，使用马前进...");
    }
}

class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("过河的时候使用小船...");
    }
}

class Plane implements Vehicles {

    @Override
    public void work() {
        System.out.println("过火焰山使用飞机...");
    }
}

class VehiclesFactory {
    private static Horse horse = new Horse();
    public static Horse getHorse() {
//        return new Horse();
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    //在创建人对象时，事先给他分配一个交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver() {
//        Boat boat = VehiclesFactory.getBoat();
//        boat.work();
        //判断一下，当前的 vehicles 属性是null，就获取一艘穿
//        if (vehicles == null) {
        if (!(vehicles instanceof Boat)) {//判断档期那的vehicles是不是Boat （1）=null，=》false；（2）=马对象，=》false；（3）=船对象，=》true;
            //这里使用的是多态
            vehicles = VehiclesFactory.getBoat();
        }
        //这里体现使用接口调用
        vehicles.work();
    }

    public void common() {
        //判断一下，当前的 vehicles 属性是null，就获取一匹马
        if (!(vehicles instanceof Horse)) {
            //这里使用的是多态
            vehicles = VehiclesFactory.getHorse();
        }
        //这里体现使用接口调用
        vehicles.work();
    }

    public void passFireHill() {
        if (!(vehicles instanceof Plane)) {
            //这里使用的是多态
            vehicles = VehiclesFactory.getPlane();
        }
        //这里体现使用接口调用
        vehicles.work();
    }
}