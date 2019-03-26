package com.题目11到题目20;

/**
 * @author medal
 * @create 2019-01-06 20:41
 **/
/*
* 题目：给定单向链表的头指针和一个结点指针，定义一个函数在 O(1)时间删除该结点
* */
public class 题目13_在O_1时间删除链表结点 {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        Node node6 = new Node(60);
//        mll.add(node1);
//        mll.add(node2);
//        mll.add(node3);
//        mll.add(node4);
//        mll.add(node5);
//        mll.add(node6);
        node1.next= node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        delete(node1,node5);
        System.out.println(node1.data);
        System.out.println(node1.next.data);
        System.out.println(node1.next.next.data);
        System.out.println(node1.next.next.next.data);
        System.out.println(node1.next.next.next.next.data);
       // System.out.println(node1.next.next.next.next.next.data);



    }

    public static Node delete(Node head,Node deleteNode){
        if(head == null || deleteNode == null || deleteNode.next ==null){
            return null;
        }
        deleteNode.data = deleteNode.next.data;
        deleteNode.next = deleteNode.next.next;
        return  null;
    }
}

//class Node{
//    public Node next;
//    public int data;
//    public Node(int data){
//        this.data = data;
//    }
//}
