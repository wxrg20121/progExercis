package com.gj.Exercise_8;

public class Exercise_48 {
    public int[] solve (int n, int m, int[] a) {
        // write code here
        reverse(a,0,a.length-1);
        reverse(a,0,m-1);
        reverse(a,m,a.length-1);
        return a;
    }

    public void reverse(int[]arr,int left,int right){
        while (left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    public void swap(int[]arr,int i,int j){
        arr[i] = arr[i]+arr[j];
        arr[j] = arr[i]-arr[j];
        arr[i] = arr[i]-arr[j];
    }
}
