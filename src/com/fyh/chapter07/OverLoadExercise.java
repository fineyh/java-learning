package com.fyh.chapter07;

public class OverLoadExercise {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.m(10);
        methods.m(10, 20);
        methods.m("你好");
        System.out.println(methods.max(10, 20));
        System.out.println(methods.max(10, 20, 30));
        System.out.println(methods.max(10, 1.111));
    }
}

class Methods {
    public void m(int n) {
        System.out.println("平方=" + (n * n));
    }

    public void m(int n1, int n2) {
        System.out.println("相乘=" + (n1 * n2));
    }

    public void m(String str) {
        System.out.println("传入的str=" + str);
    }

    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2, double n3) {
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }

    public double max(double n1, double n2, int n3) {
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }
}
