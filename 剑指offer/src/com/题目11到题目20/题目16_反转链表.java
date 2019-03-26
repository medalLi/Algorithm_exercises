package com.题目11到题目20;

import java.util.Stack;

/**
 * @author medal
 * @create 2019-01-06 20:44
 **/
/*
*   题目：定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的
    头结点
* */
public class 题目16_反转链表 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        method(node1);
    }

    public static void method(Node node1){
        if(node1 == null){
            return;
        }
        Stack<Integer> stack = new Stack();
        Node newNode =null;
        while(node1 != null){
            stack.push(node1.data);
            node1 = node1.next;
        }

        while (!stack.isEmpty()){
            newNode = new Node(stack.pop());
            System.out.print(newNode.data);
            newNode = newNode.next;
        }

        /*while(newNode != null){
            //stack.push(node1.data);
            node1 = node1.next;
        }*/
        //System.out.print(newNode.data);
    }
}

/*class Node{
    //指针域
    Node next;
    //数据域
    int data;

    public Node(int data){
        this.data = data;
    }
}*/
