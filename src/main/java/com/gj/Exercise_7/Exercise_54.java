package com.gj.Exercise_7;

public class Exercise_54 {
    public String LCS (String s1, String s2) {
        // write code here
        int m = s1.length();
        int n = s2.length();
        int[][]dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
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
            }else{
                if (dp[i-1][j]>dp[i][j-1]){
                    i--;
                }else {
                    j--;
                }
            }
        }
        return sb.reverse().toString();
    }
}
