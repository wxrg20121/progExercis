package com.gj.exercise_5;

public class Exercise_82 {
    public int solve (String nums) {
        // write code here
        if (nums.length()==0 || nums.charAt(0)=='0'){
            return 0;
        }
        int[] dp = new int[nums.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <=nums.length() ; i++) {
            int pre2 = Integer.parseInt(nums.substring(i-2,i));
            if (pre2>=10 && pre2<=26){
                dp[i] = dp[i-2];
            }
            if (nums.charAt(i-1)!='0'){
                dp[i] += dp[i-1];
            }
        }
        return dp[nums.length()];

    }
}
