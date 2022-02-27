package com.gj.Exercise_8;

public class Exercise_45 {
    public int minMoney (int[] arr, int aim) {
        // write code here
        int[]dp = new int[aim+1];
        for (int i = 1; i <= aim; i++) {
            dp[i] = aim+1;
        }
        for (int i = 1; i <= aim; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i>=arr[j]){
                    dp[i] = Math.min(dp[i],dp[i-arr[j]]+1);
                }
            }
        }
        return dp[aim]==aim+1?-1:dp[aim];
    }
}
