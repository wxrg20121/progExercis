package com.gj2.exercise_2;

public class Exercise_6 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0];
        int mid = array[0];
        for (int i = 1; i < array.length; i++) {
            mid = Math.max(array[i],mid+array[i]);
            res = Math.max(res,mid);
        }
        return res;
    }
}
