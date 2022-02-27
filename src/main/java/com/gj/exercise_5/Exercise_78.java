package com.gj.exercise_5;

public class Exercise_78 {
    public int[] solve (int n, int m, int[] a) {
        // write code here
        reverse(a,0,a.length-1);
        reverse(a,0,m-1);
        reverse(a,m,a.length-1);
        return a;
    }

    public void reverse(int[]arr,int left,int right){
        while (left<right){
            arr[left] = arr[left]+arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];
            left++;
            right--;
        }
    }
}
