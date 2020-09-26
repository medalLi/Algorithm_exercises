package com.树结构.二叉树结构.基本二叉树;

/**
 * @author medal
 * @create 2020-04-11 11:19
 **/
public class MyTree {
    public static void main(String[] args) {
        // 创建结点
        Node root = new  Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        Node node5 = new Node(61);
        Node node6 = new Node(71);
        // 创建树
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
    }
}

//Node 结点
class Node {
    private int no;
    private Node left; //默认null
    private Node right; //默认null
    public Node(int no) {
        this.no = no;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
