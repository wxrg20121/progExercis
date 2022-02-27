package com.gj.exercise_1;

import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 */
public class Exercise_13 {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 8, 7, 9, 4, 1, 5, 0 };
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    //利用插入排序的思想
    public static void reOrderArray(int [] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i]%2!=0){
               int preindex = i-1;
               int current = array[i];
               while (preindex>=0 && array[preindex]%2==0){
                    array[preindex+1] = array[preindex];
                    preindex--;
               }
               array[preindex+1] = current;
            }
        }
    }
}
