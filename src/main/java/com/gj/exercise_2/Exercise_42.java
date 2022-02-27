package com.gj.exercise_2;

import java.util.ArrayList;

/**
 *
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 *
 *
 */

public class Exercise_42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        if (array.length<2){
            return arrayList;
        }

        int left = 0;
        int right = array.length-1;
        int mult = Integer.MAX_VALUE;
        int min_index1 = -1;
        int mid_index2 = -1;

        while (left<right){
            if (array[left]+array[right]==sum){
                if (array[left]*array[right]<mult){
                    mult=array[left]*array[right];
                    min_index1 = left;
                    mid_index2 = right;
                }
                left++;
                right--;
            }else if (array[left]+array[right]>sum){
                right--;
            }else {
                left++;
            }
        }
        if (min_index1>=0 && mid_index2>=0){
            arrayList.add(array[min_index1]);
            arrayList.add(array[mid_index2]);
        }

        return arrayList;

    }

    public ArrayList<Integer> FindNumbersWithSum1(int [] array, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int left = 0;
        int right = array.length-1;
        while (left<right){
            if (array[left]+array[right]==sum){
                arrayList.add(array[left]);
                arrayList.add(array[right]);
                return arrayList;
            }else if (array[left]+array[right]>sum){
                right--;
            }else {
                left++;
            }
        }
        return arrayList;

    }

}
