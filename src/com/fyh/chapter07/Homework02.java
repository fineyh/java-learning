package com.fyh.chapter07;

public class Homework02 {
    public static void main(String[] args) {
        String[] strs = {"jack", "tom", "mary", "milan"};
        A02 a02 = new A02();
        int index = a02.find("milan", strs);
        System.out.println("查找的index=" + index);

        System.out.println("======");

        A021 a021 = new A021("milan", strs);
        System.out.println("查找的index=" + a021.find());
    }
}

class A02 {
    public int find(String findStr, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            if (findStr.equals(strs[i])) {
                return i;
            }
        }
        return -1;
    }
}

class A021 {
    String findStr;
    String[] strs;

    public A021(String findStr, String[] strs) {
        this.findStr = findStr;
        this.strs = strs;
    }

    public int find() {
        for (int i = 0; i < strs.length; i++) {
            if (findStr.equals(strs[i])) {
                return i;
            }
        }
        return -1;
    }
}
