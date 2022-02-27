package com.gj.Exercise_7;

public class Exercise_33 {
    public int maxProfit (int[] prices) {
        // write code here
        if (prices.length==0) return 0;
        int res = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min,prices[i]);
            res = Math.max(res,prices[i]-min);
        }
        return res;
    }
}
