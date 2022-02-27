package com.gj.exercise_4;

/**
 *
 * 对于一个字符串，请设计一个高效算法，计算其中最长回文子串的长度。
 * 给定字符串A以及它的长度n，请返回最长回文子串的长度。
 *
 */

public class Exercise_10 {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        char[] c = A.toCharArray();
        boolean[][] dp = new boolean[n][n];
        int max = 0;
        int j;
        for (int d = 0; d < n; d++) {
            for (int i = 0; i < n-d; i++) {
                j = i+d;
                if (c[i]==c[j]){
                    if (d==0||d==1){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                    if (dp[i][j])
                        max = Math.max(max,d+1);
                }
            }
        }
        return max;
    }
}
