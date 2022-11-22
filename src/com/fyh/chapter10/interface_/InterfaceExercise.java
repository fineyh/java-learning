package com.fyh.chapter10.interface_;

public class InterfaceExercise {
    public static void main(String[] args) {
        new C().pX();
    }
}

interface A_ {
    int x = 0;
}//想到等价 public static final int x = 0;

class B {
    int x = 1;
}//普通属性

class C extends B implements A_ {
    public void pX() {
        //System.out.println(x);//错误，原因不明确X
        //可以明确的指定x
        //访问接口的 x 就使用 A.x
        //访问父类的 x 就使用 super.x
        System.out.println(A_.x + " " + super.x);
    }
}