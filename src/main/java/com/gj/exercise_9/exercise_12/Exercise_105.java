package com.gj.exercise_9.exercise_12;

public class Exercise_105 {
    public int candy (int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[i-1]){
                dp[i] = dp[i-1]+1;
            }else {
                dp[i] = 1;
            }
        }
        int res = dp[dp.length-1];
        for (int i = dp.length-2; i >=0 ; i--) {
            if (arr[i]>arr[i+1] && dp[i]<=dp[i+1]){
                dp[i] = dp[i+1] + 1;
            }
            res+=dp[i];
        }
        return res;
    }
}
