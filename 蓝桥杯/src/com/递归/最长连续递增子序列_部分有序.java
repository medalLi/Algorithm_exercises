package com.递归;

/**
 * @author medal
 * @create 2019-02-24 14:30
 **/
/*
* 题目描述：
*   (1,9,2,5,7,3,4,6,8,0)中最长的递增子序列为(3,4,6,8)
* */
public class 最长连续递增子序列_部分有序 {
    public static void main(String[] args) {
        System.out.println(method(new String("172523468990")));
        System.out.println(method(new String("1925734680")));
    }

    public static String method(String line){
        char[] charArr = line.toCharArray();
        int count = 1;
        int max = 1;
        int flag =0;
        for(int i =0;i <charArr.length-1;i ++){

            if(charArr[i]<charArr[i+1]){
                count ++;
                if(count > max){
                    flag = i+1;
                }

            }else{
                if(count >max){
                    max = count;
                }
                count =1;
            }
        }
        System.out.println("flag : "+flag);
        System.out.println("max : "+max);
        return line.substring(flag-max+1,flag+1);
    }
}
