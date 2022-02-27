package com.gj.exercise_9.exercise_12;

import java.util.Arrays;

public class Exercise_76 {
    public int MLS (int[] arr) {
        if (arr.length==0) return 0;
        int res = 1;
        int count = 1;
        Arrays.sort(arr);
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
        return res;
    }
}
