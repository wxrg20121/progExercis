package com.gj.exercise_9.exercise_12;

public class Exercise_50 {
    public int minEditCost (String str1, String str2, int ic, int dc, int rc) {
        // write code here
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[0][i] = i*ic;
        }
        for (int i = 1; i <= m; i++) {
            dp[i][0] = i*dc;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.min(dp[i-1][j]+dc,Math.min(dp[i][j-1]+ic,dp[i-1][j-1]+rc));
                }
            }
        }
        return dp[m][n];
    }
}
