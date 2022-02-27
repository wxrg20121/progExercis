package com.gj.exercise_9.exercise_12;

public class Exercise_90 {
    public int[] solve (int n, int m, int[] a) {
        m %= n;
        reverse(a,0,a.length-1);
        reverse(a,0,m-1);
        reverse(a,m,a.length-1);
        return a;
    }

    public void reverse(int[] arr, int left, int rgiht){
        while (left<rgiht){
            swap(arr,left,rgiht);
            left++;
            rgiht--;
        }
    }

    public void swap(int[] arr, int left, int right){
        arr[left] = arr[left] + arr[right];
        arr[right] = arr[left] - arr[right];
        arr[left] = arr[left] - arr[right];
    }
}
