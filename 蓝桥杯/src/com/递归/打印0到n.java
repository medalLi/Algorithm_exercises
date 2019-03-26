package com.递归;

/**
 * @author medal
 * @create 2019-02-21 14:22
 **/
public class 打印0到n {
    public static void main(String[] args) {
       int result = method(100);
        System.out.println(result);
    }

    public static int method(int n){
        if(n ==1){
            return 1;
        }else {
            return n +method(n-1);
        }

    }
}
