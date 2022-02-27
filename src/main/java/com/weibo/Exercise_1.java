package com.weibo;

public class Exercise_1 {

    public static void main(String[] args) {
        System.out.println(hel("BDCABA","ABCBDAB"));
    }

    public static String hel(String A,String B){
        int m = A.length();
        int n = B.length();
        int[][]dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (A.charAt(i-1)==B.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        int i=m;
        int j=n;
        if (dp[m][n]==0) return "";
        StringBuffer sb = new StringBuffer();
        while (i>0 && j>0){
            if (A.charAt(i-1)==B.charAt(j-1)){
                sb.append(A.charAt(i-1));
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
        return sb.reverse().toString();
    }
}


/*



 */
