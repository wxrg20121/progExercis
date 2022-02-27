package com.gj.exercise_5;

public class Exercise_44 {

    public static void main(String[] args) {
        System.out.println(LCS("1A2C3D4B56","B1D23CA45B6A"));
    }

    public static String LCS (String s1, String s2) {
        // write code here
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int m = c1.length;
        int n = c2.length;
        int[][]dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (c1[i-1]==c2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i=m;
        int j=n;
        while (i>0 && j>0){
            if (c1[i-1]==c2[j-1]){
                sb.append(c1[i-1]);
                i--;
                j--;
            }else {
                if (dp[i-1][j]>dp[i][j-1]){
                    i--;
                }else {
                    j--;
                }
            }
        }

        return dp[m][n]==0 ? "-1" : sb.reverse().toString();
    }


}
