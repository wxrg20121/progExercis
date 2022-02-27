package com.gj.exercise_1;

/**
 *
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。
 * 求所有子数组的和的最大值。要求时间复杂度为 O(n).
 *
 *输入 [1,-2,3,10,-4,7,2,-5]
 * 输出 18
 * 利用动态规划
 *
 * dp = max{dp+array[i],array[i]}.
 *
 */
public class Exercise_30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length==0)
            return 0;
        int res = array[0];
        int dp = array[0];
        for (int i = 1; i < array.length; i++) {
            dp = Math.max(array[i],array[i]+dp);
            res = Math.max(res,dp);
        }
        return res;
    }
}
