package com.gj.Exercise_6;

public class Exercise_22 {
    public int search (int[] A, int target) {
        // write code here
        int left = 0;
        int right = A.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (A[mid]==target) return mid;
            if (A[mid]>=A[left]){ //左序
                if (target<A[mid] && target>=A[left]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }else {//右序
                if (target>A[mid] && target<=A[right]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
