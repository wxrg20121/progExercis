package com.gj.Exercise_8;

public class Exercise_51 {
    public int solve (String nums) {
        // write code here
        if (nums==null||nums.length()==0)
            return 0;
        int m = nums.length();
        int[]dp = new int[m+1];
        dp[0]=1;
        dp[1]= (nums.charAt(0)=='0'?0:1);
        for (int i = 2; i <= m; i++) {
            int val = Integer.parseInt(nums.substring(i-2,i));
            if (val>=10 && val<=26){
                dp[i]=dp[i-2];
            }
            if (nums.charAt(i-1)!='0'){
                dp[i]+=dp[i-1];
            }
        }
        return dp[m];
    }
}
