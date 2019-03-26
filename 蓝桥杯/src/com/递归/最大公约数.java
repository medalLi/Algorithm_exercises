package com.递归;

/**
 * @author medal
 * @create 2019-02-23 21:24
 **/
public class 最大公约数 {
    public static void main(String[] args) {
        System.out.println(method(12,6));
    }
    public  static int method(int m,int n){
        if(n == 0){
            return m;
        }else{
            return method(n,m%n);
        }
    }
}
