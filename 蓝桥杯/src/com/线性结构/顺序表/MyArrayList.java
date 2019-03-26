package com.线性结构.顺序表;

/**
 * @author medal
 * @create 2019-02-24 21:49
 **/
public class MyArrayList implements MyList {
    int capicity = 10;
    int size ;
    Object[] objArr ;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[");
        for(int i = 0;i<size;i ++){
            sb.append(i <size-1?objArr[i]+",":objArr[i]+"]");
        }
        return new String(sb);
    }

    public MyArrayList(){
        objArr = new Object[capicity];
        size = 0;
    }

    public MyArrayList(int capicity){
        objArr = new Object[capicity];
        size = 0;
    }

    @Override
    public void add(Object element) {
        objArr[size ++]=element;
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void delete(Object element) {

    }

    @Override
    public void update(int index, Object element) {

    }

    @Override
    public void update(Object element) {

    }

    @Override
    public Object getElement(int index) {
        return null;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }
}
