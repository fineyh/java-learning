package com.fyh.chapter14.list_;

public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node mike = new Node("mike");

        //连接三个结点，形成双向链表
        jack.next = tom;
        tom.next = mike;

        mike.pre = tom;
        tom.pre = jack;

        Node first = jack; // 让first引用指向jack,就是双向链表的头结点
        Node last = mike; // 让last引用指向mike,就是双向链表的尾结点

        //从头到尾遍历
        System.out.println("===从头到尾进行遍历===");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

        //从尾到头遍历
        System.out.println("====从尾到头的遍历====");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        //链表的添加对象/数据

        //1. 先创建一个 Node 结点，name 就是 smith
        Node smith = new Node("smith");
        smith.next = mike;
        smith.pre = tom;
        mike.pre = smith;
        tom.next = smith;

        //让first 再次指向jack
        first = jack;//让first引用指向jack,就是双向链表的头结点

        System.out.println("===从头到尾进行遍历===");
        while (true) {
            if(first == null) {
                break;
            }
            //输出first 信息
            System.out.println(first);
            first = first.next;
        }

        last = mike; //让last 重新指向最后一个结点
        //从尾到头的遍历
        System.out.println("====从尾到头的遍历====");
        while (true) {
            if(last == null) {
                break;
            }
            //输出last 信息
            System.out.println(last);
            last = last.pre;
        }

    }

}

//定义一个Node 类，Node 对象 表示双向链表的一个结点
class Node {
    public Object item; //真正存放数据
    public Node next; //指向后一个结点
    public Node pre; //指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    public String toString() {
        return "Node name=" + item;
    }
}