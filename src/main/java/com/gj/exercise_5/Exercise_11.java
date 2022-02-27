package com.gj.exercise_5;

public class Exercise_11 {
    public int maxsumofSubarray (int[] arr) {
        // write code here
        if (arr.length==0){
            return 0;
        }
        int mid = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mid = Math.max(arr[i],arr[i]+mid);
            max = Math.max(mid,max);
        }
        return max;
    }
}
