package com.fyh.chapter15.customgeneric;

import java.util.Arrays;

public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}


//1. Tiger 后面泛型，所以我们把 Tiger 就称为自定义泛型类
//2, T, R, M 泛型的标识符, 一般是单个大写字母
//3. 泛型标识符可以有多个.
//4. 普通成员可以使用泛型 (属性、方法)
//5. 使用泛型的数组，不能初始化
//6. 静态方法中不能使用类的泛型
class Tiger<T, R, M> {
    String name;
    T t; //属性使用到泛型
    R r;
    M m;
    //因为数组在new 不能确定T的类型，就无法在内存开空间
    T[] ts;

    public Tiger(String name) {
        this.name = name;
    }

    public Tiger(T t, R r, M m) {//构造器使用泛型
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public Tiger(String name, T t, R r, M m) {//构造器使用泛型
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

    //因为静态是和类相关的，在类加载时，对象还没有创建
    //所以，如果静态方法和静态属性使用了泛型，JVM就无法完成初始化
//    static R r2;
//    public static void m1(M m) {
//
//    }

    //方法使用泛型
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", t=" + t +
                ", r=" + r +
                ", m=" + m +
                ", ts=" + Arrays.toString(ts) +
                '}';
    }
}