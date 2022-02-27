package com.gj.exercise_5;

public class Exercise_76 {
    public int solve (char[][] matrix) {
        // write code here
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 1; i < m; i++) {
            if (matrix[i][0]=='1')
                dp[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (matrix[0][i]=='1'){
                dp[0][i] = 1;
            }
        }
        int max = 0;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j]=='1'){
                    dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1])) + 1;
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        return max*max;

    }
}
