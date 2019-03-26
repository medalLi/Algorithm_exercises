package com.递归;

/**
 * @author medal
 * @create 2019-02-24 14:21
 **/
/*
* 题目描述：
*   有个排序后的字符串数组，其中散布着一些空字符串，编写一个方法，
*   找出给定字符串(肯定不是空字符串)的索引
* */
public class 在有空字符串的有序字符串数组中查找 {
    public static void main(String[] args) {
        String[] strArr = new String[]{"1","2","3","4","5"};
        System.out.println(method(strArr,0,strArr.length-1,"6"));
    }

    public static int method(String[] strArr,int first,int end,String target){

        int mid = first + (end-first)>>1;
        if(strArr[mid].compareTo(target) >0){
            return method(strArr,first,mid,target);
        }else if(strArr[mid].compareTo(target) >0){
            return method(strArr,mid,end,target);
        }else if(strArr[mid].compareTo(target) ==0){
            return mid;
        }

        return -1;
    }
}
