package com.gj.exercise_9;

public class Exercise_28 {
    public int maxProfit (int[] prices) {
        // write code here
        int price = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            price = Math.min(price,prices[i]);
            res = Math.max(res,prices[i]-price);
        }
        return res;
        
    }
}
