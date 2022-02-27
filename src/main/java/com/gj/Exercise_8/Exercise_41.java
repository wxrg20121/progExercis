package com.gj.Exercise_8;

import java.util.Arrays;
import java.util.Collections;

public class Exercise_41 {
    public String solve (int[] nums) {
        // write code here
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(o1, o2)->(o2+o1).compareTo(o1+o2));
        String res = "";
        if (arr[0].charAt(0)=='0') return "0";
        for (int i = 0; i < arr.length; i++) {
            res+=arr[i];
        }
        return res;
    }
}
