package com.gj.Exercise_7;

public class Exercise_12 {
    public int maxsumofSubarray (int[] arr) {
        // write code here
        int res = 0;
        int mid = 0;
        for (int i = 0; i < arr.length; i++) {
            mid = Math.max(arr[i],arr[i]+mid);
            res = Math.max(res,mid);
        }
        return res;
    }
}
