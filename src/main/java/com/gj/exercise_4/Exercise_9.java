package com.gj.exercise_4;

public class Exercise_9 {
    public int search (int[] nums, int target) {
        // write code here
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;

            if (target>nums[mid]){
                left = mid+1;
            }else if (target<nums[mid]){
                right = mid-1;
            }else {
                if (mid==0 || nums[mid]!=nums[mid-1]){
                    return mid;
                }else {
                    right = mid-1;
                }
            }
        }
        return -1;


    }
}
