package com.gj.exercise_9;

public class Exercise_84 {
    public int[] solve (int n, int m, int[] a) {
        m %= n;
        reverse(a,0,n-1);
        reverse(a,0,m-1);
        reverse(a,m,n-1);
        return a;
    }

    public void reverse(int[]arr, int left,int right){
        while (left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    public void swap(int[] arr, int left, int right){
        arr[left] = arr[left] + arr[right];
        arr[right] = arr[left] - arr[right];
        arr[left] = arr[left] - arr[right];
    }
}
