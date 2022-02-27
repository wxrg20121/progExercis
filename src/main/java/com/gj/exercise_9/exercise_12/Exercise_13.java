package com.gj.exercise_9.exercise_12;

public class Exercise_13 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length==0) return 0;
        int mid = array[0];
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            mid = Math.max(array[i],mid+array[i]);
            res = Math.max(res,mid);
        }
        return res;
    }
}
