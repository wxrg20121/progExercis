package com.gj.exercise_9.exercise_12;

import java.util.HashMap;

public class Exercise_61 {
    public int minNumberDisappeared (int[] nums) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)){
                return i;
            }
        }
        return nums.length+1;
    }
}
