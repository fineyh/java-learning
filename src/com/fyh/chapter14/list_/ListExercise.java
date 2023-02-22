package com.fyh.chapter14.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        /*
        添加10个以上的元素(比如String "hello" )，在2号位插入一个元素"tom"，
        获得第5个元素，删除第6个元素，修改第7个元素，在使用迭代器遍历集合，
        要求:使用List的实现类ArrayList完成。
         */

        List list = new ArrayList();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        list.add("hello5");
        list.add("hello6");
        list.add("hello7");
        list.add("hello8");
        list.add("hello9");
        list.add("hello10");
        list.add(1,"tom");
        list.get(4);
        list.remove(5);
        list.set(6,"world");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}