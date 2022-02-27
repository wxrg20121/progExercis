package com.gj.Exercise_7;

public class Exercise_59 {
    public int minNumberdisappered (int[] arr) {
        // write code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=1 && arr[i]<=arr.length && arr[i]-1!=i){
                swap(arr,arr[i]-1,i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i+1) return i+1;
        }
        return arr.length+1;
    }

    public void swap(int[]arr, int i,int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
