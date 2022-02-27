package com.gj.exercise_5;

public class Exercise_75 {
    public int count = 0;
    public int InversePairs(int [] array) {
        mergeSort(array,0,array.length-1);
        return count;
    }

    public void mergeSort(int[] array,int left, int right){
        if (left<right){
            int mid = (left+right)/2;
            mergeSort(array,left,mid);
            mergeSort(array,mid+1,right);
            merge(array,left,right,mid);
        }
    }

    public void merge(int[] array,int left,int right,int mid){
        int[]temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=right){
            if (array[i]<=array[j]){
                temp[k++] = array[i++];
            }else {
                count += mid-i+1;
                count %= 1000000007;
                temp[k++] = array[j++];
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
