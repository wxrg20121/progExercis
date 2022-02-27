package com.gj.Exercise_7;

public class Exercise_31 {
    public int search (int[] A, int target) {
        // write code here
        if (A.length==0) return -1;
        int left = 0;
        int right = A.length-1;
        while (left<=right){
            int mid = (left+right);
            if (A[mid]==target) return mid;
            if (A[mid]>=A[left]){
                if (A[mid]>target && target>=A[left]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }else {
                if (A[mid]<target && target<=A[right]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
