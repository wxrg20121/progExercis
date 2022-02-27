package com.gj.exercise_9.exercise_12;

public class Exercise_84 {
    public int minMoney (int[] arr, int aim) {
        int[]dp = new int[aim+1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = aim+1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i>=arr[j]){
                    dp[i] = Math.min(dp[i],dp[i-arr[j]]+1);
                }
            }
        }
        return dp[aim]==aim+1?-1:dp[aim];
    }
}
