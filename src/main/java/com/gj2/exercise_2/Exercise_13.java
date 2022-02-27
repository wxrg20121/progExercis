package com.gj2.exercise_2;

public class Exercise_13 {
    public int getLongestPalindrome (String A) {
        // write code here
        int n = A.length();
        int res = 0;
        boolean[][] dp = new boolean[n][n];
        for (int d = 0; d < n; d++) {
            for (int i = 0; i < n-d; i++) {
                int j = i+d;
                if (A.charAt(i)==A.charAt(j)){
                    if (d==0||d==1){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if (dp[i][j]){
                    res = Math.max(res,d+1);
                }
            }
        }
        return res;
    }
}
