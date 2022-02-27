package com.gj.exercise_5;

public class Exercise_28 {
    public int maxProfit (int[] prices) {
        // write code here
        if (prices.length==0){
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min,prices[i]);
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }
}
