package com.fyh.chapter08.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通各个功能的类
 * 使用OOP（面向对象编程）
 * 将各个功能对应一个方法
 */

public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    String details = "---------零钱通明细---------";

    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化

    String note = "";

    //先完成显示菜单，并可以选择
    public void mainMenu(){
        do {
            System.out.println("========选择零钱通菜单========");
            System.out.println("\t\t\t1  零钱通明细");
            System.out.println("\t\t\t2  收益入账");
            System.out.println("\t\t\t3  消    费");
            System.out.println("\t\t\t4  退    出");
            System.out.println("请选择（1-4）： ");
            key = scanner.next();

            //使用switch分支控制
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新输入");
            }
        } while (loop);
    }

    //完成零钱通明细
    public void detail(){
        System.out.println(details);
    }

    //完成收益入账
    public void income(){
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        //money 的值范围应该校验
        //找出不正确的金额条件，然后给出提示，就直接break
        if (money <= 0) {
            System.out.println("收益入账金额 需要 大于 0");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //消费
    public void pay(){
        System.out.println("消费金额：");
        money = scanner.nextDouble();
        //消费范围校验
        if (money <= 0 || money > balance) {
            System.out.println("消费金额 应该在 0-" + balance);
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit(){
        String choice = "";
        while (true) {
            System.out.println("你确认要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
