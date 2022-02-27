package com.gj.exercise_5;

public class Exercise_2 {

    public static void quickSort(int[]arr,int left,int right){
        if (left<right){
            int mid = partition(arr,left,right);
            quickSort(arr,left,mid);
            quickSort(arr,mid+1,right);
        }
    }

    public static int partition(int []arr,int left,int right){
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
        arr[left] = temp;
        return left;
    }
}
