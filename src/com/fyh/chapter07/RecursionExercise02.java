package com.fyh.chapter07;

public class RecursionExercise02 {
    public static void main(String[] args) {
        RE2 p1 = new RE2();
        System.out.println(p1.Peach(1));
    }
}

class RE2 {
    public int Peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (Peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day在1-10天");
            return -1;
        }
    }
}
