package com.gj.exercise_9.exercise_12;

public class Exercise_74 {
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
                if (mid>0 && nums[mid]==nums[mid-1]){
                    right = mid-1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
