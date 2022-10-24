package com.fyh.chapter08.debug_;

import java.util.Arrays;

public class Debug02 {
    public static void main(String[] args) {
        int arr[] = {8, -1, 199, 70, 10};
        //排序，追入sort源码
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
