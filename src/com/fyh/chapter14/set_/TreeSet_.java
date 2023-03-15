package com.fyh.chapter14.set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面 调用String的 compareTo方法进行字符串大小比较
//                return ((String) o2).compareTo((String)o1);
                //要求加入的元素，按照长度大小排序
                //相同长度只有一个输出
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("mary");
        treeSet.add("mike");
        treeSet.add("a");
        treeSet.add("ab");
        System.out.println(treeSet);
    }
}
