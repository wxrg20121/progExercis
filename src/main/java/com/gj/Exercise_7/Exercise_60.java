package com.gj.Exercise_7;

public class Exercise_60 {
    public int solve (int[] a) {
        // write code here
        int left = 0;
        int right = a.length-1;
        while (left<right){
            int mid = (left+right)/2;
            if (a[mid]==mid){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return a[left]==left ? left+1:left;
    }
}
