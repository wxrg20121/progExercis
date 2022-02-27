package com.gj.exercise_5;

import java.util.Arrays;
import java.util.Collections;

public class Exercise_65 {

    public static void main(String[] args) {
        int[] nums = new int[]{0};
        System.out.println(solve(nums));
    }
    public static String solve (int[] nums) {
        // write code here
        String []arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr,((o1, o2) -> (o2+o1).compareTo(o1+o2)));

        String res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res += arr[i];
        }
        int count = 0;
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i)!='0'){
                break;
            }else {
                count++;
            }
        }
        return count==res.length()? "0" : res.substring(count);
    }
}
