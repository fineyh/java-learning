package com.fyh.chapter08.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //1.先完成显示菜单，并可以选择菜单，给出对应提示
    //2.完成零钱通明细
    //3.完成收益入账
    //4.消费
    //5.退出
    //6.确认退出
    //7.入账、消费时校验

    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        String details = "---------零钱通明细---------";

        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化

        String note = "";

        do {
            System.out.println("=========零钱通菜单=========");
            System.out.println("\t\t\t1  零钱通明细");
            System.out.println("\t\t\t2  收益入账");
            System.out.println("\t\t\t3  消    费");
            System.out.println("\t\t\t4  退    出");
            System.out.println("请选择（1-4）： ");
            key = scanner.next();

            //使用switch分支控制
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    //money 的值范围应该校验
                    //找出不正确的金额条件，然后给出提示，就直接break
                    if (money <= 0) {
                        System.out.println("收益入账金额 需要 大于 0");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();
                    //消费范围校验
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额 应该在 0-" + balance);
                        break;
                    }
                    System.out.println("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
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
                    break;
                default:
                    System.out.println("选择有误，请重新输入");
            }
        } while (loop);

        System.out.println("退出了零钱通项目...");
    }
}
