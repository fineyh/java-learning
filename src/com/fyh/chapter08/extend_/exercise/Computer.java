package com.fyh.chapter08.extend_.exercise;

public class Computer {
    private String CPU;
    private int memory;
    private int disk;

    public Computer(String CPU, int memory, int disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
//        setCPU(CPU);
//        setMemory(memory);
//        setDisk(disk);
    }

    //返回Computer信息
    public String getDetails() {
        return "cpu=" + CPU + " memory=" + memory + " disk=" + disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
