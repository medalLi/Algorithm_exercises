package com.itcast01;

import java.lang.reflect.Field;

/**
 * @author medal
 * @create 2019-03-11 15:48
 **/
/*
* 面试题：在main方法中定义了两个Integer变量，通过swap()方法，
* 交换两个变量的值，并交换前后分别打印出来
* */
public class 引用类型如何交换两个数字 {
    public static void main(String[] args) throws Exception {
        Integer a = 1;
        Integer b =  2;
        System.out.println("before swap: a = "+a+",b ="+b);
        swap(a,b);
        System.out.println("after swap: a = "+a+",b ="+b);
    }

    public static void swap(Integer num1,Integer num2) throws Exception {
        Field filed = Integer.class.getDeclaredField("value");
//        for(Field fi:filed){
//            System.out.println(fi);
//        }
        filed.setAccessible(true);
        int tmp;
        tmp = num1;
       // filed.setInt(num2,num1.intValue());
//        filed.set(num1,num2.intValue());
//        filed.set(num2,new Integer(tmp));
        filed.setInt(num1,num2);
        filed.setInt(num2,tmp);
        //num2 = tmp;
    }
}
