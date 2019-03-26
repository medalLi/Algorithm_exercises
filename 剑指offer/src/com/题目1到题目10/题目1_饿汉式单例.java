package com.题目1到题目10;

/**
 * @author medal
 * @create 2019-01-06 11:05
 **/

// 写一个饿汉式单例

public class 题目1_饿汉式单例 {
   private static final 题目1_饿汉式单例 instance = new 题目1_饿汉式单例();
   private 题目1_饿汉式单例(){}
   public static 题目1_饿汉式单例 getInstance(){
       return instance;
   }
}
