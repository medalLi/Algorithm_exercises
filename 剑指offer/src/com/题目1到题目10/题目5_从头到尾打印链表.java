package com.题目1到题目10;

import java.util.Stack;

/**
 * @author medal
 * @create 2019-01-06 11:39
 **/
/*
* 题目：输入一个链表的头结点，从尾到头反过来打印出每个结点的值
* */
public class 题目5_从头到尾打印链表 {

    public static void main(String[] args) {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        node1.next=node2;
        node2.next=node3;
       // printListReverse1(node1);
        printListReverse2(node1);
    }
    //方式一：非递归的方式
    public static void printListReverse1(Node headNode){
        Stack<Node> stack=new Stack<Node>();
        while(headNode!=null){
            stack.push(headNode);
            headNode=headNode.next;
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop().data);
        }
    }
    //方式二：递归的方式
    public static void printListReverse2(Node headNode){
        if(headNode!=null){
            if(headNode.next!=null){
                printListReverse2(headNode.next);
            }
        }
        System.out.println(headNode.data);
    }

}

class Node {
    //数据域
    public long data;
    //指针域
    public Node next;

    public Node(long value) {
        this.data = value;
    }

    /**
     * 显示方法
     */
    public void display() {
        System.out.print(data + " ");
    }
}
