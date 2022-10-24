package com.fyh.chapter08.extend_.exercise;

public class PC extends Computer {
    private String brand;

    //继承设计的基本思想，父类的构造器完成父类属性初始化
    //子类的构造器完成子类属性初始化
    public PC(String CPU, int memory, int disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC信息=");
        System.out.println(getDetails() + " " + " brand=" + brand);
    }
}
