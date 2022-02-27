package com.gj.exercise_1;

import java.util.Arrays;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 *
 */
public class Exercise_28 {

    public static void main(String[] args) {
        int []array = {4,2,1,4,2,4};
        int mid = array.length;
        int result = MoreThanHalfNum_Solution(array);
        System.out.println(result);

    }

    public static int MoreThanHalfNum_Solution(int [] array) {

        if (array.length==0){
            return 0;
        }

        int left = 0;
        int mid = array.length/2;
        int right = array.length - 1;


        int index = patition(array,0,array.length-1);

        while (index!=mid){
            if (index<mid){
                index = patition(array,index+1,right);
            }else {
                index = patition(array,left,index-1);
            }
        }

        int result = array[index];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==result){
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        if (count*2<=array.length){
            return 0;
        }else {
            return result;
        }
    }

    public static int patition(int [] array,int left, int right){
        int temp = array[left];
        while (left<right){
            while (temp<=array[right] && left<right){
                right --;
            }
            if (left<right){
                array[left] = array[right];
                left ++;
            }
            while (temp>=array[left] && left<right){
                left ++;
            }
            if (left<right){
                array[right] = array[left];
                right --;
            }
        }
        array[left]=temp;
        return left;
    }

}
