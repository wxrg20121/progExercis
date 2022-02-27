package com.gj.exercise_9;

public class Exercise_46 {
    public String LCS (String s1, String s2) {
        // write code here
        if (s1.length()==0 || s2.length()==0) return "-1";
        int m = s1.length();
        int n = s2.length();
        int[][]dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        if (dp[m][n]==0) return "-1";
        int i = m;
        int j = n;
        StringBuffer sb = new StringBuffer();
        while (i>0 && j>0){
            if (s1.charAt(i-1)==s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }else {
                if (dp[i][j-1]>dp[i-1][j]){
                    j--;
                }else {
                    i--;
                }
            }
        }
        return sb.reverse().toString();
    }
}
