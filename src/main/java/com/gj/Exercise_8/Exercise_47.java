package com.gj.Exercise_8;

public class Exercise_47 {
    public int solve (char[][] matrix) {
        // write code here
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]=='1'){
                    if (i==0||j==0){
                        dp[i][j]=1;
                    }else {
                        dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                    }
                    res = Math.max(res,dp[i][j]);
                }
            }
        }
        return res*res;
    }
}
