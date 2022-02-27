package com.gj.Exercise_7;

public class Exercise_48 {
    public int minEditCost (String str1, String str2, int ic, int dc, int rc) {
        // write code here
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        int m = c1.length;
        int n = c2.length;
        int[][]dp = new int[m+1][n+1];
        dp[0][0] = 0;
        for (int i = 1; i <= m; i++) {
            dp[i][0] = i*dc;
        }
        for (int i = 1; i <= n; i++) {
            dp[0][i] = i*ic;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (c1[i-1]==c2[j-1]){
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.min(dp[i-1][j]+dc,Math.min(dp[i][j-1]+ic,dp[i-1][j-1]+rc));
                }

            }
        }
        return dp[m][n];
    }
}
