package com.递归;

import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;

/**
 * @author medal
 * @create 2019-02-21 14:24
 **/
public class 打印数组里的元素的和 {
    public static void main(String[] args) {
        System.out.println(method(new int[]{1,2,3,4,5,6},0));
    }

    public static int method(int[] arr,int index){
        if(index == arr.length-1){
            return arr[index];
        }else{
            return arr[index] + method(arr,index+1);
        }
    }
}
