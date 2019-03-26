package com.递归;

/**
 * @author medal
 * @create 2019-02-24 13:54
 **/
/*
* 问题描述：
*   小白正在上楼梯，楼梯上有n个台阶，小白一次可以上1阶，2阶或者3阶，
*   实现一个方法，计算小白有多少种走完楼梯的方式
*
* */
public class 小白上楼梯 {
    public static void main(String[] args) {
        System.out.println(method(5));
    }

    public static int method(int n){
        if(n ==1 ){
            return 1;
        }

        if(n ==2){
            return 2;
        }
        if(n ==3){
            return 4;
        }

        return method(n-1)+method(n-2)+method(n-3);
    }
}
