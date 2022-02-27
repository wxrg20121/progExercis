package com.gj.exercise_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * 给定一个数组，找出其中最小的K个数。例如数组元素是4,5,1,6,2,7,3,8这8个数字，
 * 则最小的4个数字是1,2,3,4。如果K>数组的长度，那么返回一个空的数组
 * [4,5,1,6,2,7,3,8],4
 *
 */

public class Exercise_29 {

    public static void main(String[] args) {
        int []array = {4,5,1,6,2,7,3,8};
        int mid = array.length;
        ArrayList<Integer> result = GetLeastNumbers_Solution(array,8);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }


    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        if (input.length==0 || k>input.length ||k<=0){
            return arrayList;
        }
        int left = 0;
        int right = input.length-1;
        int index = partition(input,left,right);

        int flag = k-1;
        while (index!=flag){
            if (index>flag){
                index = partition(input,left,index-1);
            }else {
                index = partition(input,index+1,right);
            }
        }

        for (int i = 0; i <= index; i++) {
            arrayList.add(input[i]);
        }

        return arrayList;
    }

    public static int partition(int []array,int left, int right){
        int temp = array[left];
        while (left<right){
            while (array[right]>=temp && left<right){
                right --;
            }
            if (left<right){
                array[left] = array[right];
                left++;
            }
            while (array[left]<=temp && left<right){
                left++;
            }
            if (left<right){
                array[right] = array[left];
                right--;
            }
        }
        array[left] = temp;
        return left;
    }

}
