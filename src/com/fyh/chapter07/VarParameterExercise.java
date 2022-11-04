package com.fyh.chapter07;

public class VarParameterExercise {
    public static void main(String[] args) {
        VarE vare = new VarE();
        System.out.println(vare.showScore("小明", 88, 99, 66));
        System.out.println(vare.showScore("小红", 88, 99, 66, 77, 100));

    }
}

class VarE {
    public String showScore(String name, double... scores) {
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        return name + scores.length + "门课的成绩总分为" + total;
    }
}
