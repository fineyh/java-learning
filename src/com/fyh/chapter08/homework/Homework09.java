package com.fyh.chapter08.homework;

public class Homework09 {
    public static void main(String[] args) {
        LabeledPoint o = new LabeledPoint("o", 1, 2);
    }
}

class Pointer {
    private double x;
    private double y;

    public Pointer(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LabeledPoint extends Pointer {
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }
}