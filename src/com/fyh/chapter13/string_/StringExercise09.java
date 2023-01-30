package com.fyh.chapter13.string_;

public class StringExercise09 {
    public static void main(String[] args) {
        String s1 = "jerry";  //s1 指向池中的 “jerry”
        String s2 = "java"; // s2 指向池中的 “java”
        String s5 = "tomandjerry"; //s5 指向池中的 “tomandjerry”
        String s6 = (s1 + s2).intern();//s6 指向池中的   “tomandjerry”
        System.out.println(s5 == s6); //T
        System.out.println(s5.equals(s6));//T

    }
}
