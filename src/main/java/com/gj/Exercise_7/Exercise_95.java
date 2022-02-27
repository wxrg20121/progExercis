package com.gj.Exercise_7;

public class Exercise_95 {
    public int solve (String nums) {
        // write code here
        if (nums==null || nums.length()==0){
            return 0;
        }
        int m = nums.length();
        int[]dp = new int[m+1];
        dp[0] = 1;
        dp[1] = (nums.charAt(1-1)=='0'?0:1);
        for (int i = 2; i <= m; i++) {
            int pre = Integer.parseInt(nums.substring(i-2,i));
            if (pre>=10 && pre<=26){
                dp[i] = dp[i-2];
            }
            if (nums.charAt(i-1)!='0'){
                dp[i]+=dp[i-1];
            }
        }
        return dp[m];
    }
}
