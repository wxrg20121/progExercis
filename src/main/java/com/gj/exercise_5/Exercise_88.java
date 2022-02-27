package com.gj.exercise_5;

public class Exercise_88 {
    public int maxProfit (int[] prices) {
        // write code here
        int buy1 = Integer.MIN_VALUE, buy2=Integer.MIN_VALUE;
        int sell1 = 0, sell2 = 0;
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(buy1,-1*prices[i]);
            sell1 = Math.max(sell1,prices[i]+buy1);
            buy2 = Math.max(buy2,sell1-prices[i]);
            sell2 = Math.max(sell2,buy2+prices[i]);
        }
        return sell2;

    }
}
