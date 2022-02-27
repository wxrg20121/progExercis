package com.gj.exercise_9.exercise_12;

public class Exercise_85 {
    public int findPeakElement (int[] nums) {
        // write code here
        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i-1]<nums[i]){
                return i;
            }
        }
        return -1;
    }
}
