package com.题目11到题目20;

/**
 * @author medal
 * @create 2019-01-06 20:21
 **/
/*
*   题目：实现函数 double Power（double base，int exponent），求 base 的 exponent
    次方。不得使用库函数，同时不需要考虑大数问题
* */
public class 题目11_数值的整数次方 {
    public static void main(String[] args) {
        Power(2,4);
    }

    public static void Power(double base,int exponent){
        double result =1.0;
        for(int i = 0;i < exponent; i++){
            result = result*base;
        }
        System.out.println(result);
    }
}
