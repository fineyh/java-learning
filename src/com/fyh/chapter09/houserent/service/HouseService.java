package com.fyh.chapter09.houserent.service;

import com.fyh.chapter09.houserent.domain.House;

/**
 * HouseService.java<=>类 [业务层]
 * 定义House[]，保存House对象
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作（增删改查）
 */
public class HouseService {
    private House[] houses;//保存House对象

    public HouseService(int size) {
        houses = new House[size];//当创建HouseService对象，指定数组大小
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    public House[] list() {
        return houses;
    }
}
