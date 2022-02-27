package com.gj.exercise_5;

import java.util.Stack;

/**
 *
 * 连续就不判断 dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])
 *
 */
public class Exercise_17 {
    public String LCS (String str1, String str2) {
        // write code here
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        int[][] dp = new int[c1.length+1][c2.length+1];
        for (int i = 1; i <= c1.length; i++) {
            for (int j = 1; j <= c2.length; j++) {
                if (c1[i-1]==c2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        Stack<Character>stack = new Stack<>();
        int i=c1.length;
        int j=c2.length;
        while (i>0 && j>0){
            if (c1[i-1]==c2[j-1]){
                stack.push(c1[i-1]);
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
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }


    public String LCS2 (String str1, String str2) {
        // write code here
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        int maxlen = 0;
        int indexMax = 0;
        int[][] dp = new int[c1.length+1][c2.length+1];
        for (int i = 1; i <= c1.length; i++) {
            for (int j = 1; j <= c2.length; j++) {
                if (c1[i-1]==c2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                if (maxlen<dp[i][j]){
                    maxlen = dp[i][j];
                    indexMax = i-1;
                }
            }
        }
        if (maxlen==0){
            return "-1";
        }

        return str1.substring(indexMax-maxlen+1,indexMax+1);
    }
}
