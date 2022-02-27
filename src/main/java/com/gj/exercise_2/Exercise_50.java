package com.gj.exercise_2;

/**
 *
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中第一个重复的数字。 例如，如果输入长度为7的数组[2,3,1,0,2,5,3]，那么对应的输出是第一个重复的数字2。没有重复的数字返回-1。
 *
 */

public class Exercise_50 {
    public int duplicate (int[] numbers) {
        // write code here
        if (numbers.length==0){
            return -1;
        }
        int []array = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            array[numbers[i]] += 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (array[numbers[i]]>1){
                return numbers[i];
            }
        }
        return -1;



    }
}
