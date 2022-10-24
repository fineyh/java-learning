package com.fyh.chapter08.poly_.ployparameter_.exercise_;

public class Manager extends Employee{
    double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理 " + getName() + " is managing...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
