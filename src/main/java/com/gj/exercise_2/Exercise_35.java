package com.gj.exercise_2;

import java.util.Arrays;

/**
 *
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 *
 */

public class Exercise_35 {
    private int count = 0;

    public static void main(String[] args) {
        Exercise_35 exercise_35 = new Exercise_35();
        int[] arr = new int[] {1,2,3,4,5,6,7,0};
        exercise_35.InversePairs(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int InversePairs(int [] array) {
        if (array.length==0){
            return 0;
        }
        mergeSort(array,0,array.length-1);
        return count;
    }

    public void mergeSort(int []array, int left,int right){
        if (left>=right)return;
        int mid = (left+right)/2;
        mergeSort(array,left,mid);
        mergeSort(array,mid+1,right);
        merge(array,left,mid,right);

    }

    public void merge(int []array, int left, int mid, int right){
        int []temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=right){
            if (array[i]<=array[j]){
                temp[k++] = array[i++];
            }else {
                temp[k++] = array[j++];
                count += mid-i+1;
                if (count>=1000000007){
                    count %= 1000000007;
                }
            }
        }
        while (i<=mid){
            temp[k++] = array[i++];
        }
        while (j<=right){
            temp[k++] = array[j++];
        }
        for (int k2 = 0; k2 < temp.length; k2++) {
            array[left+k2] = temp[k2];
        }
    }



}
