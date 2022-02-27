package com.gj.exercise_5;

public class Exercise_39 {

    public static void main(String[] args) {
        System.out.println(minEditCost("abc","adc",5,3,2));
    }

    public static int minEditCost (String str1, String str2, int ic, int dc, int rc) {
        // write code here
        if (str1.length()==0) return str2.length()*ic;
        if (str2.length()==0) return str1.length()*dc;
        int len1 = str1.length();
        int len2 = str2.length();
        int[][]dp = new int[len1+1][len2+1];
        for (int i = 0; i <=len1; i++) {
            dp[i][0] = i*dc;
        }
        for (int i = 0; i <=len2; i++) {
            dp[0][i] = i*ic;
        }
        for (int i = 1; i <=len1 ; i++) {
            for (int j = 1; j <=len2; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.min(dp[i-1][j]+dc,Math.min(dp[i][j-1]+ic,dp[i-1][j-1]+rc));
                }
            }
        }
        return dp[len1][len2];
    }
}
