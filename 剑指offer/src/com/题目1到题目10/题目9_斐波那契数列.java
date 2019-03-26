package com.题目1到题目10;

/**
 * @author medal
 * @create 2019-01-06 20:06
 **/
/*
* 题目一：写一个函数，输入 n，求斐波那契数列的第 n 项
* */
public class 题目9_斐波那契数列 {
    public static void main(String[] args) {
        //System.out.println(method(8));
        System.out.println(fibonacci(8));
    }
    //方法一：递归的方式
    public static int method(int n){
        if(n == 1 || n ==2){
            return 1;
        }else{
            return method(n-1)+method(n-2);
        }
    }
    //方式二：非递归的方式
    public static long fibonacci(int n)
    {
        long result=0;
        long preOne=0;
        long preTwo=1;
        if(n==0)    {
            return preOne;
        }
        if(n==1)
        {
            return preTwo;
        }
        for(int i=2;i<=n;i++)
        {
            result=preOne + preTwo;
            preOne=preTwo;
            preTwo=result;

        }
        return result;
    }

}
