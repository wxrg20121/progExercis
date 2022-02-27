package com.gj.exercise_9.exercise_12;

public class Exercise_88 {
    public int count = 0;
    public int InversePairs(int [] array) {
        mergeSort(array,0,array.length-1);
        return count;
    }

    public void mergeSort(int[] arr, int left, int right){
        if (left<right){
            int mid = (left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=right){
            if (arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else {
                count+=mid-i+1;
                count %= 1000000007;
                temp[k++] = arr[j++];
            }
        }
        while (i<=mid){
            temp[k++] = arr[i++];
        }
        while (j<=right){
            temp[k++] = arr[j++];
        }
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[left+k2] = temp[k2];
        }
    }
}
