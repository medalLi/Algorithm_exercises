package com.basic_class_01;


import java.util.Scanner;

/**
 * @author medal
 **/
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       // BigDecimal max = new BigDecimal(Math.pow(10,33)-1);
       // BigDecimal[] arr = new BigDecimal[max.intValue()];
        int[] arr = new int[10000000];
        for(int i=0;i <number;i ++){
            int input = sc.nextInt();
            arr[input] = input;
            //list.set(input,new BigDecimal(input));
        }

       // list.set();
        //int[] arr1 = new int[max];
        for(int j = 0;j <number-1;j ++){
            int input = sc.nextInt();
            arr[input] = -1;
            //list.set(input,new BigDecimal(-1)) ;
        }

        for(int i =0;i <arr.length;i ++){
            if(arr[i]>0){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
