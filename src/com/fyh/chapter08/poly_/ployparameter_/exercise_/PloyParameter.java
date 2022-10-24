package com.fyh.chapter08.poly_.ployparameter_.exercise_;

public class PloyParameter {
    public static void main(String[] args) {
        PloyParameter ployParameter = new PloyParameter();
        Employee jack = new Employee("jack", 20000);
        Worker mary = new Worker("mary", 10000);
        Manager tom = new Manager("tom", 30000, 100000);
        ployParameter.showEmpAnnal(jack);
        ployParameter.showEmpAnnal(mary);
        ployParameter.showEmpAnnal(tom);

        ployParameter.testWork(jack);
        ployParameter.testWork(mary);
        ployParameter.testWork(tom);
    }


    public void showEmpAnnal(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if(e instanceof Worker){
            ((Worker) e).work();
        } else if(e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("不做操作");
        }
    }
}

/*
定义员工类Employee，包含姓名和月工资[private]，以及计算年工资getAnnual的方法。
普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，
普通员工类多了work方法，普通员工和经理类要求分别重写getAnnual方法
测试类中添加一个方法showEmpAnnal(Employee e)，实现获取任何员工对象的年工资,
并在main方法中调用该方法[e.getAnnual()]
测试类中添加一个方法，testWork,如果是普通员工，则调用work方法，如果是经理，
则调用manage方法
*/