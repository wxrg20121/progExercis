package com.gj.exercise_9;

import java.util.Arrays;

public class Exercise_72 {
    public String solve (int[] nums) {
        // write code here
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs,(o1,o2)->(o2+o1).compareTo(o1+o2));
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            res += strs[i];
        }
        return res;
    }
}
