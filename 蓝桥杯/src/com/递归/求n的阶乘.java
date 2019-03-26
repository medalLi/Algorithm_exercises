package com.递归;

/**
 * @author medal
 * @create 2019-02-21 14:19
 **/
public class 求n的阶乘 {
    public static void main(String[] args) {
        int result = method(3);
        System.out.println(result);
    }

    public static int method(int n){
        if (n ==1){
            return 1;
        }else{
            return n* method(n -1);
        }

    }
}
