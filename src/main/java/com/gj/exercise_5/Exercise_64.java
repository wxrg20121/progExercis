package com.gj.exercise_5;

import java.util.Arrays;

public class Exercise_64 {
    public int MLS (int[] arr) {
        // write code here
        int res = 1;
        int count = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]-arr[i]==1){
                count++;
            }else if (arr[i+1]-arr[i]==0){
                continue;
            }else {
                count=1;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}
