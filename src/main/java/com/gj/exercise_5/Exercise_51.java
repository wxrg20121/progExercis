package com.gj.exercise_5;

public class Exercise_51 {
    public int minNumberdisappered (int[] arr) {
        // write code here
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=1 && arr[i]<=n && arr[arr[i]-1]!=arr[i]){
                swap(arr,arr[arr[i]-1],i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }

    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
