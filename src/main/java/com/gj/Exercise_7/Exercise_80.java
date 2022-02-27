package com.gj.Exercise_7;

import java.util.Arrays;

public class Exercise_80 {
    public String solve (int[] nums) {
        // write code here
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs,(o1,o2)->(o2+o1).compareTo(o1+o2));

        if (strs[0].charAt(0)=='0') return "0";
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            res += strs[i];
        }
        return res;

    }
}
