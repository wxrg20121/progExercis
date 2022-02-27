package com.gj.exercise_9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise_70 {
    public int MLS (int[] arr) {
        Arrays.sort(arr);
        int res = 1;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]-arr[i-1]==1){
                count++;
            }else if (arr[i]==arr[i-1]){
                continue;
            }else {
                count=1;
            }
            res = Math.max(res,count);
        }
        return count;
    }
}
