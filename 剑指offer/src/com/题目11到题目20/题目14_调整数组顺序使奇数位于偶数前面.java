package com.题目11到题目20;

/**
 * @author medal
 * @create 2019-01-06 20:43
 **/
/*
*  题目：输入一个整数数组，实现一个函数来调整该函数数组中数字的顺序，使得
   所有奇数位于数组的前半部分，所有的偶数位于数组的后半部分
* */
public class 题目14_调整数组顺序使奇数位于偶数前面 {
    public static void main(String[] args) {
        int[] array = new int[]{2,3,4,5,6,7,8,1};
        method(array);
    }
    public static void method(int[] array){
        int tmp;
        int i = 0;
        int j = array.length-1;
        while(i<j){
           while (i<j && array[i] %2 ==1){
               i ++;
           }
           while (i<j && array[j] %2 ==0){
               j --;
           }
           if(i <j){
               tmp = array[i];
               array[i] = array[j];
               array[j] = tmp;
              /* i++;
               j --;*/
           }


        }

        for(int k : array){
            System.out.print(k);
        }
    }
}
