package com.fyh.chapter13.string_;

public class StringExercise03 {
    public static void main(String[] args) {
        String a = "tom"; //a 指向 常量池的 “tom”
        String b =new String("tom");//b 指向堆中对象
        System.out.println(a.equals(b)); //T
        System.out.println(a==b); //F
        //b.intern() 方法返回常量池地址
        System.out.println(a==b.intern()); //T //intern方法 常量池中有直接返回地址，没有则添加到池中再返回
        System.out.println(b==b.intern()); //F

    }
}
