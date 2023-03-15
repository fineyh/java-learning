package com.fyh.chapter14.map_;

import java.util.Comparator;
import java.util.TreeMap;

@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {
//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照传入的 k(String) 的大小进行排序
                //return ((String) o2).compareTo((String) o1);
                //按照K(String) 的长度大小排序
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯提诺");
        treeMap.put("smith", "史密斯");

        System.out.println(treeMap);
    }
}
