package com.gj.Exercise_6;

public class Exercise_47 {
    public int minNumberdisappered (int[] arr) {
        // write code here
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=1 && arr[i]<=n && arr[i]-1!=i){
                swap(arr,arr[i]-1,i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]!=i+1)
                return i+1;
        }
        return n+1;
    }

    public void swap(int[]arr,int i,int j){
        arr[i] = arr[i]+arr[j];
        arr[j] = arr[i]-arr[j];
        arr[i] = arr[i]-arr[j];
    }

}
