package com.题目1到题目10;

/**
 * @author medal
 * @create 2019-01-06 11:14
 **/
public class 题目2_懒汉式单例 {
    private static 题目2_懒汉式单例 instance = null;
    private 题目2_懒汉式单例(){}
    public synchronized static 题目2_懒汉式单例 getInstance(){
        if(instance == null){
            instance = new 题目2_懒汉式单例();
        }
        return instance;
    }
}
