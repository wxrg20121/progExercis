package com.gj2.exercise_4;

public class Exercise_13 {
    public int search (int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]<target){
                left = mid+1;
            }else if (nums[mid]>target){
                right = mid-1;
            }else {
                if (mid>0 && nums[mid-1]==nums[mid]){
                    right = mid-1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
