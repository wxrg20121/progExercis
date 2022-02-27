package com.gj.exercise_9;

public class Exercise_88 {
    public int solve (String nums) {
        // write code here
        if (nums==null || nums.length()==0) return 0;
        int[] dp = new int[nums.length()+1];
        dp[0] = 1;
        dp[1] = nums.charAt(0)=='0'?0:1;
        for (int i = 2; i <= nums.length(); i++) {
            int val = Integer.parseInt(nums.substring(i-2,i));
            if (val>=10 && val<=26){
                dp[i] = dp[i-2];
            }
            if (nums.charAt(i-1)!='0'){
                dp[i]+=dp[i-1];
            }
        }
        return dp[nums.length()];
    }
}
