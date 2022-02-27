package com.gj.exercise_2;

import java.util.Arrays;

/**
 *
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。
 * 求所有子数组的和的最大值。要求时间复杂度为 O(n).
 *
 * [1,-2,3,10,-4,7,2,-5]
 *
 */

public class Exercise_30 {

    public static void main(String[] args) {
        int []array = {1,-2,3,10,-4,7,2,-5};
        int result = FindGreatestSumOfSubArray(array);
        System.out.println(result);
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array.length==0){
            return 0;
        }
        int result = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (result<0){
                result = array[i];
            }else {
                result += array[i];
            }

            if (max<=result){
                max = result;
            }
        }
        return max;
    }

    public int FindGreatestSumOfSubArray2(int[] array) {
        if (array.length==0)
            return 0;
        int res = array[0];
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            temp = Math.max(array[i],array[i]+temp);
            res = Math.max(res,temp);
        }
        return res;
    }

}
