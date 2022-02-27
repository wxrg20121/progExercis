package com.gj.Exercise_7;

import java.util.Arrays;

public class Exercise_78 {
    public int MLS (int[] arr) {
        // write code here
        if (arr==null || arr.length==0) return 0;
        Arrays.sort(arr);
        int count = 1;
        int res = 1;
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
