package com.gj.exercise_5;

public class Exercise_52 {
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
        return left;
    }
}
