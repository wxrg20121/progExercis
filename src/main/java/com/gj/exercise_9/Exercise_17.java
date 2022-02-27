package com.gj.exercise_9;

import java.util.ArrayList;

public class Exercise_17 {
    public String LCS (String str1, String str2) {
        // write code here
        int m = str1.length();
        int n = str2.length();
        int[][]dp = new int[m+1][n+1];
        int maxlen = 0;
        int index = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    if (dp[i][j]>=maxlen){
                        maxlen = dp[i][j];
                        index = i-1;
                    }
                }
            }
        }
        if (maxlen==0) return "";
        return str1.substring(index+1-maxlen,index+1);
    }
}
