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
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值了

    public HouseService(int size) {
        houses = new House[size];//当创建HouseService对象，指定数组大小
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    //findById方法，返回House对象或者null
    public House findById(int findId){
        //遍历数组
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }


    //del方法，删除一个房屋信息
    public boolean del(int delId) {
        //应当先找出要删除的房屋信息对应的下标
        //下标!=房屋编号
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {//要删除的房屋（id），是数组下标为i的元素
                index = i;//就是用index记录i

            }
        }
        if (index == -1) {//说明delId在数组中不存在
            return false;
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        //把当前有存在房屋信息的最后一个设置为null
        houses[--houseNums] = null;
        return true;
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加
        if (houseNums == houses.length) {
            System.out.println("数组已满，不能再添加了...");
            return false;
        }

        //把newHouse对象加到列
        houses[houseNums++] = newHouse;
        //id自增长机制，然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;

    }

    public House[] list() {
        return houses;
    }
}
