package com.gj.Exercise_6;

public class Exercise_13 {
    public String LCS (String str1, String str2) {
        // write code here
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        int[][] dp = new int[c1.length+1][c2.length+1];
        int maxlen = 0;
        int index = 0;
        for (int i = 1; i <= c1.length; i++) {
            for (int j = 1; j <= c2.length; j++) {
                if (c1[i-1]==c2[j-1]){
                    dp[i][j] = dp[i-1][j-1] +1;
                }
                if (maxlen<dp[i][j]){
                    maxlen = dp[i][j];
                    index = i-1;
                }
            }
        }
        if (maxlen==0) return "-1";
        return str1.substring(index+1-maxlen,index+1);
    }
}
