package com.gj.Exercise_6;

public class Exercise_48 {
    public int solve (int[] a) {
        // write code here
        int left = 0;
        int right = a.length-1;
        while (left<right){
            int mid = (left+right)/2;
            if (a[mid]==mid){
                left=mid+1;
            }else {
                right = mid-1;
            }
        }
        if (a[left]==left){
            return left+1;
        }else {
            return left;
        }

    }
}
