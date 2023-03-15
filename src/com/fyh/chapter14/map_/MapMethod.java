package com.fyh.chapter14.map_;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("tom", new Book("",100));
        map.put("tom", "mary");//替换
        map.put("jack", "nancy");//OK
        map.put("mike", "nancy");//OK
        map.put("robin", null);//OK
        map.put(null, "lucy");//OK
        map.put("tim", "cindy");//OK
        map.put("steven", "steve");

        System.out.println("map=" + map);
        
//        remove:根据键删除映射关系
        map.remove(null);
        System.out.println("map=" + map);
//        get：根据键获取值
        Object val = map.get("tim");
        System.out.println("val=" + val);
//        size:获取元素个数
        System.out.println("k-v=" + map.size());
//        isEmpty:判断个数是否为0
        System.out.println(map.isEmpty());//F
//        clear:清除k-v
        //map.clear();
        System.out.println("map=" + map);
//        containsKey:查找键是否存在
        System.out.println("结果=" + map.containsKey("steven"));//T
    }
}

class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
