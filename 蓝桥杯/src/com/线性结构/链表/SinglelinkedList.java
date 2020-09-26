package com.线性结构.链表;

/*
* 排名
* */
public class SinglelinkedList {
    public static void main(String[] args) {
        SinglelinkedList list = new SinglelinkedList(new NodeRange(0,"hao"));

        NodeRange  node1 = new NodeRange(1,"zhangsan");
        NodeRange node2 = new NodeRange(2,"lisi");
        NodeRange node3 = new NodeRange(3,"wangwu");
//        NodeRangeRangeRange1.next = NodeRangeRangeRange2;
//        System.out.println(NodeRangeRangeRange1);
//        System.out.println(NodeRangeRangeRange1.next);
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.print();
        list.delete(node3);
        list.print();
    }

    NodeRange head = null;
    public SinglelinkedList(NodeRange head){
        this.head = head;
    }

    // 增加节点
    public  void add(NodeRange node){
        NodeRange temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    // 删除节点
    public  void delete(NodeRange node){
        NodeRange temp = head;
        while (temp.next != node){
            temp = temp.next;
        }
        if(temp.next.next != null){
            temp.next = temp.next.next;
        }else{
            temp.next = null;
        }

    }

    // 修改节点
    public static  void update(NodeRange node){

    }

    // 查询节点
    public static void quary(){

    }

    // 遍历链表
    public  void print(){
        NodeRange temp = head;
        while (temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
    }
}

class NodeRange{
    public  int number;
    public String name;
    public NodeRange next;

    public NodeRange(int number, String name) {
        this.number = number;
        this.name = name;
        // this.next = next;
    }

    @Override
    public String toString() {
        return "NodeRange{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
