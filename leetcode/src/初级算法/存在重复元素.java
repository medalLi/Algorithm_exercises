package 初级算法;

import java.util.HashSet;

/**
 * @author medal
 * @create 2021-03-16 17:28
 **/
public class 存在重复元素 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }

    public static  boolean containsDuplicate(int[] arr) {
        HashSet hs = new HashSet<Integer>();
        // 将数组中元素放入集合中
        for (int i = 0; i < arr.length; i++) {
           hs.add(arr[i]);
        }
        System.out.println(hs.size());
        if(hs.size() < arr.length){
            return true;
        }
        return false;
    }

    public static  boolean containsDuplicate1(int[] arr) {
        // 从list中索引为0开始往后遍历
        for (int i = 0; i < arr.length - 1; i++) {
            // 从list中索引为 list.size()-1 开始往前遍历
            for (int j = arr.length - 1; j > i; j--) {
                // 进行比较
                if (arr[j]==arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}

