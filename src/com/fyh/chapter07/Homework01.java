package com.fyh.chapter07;

public class Homework01 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double[] arr = {1, 1.4, 1.7, 9.9, 5.5, 6.88};
        Double res = a01.max(arr);
        if (res != null) {
            System.out.println(a01.max(arr));
        } else {
            System.out.println("arr的输入有误，数组不能为null或者{}");
        }

    }
}

class A01 {
    public Double max(double[] arr) {
        if (arr != null && arr.length > 0) {
            double max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            return max;
        } else {
            return null;
        }

    }
}
