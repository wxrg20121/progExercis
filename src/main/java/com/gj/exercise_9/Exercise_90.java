package com.gj.exercise_9;

public class Exercise_90 {
    public int maxProfit (int[] prices) {
        int buy1 = Integer.MIN_VALUE,buy2 = Integer.MIN_VALUE,sell1 = 0,sell2 = 0;
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(buy1,-1*prices[i]);
            sell1 = Math.max(sell1,buy1+prices[i]);
            buy2 = Math.max(buy2,sell1-prices[i]);
            sell2 = Math.max(sell2,buy2+prices[i]);
        }
        return sell2;
    }
}
