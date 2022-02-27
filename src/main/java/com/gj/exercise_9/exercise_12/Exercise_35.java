package com.gj.exercise_9.exercise_12;

public class Exercise_35 {
    public int maxProfit (int[] prices) {
        int price = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            price = Math.min(price,prices[i]);
            res = Math.max(res,prices[i]-price);
        }
        return res;
    }
}
