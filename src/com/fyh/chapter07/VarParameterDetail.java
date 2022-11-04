package com.fyh.chapter07;

public class VarParameterDetail {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        VarDetail detail = new VarDetail();
        detail.f1("123", arr);
    }
}

class VarDetail {
    public void f1(String str, int... nums) {
        System.out.println(nums.length);
    }
}
