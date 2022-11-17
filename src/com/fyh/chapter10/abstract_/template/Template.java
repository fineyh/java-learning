package com.fyh.chapter10.abstract_.template;

abstract public class Template { // 抽象类-模板设计模式

    public abstract void job();

    public void calculateTime() {
        //得到开始时间
        long start = System.currentTimeMillis();
        job(); // 动态绑定
        //得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间 " + (end - start));
    }
}
