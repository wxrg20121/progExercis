package com.gj.exercise_2;

import java.util.Arrays;

/**
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 */

public class Exercise_13 {

    public static void main(String[] args) {
        int[] arr = new int[] { 1,2,3,4,5,6,7 };

        System.out.println(Arrays.toString(reOrderArray(arr)));
    }
    public static int[] reOrderArray (int[] array) {
        // write code here
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int preIndex = i;
            int val = array[i];
            if (array[i]%2==0){
                continue;
            }else {
                while (preIndex>j){
                        if (array[preIndex-1]%2==0){
                            array[preIndex] = array[preIndex-1];
                            preIndex--;
                        }
                }
                j ++;
                array[preIndex] = val;
            }

        }
        return array;

    }
}
