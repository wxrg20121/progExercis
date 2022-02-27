package com.gj.exercise_10;

import java.util.ArrayList;

public class Exercise_1 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (input.length==0 || k>input.length || k<=0) return arrayList;
        int left = 0;
        int right = input.length-1;
        int mid = partition(input,left,right);
        while (mid!=k-1){
            if (mid<k-1){
                mid = partition(input,mid+1,right);
            }else {
                mid = partition(input,left,mid-1);
            }
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }
    public int partition(int[] arr, int left, int right){
        int temp = arr[left];
        while (left<right){
            while (temp<=arr[right] && left<right){
                right--;
            }
            if (left<right){
                arr[left] = arr[right];
                left++;
            }
            while (temp>=arr[left] && left<right){
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
