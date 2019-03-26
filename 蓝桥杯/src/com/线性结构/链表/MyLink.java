package com.线性结构.链表;

/**
 * @author medal
 * @create 2019-02-26 13:24
 **/
public interface MyLink {
    //增加元素
    public void add(Node node);

    //根据索引，删除元素，并返回删除的元素值
    public Node delete(int index);

    //删除指定元素
    public void delete(Node node);

    //根据索引，查找元素
    public Node getElementbyIndex(int index);

    //查找给定元素，返回索引，不包含则返回-1
    public int getIndexByElement(Node node);

    //根据索引，更新元素
    public void update(int index,Node node);

    //查看链表里，是否包含该元素
    public boolean contains(Node node);

    //遍历链表
    public void traverseList();
}
