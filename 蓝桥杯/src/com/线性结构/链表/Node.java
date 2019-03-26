package com.线性结构.链表;

/**
 * @author medal
 * @create 2019-02-24 22:16
 **/
public class Node {
    int data;
    Node pre;
    Node next;
    public Node(int data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    public Node(){
        this.data=data;
    }
}
