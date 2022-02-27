package com.gj.exercise_9;

import java.util.Arrays;

public class Exercise_54 {
    public int minNumberdisappered (int[] arr) {
        // write code here
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=1 && arr[i]<=n && arr[i]-1!=i){
                swap(arr,arr[i]-1,i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]-1!=i){
                return i+1;
            }
        }
        return n+1;
    }

    public void swap(int[] arr,int left, int right){
        arr[left] = arr[left]+arr[right];
        arr[right] = arr[left]-arr[right];
        arr[left] = arr[left]-arr[right];
    }
}
