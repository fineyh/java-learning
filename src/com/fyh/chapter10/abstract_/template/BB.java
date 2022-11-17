package com.fyh.chapter10.abstract_.template;

public class BB extends Template {

    //计算任务
    public void job() { // 这里也去重写了Template的job方法
        long num = 0;
        for (int i = 1; i <= 500000; i++) {
            num *= i;
        }
    }
}
