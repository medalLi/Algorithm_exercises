package com.题目1到题目10;

import java.util.Stack;

/**
 * @author medal
 * @create 2019-01-06 19:52
 **/
/*
* 题目描述：用两个栈实现一个队列，实现对了的两个函数 append Tail 和
  delete Head，分别完成在队列尾插入结点和在队列头部删除结点的功能。
* */
public class 题目7_用两个栈实现队列<T> {
    private Stack<T> stack1=new Stack<T>();
    private Stack<T> stack2=new Stack<T>();

    public static void main(String[] args) throws Exception {
        题目7_用两个栈实现队列<String> p7=new 题目7_用两个栈实现队列<>();
        p7.appendTail("1");
        p7.appendTail("2");
        p7.appendTail("3");
        System.out.println(p7.deleteHead());
        System.out.println(p7.deleteHead());
        System.out.println(p7.deleteHead());
    }

    public void appendTail(T t){
        stack1.push(t);
    }

    public T deleteHead() throws Exception{
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new Exception("队列为空，不能删除");
        }
        return stack2.pop();
    }

}
