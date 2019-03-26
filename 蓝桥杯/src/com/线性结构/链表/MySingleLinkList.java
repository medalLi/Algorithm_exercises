package com.线性结构.链表;

/**
 * @author medal
 * @create 2019-02-26 13:18
 **/
public class MySingleLinkList implements MyLink {

    public Node head;
    public Node last;
    public int size =0;

    public static void main(String[] args) {

        MySingleLinkList mll = new MySingleLinkList();
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        Node node6 = new Node(60);
        mll.add(node1);
        mll.add(node2);
        mll.add(node3);
        mll.add(node4);
        mll.add(node5);
        mll.add(node6);
//        System.out.println(mll.delete(0));
//        System.out.println(mll.size);
//        mll.traverseList();
        Node node7 = new Node(70);
//        mll.delete(node7);
//        System.out.println(mll.size);
        //System.out.println(mll.getElementbyIndex(5));
        //System.out.println(mll.getIndexByElement(node1));
        //System.out.println(mll.contains(node7));
        mll.update(0,node7);
        mll.traverseList();
    }
    @Override
    public void add(Node node) {
        if(head == null){
            head = node;
            last = head;
        }else{
            last.next = node;
            last = last.next;
        }
        size ++;
    }

    @Override
    public Node delete(int index) {
       Node first = head;
       Node second = first.next;
       int currentIndex = 0;
       Node deleteNode = null;

       if(index == 0){
           deleteNode = first;
           head = first.next;
           size --;
           return deleteNode;
       }
       while(second != null){
           if(currentIndex == index -1){
               deleteNode = second;
               first.next = second.next;
               size --;
               break;
           }
           first = first.next;
           second = second.next;
           currentIndex ++;
       }
        return deleteNode;
    }

    @Override
    public void delete(Node node) {
        Node first = head;
        Node second = first.next;
        if(first.data == node.data){
            head = first.next;
            System.out.println("删除完毕！！");
            size --;
            return;
        }
        while (second != null){
            if(second.data==node.data){
                first.next = second.next;
                System.out.println("删除完毕！！");
                size --;
                return;
            }
            first = first.next;
            second = second.next;
        }
        System.out.println("没有该元素！！");
    }

    @Override
    public Node getElementbyIndex(int index) {
        int currentIndex = 0;
        Node first = head;
        Node resultNode = null;
        while (first !=null){
            if(currentIndex == index){
                //System.out.println(first);
                resultNode = first;
            }
            first = first.next;
            currentIndex ++;
        }
        return  resultNode;
    }

    @Override
    public int getIndexByElement(Node node) {
        int currentIndex = 0;
        Node first = head;
       // Node resultNode = null;
        while (first !=null){
            if(node.data == first.data){
                //System.out.println(first);
                //resultNode = first;
                return currentIndex;
            }
            first = first.next;
            currentIndex ++;
        }
        //return  resultNode;
        return -1;
    }

    @Override
    public void update(int index, Node node) {
        int currentIndex = 0;
        Node first = head;
        Node second = first.next;
        if(index ==0){

            node.next = first.next;
            head = node;
        }
        while(second != null){
            if(currentIndex == index -1){
                first.next = node;
                node.next= second.next;
            }
            first = first.next;
            second = second.next;
            currentIndex ++;
        }

    }

    @Override
    public boolean contains(Node node) {
        return getIndexByElement(node) >=0;
    }


    @Override
    public void traverseList() {
        Node node = head;
        System.out.print("[");
        while (node != null){
            if(node.next == null){
                System.out.print(node.data+"]");
            }else{
                System.out.print(node.data+",");
            }

            node = node.next;
        }
    }
}
