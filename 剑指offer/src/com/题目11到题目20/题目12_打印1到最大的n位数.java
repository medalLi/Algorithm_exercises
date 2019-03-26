package com.题目11到题目20;

/**
 * @author medal
 * @create 2019-01-06 20:38
 **/
/*
*  题目：输入数字 n，按顺序打印出从 1 到最大的 n 位进制数。比如输入 3，则打
   印出 1、2、3 一直到 999
* */
public class 题目12_打印1到最大的n位数 {
    public static void main(String[] args) {
        method(3);
    }

    public static void method(int number){
        int maxNumber = (int) Math.pow(10,number);
        for(int i =1;i < maxNumber;i ++){
            System.out.println(i);
        }
    }
}
