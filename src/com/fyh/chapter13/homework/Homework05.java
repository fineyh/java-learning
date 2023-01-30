package com.fyh.chapter13.homework;

public class Homework05 {
    public static void main(String[] args) {
        String s1 = "tom";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.name == b.name);
        String s4 = new String("tom");
        String s5 = "tom";

        System.out.println(s1 == s4);
        System.out.println(s4 == s5);

        String t1 = "hello" + s1;//字符串拼接的时候如果全是常量，会优化，
        // 如果有变量，先创建一个StringBuilder，然后append，把hello加进去，再把s1对应的字符串内容加进去
        String t2 = "hellotom";
        System.out.println(t1.intern() == t2);


    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
