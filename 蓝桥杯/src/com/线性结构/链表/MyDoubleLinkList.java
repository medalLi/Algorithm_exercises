package com.线性结构.链表;

/**
 * @author medal
 * @create 2019-02-28 19:05
 **/
public class MyDoubleLinkList implements MyLink{
    Node head = null;
    Node last = null;
    int size = 0;
    public static void main(String[] args) {
        MyDoubleLinkList mdl = new MyDoubleLinkList();
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        Node node6 = new Node(60);
        mdl.add(node1);
        mdl.add(node2);
        mdl.add(node3);
        mdl.add(node4);
        mdl.add(node5);
        mdl.add(node6);
        //System.out.println(mdl.delete(0));
        Node node7 = new Node(70);
        //mdl.delete(node7);
       // System.out.println(mdl.getElementbyIndex(5));
        //System.out.println(mdl.getIndexByElement(node7));
        mdl.update(5,node7);
        mdl.traverseList();
    }
    @Override
    public void add(Node node) {
        if(head == null){
            head = node;
            last = node;
        }else{
            last.next =node;
            node.pre = last;
            last= last.next;
        }
        size ++;
    }

    @Override
    public Node delete(int index) {
        if(index > size || head == null){
            return  null;
        }
        Node deleteNode = null;
        Node first = head;
        int currentIndex = 0;

        while(first != null){
            if(currentIndex == index){

                deleteNode = first;
                if(first == head){
                    first =first.next;
                    head = first;
                }
                if(first.next != null){

                    first.pre.next = first.next;
                    first.next.pre = first.pre;
                    break;
                }else{
                    first.pre.next=null;
                }

            }
            first = first.next;
            currentIndex ++;
        }
        size --;
        return deleteNode;
    }

    @Override
    public void delete(Node node) {
        //int currentIndex = 0;
        Node first = head;
        //Node tmp = null;
        while(first != null){
            if(first.data == node.data){
                if(first == head){
                    first = first.next;
                    head = first;
                }
                if(first.next != null){
                    first.pre.next = first.next;
                    first.next.pre = first.pre;
                    break;
                }else{
                    first.pre.next= null;
                }

            }
            first = first.next;
        }
        size --;
    }

    @Override
    public Node getElementbyIndex(int index) {
        if(index > size || head == null){
            return  null;
        }
        int currentIndex = 0;
        Node first = head;
        while(first != null){
            if(currentIndex == index){
                return first;
            }
            first = first.next;
            currentIndex ++;
        }
        return null;
    }

    @Override
    public int getIndexByElement(Node node) {
        int currentIndex = 0;
        Node first = head;
        while(first != null){
            if(first.data == node.data){
                return currentIndex;
            }
            first = first.next;
            currentIndex ++;
        }
        return -1;
    }

    @Override
    public void update(int index, Node node) {
        int currentIndex = 0;
        Node first = head;
        while(first != null){
            if( currentIndex == index){
                if(first == head){
                    node.next = first.next;
                   // TreeNode.next = first.next;
                    first.next = null;
                    head = node;
                    break;
                }
                if(first.next != null){
                    first.pre.next = node;
                    node.pre = first.pre;
                    node.next = first.next;
                    first.next.pre = node;
                }else{
                    first.pre.next = node;
                }
            }
            first = first.next;
            currentIndex ++;
        }
    }

    @Override
    public boolean contains(Node node) {
        return getIndexByElement(node) > 0;
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
