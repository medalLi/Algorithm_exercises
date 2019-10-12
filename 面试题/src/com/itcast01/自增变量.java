package com.itcast01;

/**
 * @author medal
 * @create 2019-04-13 21:30
 **/
public class 自增变量 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
    }

}
