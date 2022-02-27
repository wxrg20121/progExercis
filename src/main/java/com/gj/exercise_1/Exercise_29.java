package com.gj.exercise_1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 *
 * 输入 [4,5,1,6,2,7,3,8],4
 * 输出 [1,2,3,4]
 *
 */
public class Exercise_29 {
    public static void main(String[] args) {
        int []array = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> arrayList = GetLeastNumbers_Solution(array,4);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer>arrayList = new ArrayList<Integer>();
        if (input.length==0 || k>input.length ||k<=0){
            return arrayList;
        }
        int left = 0;
        int right = input.length - 1;
        int index = partition(input,left,right);
        int flag = k-1;
        while (index!=flag){
            if (index>flag){
                index = partition(input,left,index-1);
            }else {
                index = partition(input,index+1,right);
            }
        }

        System.out.println(Arrays.toString(input));
        for (int i = 0; i <=index ; i++) {
            arrayList.add(input[i]);

        }

        return arrayList;
    }

    public static int partition(int []array, int left, int right){
        int temp = array[left];
        while (left<right){
            while (temp<=array[right] && left<right){
                right--;
            }
            if (left<right){
                array[left]=array[right];
                left++;
            }

            while (temp>=array[left] && left<right){
                left ++;
            }
            if (left<right){
                array[right]=array[left];
                right--;
            }
        }
        array[left]=temp;

        return left;
    }

}
