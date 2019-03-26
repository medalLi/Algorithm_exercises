package com.递归;

/**
 * @author medal
 * @create 2019-02-23 21:20
 **/
// 1 1 2 3 5 8 13 21 34 55 89 .....
public class 不死神兔 {
    public static void main(String[] args) {
        System.out.println(method(50));
    }

    public static int method(int n){
        if(n ==1 || n ==2){
            return 1;
        }else{
            return method(n-1)+method(n -2);
        }
    }
}
