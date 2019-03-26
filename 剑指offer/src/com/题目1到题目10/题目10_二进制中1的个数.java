package com.题目1到题目10;

/**
 * @author medal
 * @create 2019-01-06 20:14
 **/
/*
* 题目：请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如
  把 9 表示成二进制是 1001；有 2 位是 1，因此如果输入 9，函数输出 2.
* */
public class 题目10_二进制中1的个数 {
    public static void main(String[] args) {
        System.out.println(method(9));
    }

    //方式一：用字符数组
    public static int method(int number){
        int count =0;
        char[] lineChar =Integer.toBinaryString(number).toCharArray();
        for(char c : lineChar ){
            if(c == '1'){
                count ++;
            }
        }
        return count;
    }
    //方式二：用与运算
    public int numberOf1(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n=(n-1) & n;
        }
        return count;
    }

}
