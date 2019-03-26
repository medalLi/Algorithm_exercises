package com.线性结构.顺序表;

/**
 * @author medal
 * @create 2019-02-24 21:42
 **/
public interface MyList {

    //增加元素
    public void add(Object element);

    //传入索引，删除元素
    public void delete(int index);

    //传入元素值，删除元素
    public void delete(Object element);

    //传入索引，修改元素
    public void update(int index,Object element);

    //传入要修改的元素值
    public void update(Object element);

    //传入索引，查找元素
    public Object getElement(int index);

    //查看包含某个元素值
    public boolean contains(Object element);
}
