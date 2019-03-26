package com.题目1到题目10;

/**
 * @author medal
 * @create 2019-01-06 11:17
 **/
/*
* 题目描述：一个二维数组，每一行从左到右递增，每一列从上到下递增．输
           入一个二维数组和一个整数，判断数组中是否含有整数。
* */
public class 题目3_二维数组中查找 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(findNumber(array,4));
        System.out.println("-------------------------------------");
        System.out.println(method(array,4));
    }
    //方式一：暴力破解，双重for循环
    public static boolean findNumber(int[][] array,int number){
        long start = System.currentTimeMillis();
        boolean result = false;
        for(int i =0;i < array.length;i ++){
            for(int j = 0; j< array[0].length; j ++){
                if(array[i][j] == number){
                    result = true;
                    return result;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return result;
    }

    //方式二：注意到该特殊的二维数组，行递增，列也递增
    public static boolean method(int[][] array,int number){
        long start = System.currentTimeMillis();
        boolean result = false;
        int row = 0;
        int col = array[0].length-1;
        while(row < array.length && col >=0){
            if(array[row][col] == number){
                result = true;
                return result;
            }
            if(array[row][col] < number){
                row ++;
            }else{
                col --;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return result;
    }
}
