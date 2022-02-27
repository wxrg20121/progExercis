package com.gj.exercise_2;

/**
 *
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */

public class Exercise_40 {
    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
        int []result = new int[2];
        if (array.length<=1){
            return null;
        }
        int number = array[0];
        for (int i = 1; i < array.length; i++) {
            number ^= array[i];
        }
        int index = 0;
        while ((number&1)==0){
            number = number>>1;
            index++;
        }

        for (int i = 0; i < array.length; i++) {
            if (((array[i]>>index)&1)==0){
                result[0]^=array[i];
            }else {
                result[1]^=array[i];
            }
        }
        if (result[0]>result[1]){
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
        }
        return result;

    }
}
