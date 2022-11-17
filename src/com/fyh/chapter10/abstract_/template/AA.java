package com.fyh.chapter10.abstract_.template;

public class AA extends Template{

    //计算任务
    //1+...+10000
    @Override
    public void job() { // 实现了父类Template的抽象方法job
        long num = 0;
        for (int i = 1; i <= 100000; i++) {
            num += i;
        }
    }
}