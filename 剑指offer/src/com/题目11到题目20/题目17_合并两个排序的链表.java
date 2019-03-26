package com.题目11到题目20;

/**
 * @author medal
 * @create 2019-01-06 20:46
 **/
/*
   题目：输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按
   照递增排序的
* */
public class 题目17_合并两个排序的链表 {
    public static void main(String[] args) {
        /*int[] array = new int[]{1,2,3,4};
        Node node1 = getLinkList(array);
        System.out.println(node1.data);
        while (node1 != null){
            System.out.println(node1.data);
            node1.next = node1;
        }*/
        Node node = method(getLinkList1(),getLinkList2());
        while (node != null){
            System.out.print(node.data);
            node = node.next;
        }
    }
    public static Node getLinkList(int[] array){
        Node node = new Node(array[0]);;
        Node node0 = node.next;
        for(int i =1;i <array.length;i++){
            node = new Node(array[i]);
            //node1.data = i;
            node = node.next;
        }
        return node0;
    }

    public static Node method(Node node1,Node node2){
        if(node1 == null){
            return node2;
        }else if(node2 == null){
            return node1;
        }
        Node node = null;
        if(node1.data < node2.data){
            node = node1;
            node.next = method(node1.next,node2);
        }else{
            node = node2;
            node.next = method(node1,node2.next);
        }
       /* while(node !=null){
            System.out.println(node.data);
            node = node.next;
        }*/
        return node;
    }

    public static Node getLinkList1(){
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return node1;
    }

    public static Node getLinkList2(){
        Node node1 = new Node(2);
        Node node2 = new Node(4);
        Node node3 = new Node(6);
        node1.next = node2;
        node2.next = node3;
        return node1;
    }
}
