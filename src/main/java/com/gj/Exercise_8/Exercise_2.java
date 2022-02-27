package com.gj.Exercise_8;

public class Exercise_2 {
    public int findKth(int[] a, int n, int K) {
        // write code here
        K = n - K;
        int left = 0;
        int right = n-1;
        int mid = partition(a,left,right);
        while (mid!=K){
            if (mid<K){
                mid = partition(a,mid+1,right);
            }else {
                mid = partition(a,left,mid-1);
            }
        }
        return a[K];

    }

    public int partition(int[]arr, int left, int right){
        int temp = arr[left];
        while (left<right){
            while (arr[right]>=temp && left<right){
                right--;
            }
            if (left<right){
                arr[left]=arr[right];
                left++;
            }
            while (arr[left]<=temp && left<right){
                left++;
            }
            if (left<right){
                arr[right] = arr[left];
                right--;
            }
        }
        arr[left] = temp;
        return left;
    }
}
