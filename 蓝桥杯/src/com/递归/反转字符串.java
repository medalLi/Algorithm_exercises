package com.递归;

/**
 * @author medal
 * @create 2019-02-21 14:33
 **/
public class 反转字符串 {
    public static void main(String[] args) {
        System.out.println(method("abcde",0));
    }

    public static String method(String line,int index){
        if(index ==line.length()-1){
            return ""+line.charAt(index);
        }else{
            return method(line,index+1)+line.charAt(index);
        }
    }
}
