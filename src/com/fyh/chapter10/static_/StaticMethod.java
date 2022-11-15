package com.fyh.chapter10.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        tom.payFee(100);
        Stu mary = new Stu("mary");
        mary.payFee(200);
        Stu.showFee();

        //如果希望不创建实例，也可以调用某个方法（即当作工具使用）
        //这时，把方法做成静态方法非常合适
        System.out.println("9平方的结果是 " + Math.sqrt(9));

        System.out.println(MyTools.calSum(1, 2));
    }
}

//开发自己的工具类时，可以将方法做成静态的，方便调用
class MyTools {
    public static double calSum(double n1, double n2) {
        return n1 + n2;
    }
}

class Stu {
    private String name;//普通成员
    //定义一个静态变量来累积学生的学费
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //当方法使用了static修饰后，该方法就是静态方法
    //静态方法可以访问静态属性
    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费：" + Stu.fee);
    }
}