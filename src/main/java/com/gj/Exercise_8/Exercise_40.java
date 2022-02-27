package com.gj.Exercise_8;

import java.util.Arrays;

public class Exercise_40 {
    public int MLS (int[] arr) {
        // write code here
        int count = 1;
        int res = 1;
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
