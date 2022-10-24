package com.fyh.chapter08.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true

        //aa编译类型AA，运行类型BB
        AA aa = new BB();
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//true
        //看运行类型

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        String str = "hello";
        System.out.println(str instanceof Object);//true
    }
}

class AA {

}

class BB extends AA{

}