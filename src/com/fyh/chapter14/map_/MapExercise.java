package com.fyh.chapter14.map_;

import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        /**
         * 使用HashMap添加3个员工对象，要求
         * 键：员工id
         * 值：员工对象0
         *
         * 并遍历显示工资>18000的员工(遍历方式最少两种)
         * 员工类：姓名、工资、员工id
         */

        Map map = new HashMap();
        map.put(1, new Employee("jack", 300000, 1));
        map.put(2, new Employee("tom", 21000, 2));
        map.put(3, new Employee("milan", 12000, 3));

        Set keySet = map.keySet();
        System.out.println("===第一种遍历方式===");
        for (Object key : keySet) {
            //先获取value
            Employee emp = (Employee) map.get(key);
            if(emp.getSalary() >18000) {
                System.out.println(emp);
            }
        }

        Set entrySet = map.entrySet();
        System.out.println("===迭代器===");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            //通过entry 取得key 和 value
            Employee emp = (Employee) entry.getValue();
            if(emp.getSalary() > 18000) {
                System.out.println(emp);
            }

        }

    }
}

class Employee {
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}