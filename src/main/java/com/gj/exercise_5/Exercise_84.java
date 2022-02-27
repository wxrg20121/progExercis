package com.gj.exercise_5;

public class Exercise_84 {
    public boolean isMatch(String str, String pattern) {

        int m = str.length();
        int n = pattern.length();
        boolean[][]dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            if (pattern.charAt(i-1)=='*'){
                dp[0][i] = true;
            }else {
                break;
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str.charAt(i-1)==pattern.charAt(j-1) || pattern.charAt(j-1)=='?'){
                    dp[i][j] = dp[i-1][j-1];
                }else if (pattern.charAt(j-1)=='*'){
                    dp[i][j] = dp[i-1][j-1] || dp[i][j-1] || dp[i-1][j];
                }
            }
        }
        return dp[m][n];

    }
}
