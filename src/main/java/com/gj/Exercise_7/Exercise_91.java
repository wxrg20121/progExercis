package com.gj.Exercise_7;

public class Exercise_91 {
    public int[] solve (int n, int m, int[] a) {
        // write code here
        m = m%n;
        reverse(a,0,n-1);
        reverse(a,0,m-1);
        reverse(a,m,n-1);
        return a;
    }

    public void reverse(int[]arr, int left, int right){
        while (left<right){
            arr[left] = arr[left]+arr[right];
            arr[right] = arr[left]-arr[right];
            arr[left] = arr[left]-arr[right];
            left++;
            right--;
        }
    }
    
}
