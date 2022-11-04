package com.fyh.chapter07;

public class RecursionExercise01 {
    public static void main(String[] args) {
        Tf t1 = new Tf();
        int res = t1.Fibonacci(9);
        if(res != -1) {
            System.out.println(res);
        }
    }
}

class Tf {
    public int Fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return Fibonacci(n - 1) + Fibonacci(n - 2);
            }
        } else {
            System.out.println("要求输入的n>=1的整数");
            return -1;
        }
    }
}
