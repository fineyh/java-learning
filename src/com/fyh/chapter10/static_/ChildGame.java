package com.fyh.chapter10.static_;

public class ChildGame {
    public static void main(String[] args) {
//        int count = 0;

        Child child1 = new Child("白骨精");
        child1.join();
//        count++;
        child1.count++;

        Child child2 = new Child("狐狸精");
        child2.join();
//        count++;
        child2.count++;

        Child child3 = new Child("老鼠精");
        child3.join();
//        count++;
        child3.count++;

        //变量名，可以通过类名来访问
        System.out.println("共有 " + Child.count + " 小孩加入游戏...");
        System.out.println("child1.count= " + child1.count);
        System.out.println("child2.count= " + child2.count);
        System.out.println("child3.count= " + child3.count);
    }
}

class Child {
    private String name;

    //定义一个变量 count，是一个类变量（静态变量）static 静态
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " 加入了游戏...");
    }
}