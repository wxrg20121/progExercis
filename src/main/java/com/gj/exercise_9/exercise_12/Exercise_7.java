package com.gj.exercise_9.exercise_12;

public class Exercise_7 {
    public int findKth(int[] a, int n, int K) {
        // write code here
        if (a.length<=0 || K<=0 || K>a.length){
            return -1;
        }
        int left = 0;
        int right = a.length-1;
        int mid = partition(a,left,right);
        while (mid!=n-K){
            if (mid<n-K){
                mid = partition(a,mid+1,right);
            }else {
                mid = partition(a,left,mid);
            }
        }
        return a[n-K];
    }

    public static int partition(int[] arr, int left, int right){
        int temp = arr[left];
        while (left<right){
            while (arr[right]>=temp && left<right){
                right--;
            }
            if (left<right){
                arr[left] = arr[right];
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
        arr[left]=temp;
        return left;
    }
}
