package com.gj.Exercise_7;

public class Exercise_96 {
    public int maxProfit (int[] prices) {
        // write code here
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>prices[i-1]){
                res += prices[i]-prices[i-1];
            }
        }
        return res;
    }
}
