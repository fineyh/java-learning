package com.fyh.chapter08.homework;

public class Homework03 {
    public static void main(String[] args) {
        Professor professor = new Professor("jack", 30, "高级", 20000, 1.3);
        professor.introduce();
    }
}

/*
3.编写老师类 Homework03.java
(1)要求有属性“姓名name”，“年龄age”，“职称post”，
(2)编写业务方法， introduce（），实现输出一个教师的信息。
 */
class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;

    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", grade=" + grade +
                '}';
    }

    public void introduce() {
        System.out.println(toString());
    }
}

/*
(3)编写教师类的三个子类:教授类(Professor )、副教授类、讲师类。工资级别分别为：教
授为1.3、副教授为1.2、讲师类1.1。在三个子类里面都重写父类的introduce （）方法。
(4)定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印。
“基本工资salary”
 */
class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息：");
        super.introduce();
    }
}
