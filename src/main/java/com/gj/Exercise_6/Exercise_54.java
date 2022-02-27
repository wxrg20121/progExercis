package com.gj.Exercise_6;

public class Exercise_54 {

    public int minMoney (int[] arr, int aim) {
        // write code here

        int m = arr.length;
        int[] dp = new int[aim+1];
        for (int i = 1; i <=aim ; i++) {
            dp[i] = aim+1;
        }
        for (int i = 1; i <= aim; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i-arr[j]>=0){
                    dp[i] = Math.min(dp[i],dp[i-arr[j]]) + 1;
                }
            }
        }
        return dp[aim]==aim+1?-1:dp[aim];

    }
}
