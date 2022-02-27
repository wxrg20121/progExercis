package com.gj.exercise_2;

import java.util.Arrays;

/**
 *
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *
 */

public class Exercise_32 {


    public static void main(String[] args) {
        Exercise_32 exercise_32 = new Exercise_32();
        int[] arr = new int[] { 3,32,321 };

        System.out.println(exercise_32.PrintMinNumber(arr));
    }

    public  String PrintMinNumber(int [] numbers) {
        String res = "";
        if (numbers.length==0){
            return res;
        }

        quickSort(numbers,0,numbers.length-1);

        for (int i = 0; i < numbers.length; i++) {
            res = res+""+numbers[i];
        }

        return res;
    }

    public void quickSort(int []array,int left,int right){
        if (left>=right){
            return;
        }

        int index = partition(array,left,right);
        quickSort(array,left,index-1);
        quickSort(array,index+1,right);
    }

    public int partition(int []array,int left,int right){
        int temp = array[left];
        while (left<right){
            while ((array[right]+""+temp).compareTo(temp+""+array[right])>= 0 && left<right){
                right--;
            }
            if (left<right){
                array[left]=array[right];
                left++;
            }
            while ((array[left]+""+temp).compareTo(temp+""+array[left])<= 0 && left<right){
                left++;
            }
            if (left<right){
                array[right] = array[left];
                right--;
            }
        }
        array[left] = temp;

        return left;
    }

}
