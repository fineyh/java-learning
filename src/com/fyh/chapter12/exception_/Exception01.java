package com.fyh.chapter12.exception_;

public class Exception01 {
    public static void main(String[] args) {
        //算数异常  ArithmeticException
        int num1 = 10;
        int num2 = 0;
//        int res = num1 / num2;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
//            throw new RuntimeException(e);
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("程序继续运行...");
    }
}