package com.gj.Exercise_7;

public class Exercise_105 {
    public int candy (int[] arr) {
        // write code here
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
        for (int i = arr.length-2; i >=0 ; i--) {
            if (arr[i]>arr[i+1] && dp[i]<=dp[i+1]){
                dp[i] = dp[i+1]+1;
            }
            res += dp[i];
        }
        return res;
    }
}
