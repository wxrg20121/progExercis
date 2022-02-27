package com.gj.exercise_5;

public class Exercise_21 {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        char[] c = A.toCharArray();
        boolean[][] dp = new boolean[n][n];
        int res = 0;
        for (int d = 0; d < n; d++) {
            for (int i = 0; i < n-d; i++) {
                int j = i+d;
                if (c[i]==c[j]){
                    if (d==0||d==1){
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                    if (dp[i][j]){
                        res = Math.max(res,d+1);
                    }
                }
            }
        }
        return res;
    }
}
