package com.gj.exercise_9;

public class Exercise_27 {
    public int search (int[] nums, int target) {
        // write code here
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]>=nums[left]){
                if (target<nums[mid] && target>=nums[left]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }else {
                if (target>nums[mid] && target<=nums[right]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
