package com.递归;

/**
 * @author medal
 * @create 2019-02-23 21:31
 **/
public class 汉诺塔 {
    public static void main(String[] args) {
        method(3,"A","B","C");
    }

    public static void method(int n,String A,String B,String C){
        if(n ==1){
            System.out.println(A+"->"+B);
        }else {
            method(n-1,A,C,B);
            System.out.println(A+"->"+B);
            method(n-1,C,B,A);
        }

    }
}
