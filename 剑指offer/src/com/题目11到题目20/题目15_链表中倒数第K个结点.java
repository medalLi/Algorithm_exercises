package com.题目11到题目20;

/**
 * @author medal
 * @create 2019-01-06 20:44
 **/
/*
*   题目：输入一个链表，输出该链表中倒数第 k 个结点。为了符合大多数人的习惯，
    本题从 1 开始计数，即链表的尾结点是倒数第一个结点。例如一个有 6 个结点的
    链表，从头结点依次是 1,2,3,4，5,6。倒数第三个结点就是值为 4 的结点
* */
public class 题目15_链表中倒数第K个结点 {
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
        method(3,node1);

    }

    public static void method(int k,Node node1){
        if(node1 == null){
            return;
        }
        Node NodeFirst = node1;
        Node NodeSecond = node1;
        //计算链表的长度
        int count = 0;
        while(NodeFirst != null){
            count ++;
           // System.out.print(node1.data);
            NodeFirst = NodeFirst.next;
        }

        if(k > count){
            return;
        }
        Node tmpNode;
        int tmpK =0;
        while (NodeSecond !=null){
            tmpK ++;
            NodeSecond = NodeSecond.next;
            if(k == (count -tmpK)){
                System.out.print(NodeSecond.data);
            }
            //node1 = node1.next;
        }
       // System.out.print(count);
    }
}

class Node{
    //指针域
    Node next;
    //数据域
    int data;

    public Node(int data){
        this.data = data;
    }
    public Node(){
    }
}
