package com.题目1到题目10;

/**
 * @author medal
 * @create 2019-01-06 11:35
 **/
/*
* 题目：请实现一个函数，把字符串中的每个空格替换成“%20”
* */
public class 题目4_替换空格 {
    public static void main(String[] args) {
        String line = "I have a drame";
        System.out.println(replaceSpace(line));
    }

    public static String replaceSpace(String line){
        return line.replace(" ","%20");
    }
}
