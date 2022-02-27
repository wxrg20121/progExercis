package com.gj.exercise_9;

import java.util.ArrayList;

public class Exercise_5 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (input.length==0 || k<=0 || k>input.length) return arrayList;
        int mid = partition(input,0,input.length-1);
        while (mid!=k-1){
            if (mid<k-1){
                mid = partition(input,mid+1,input.length-1);
            }else {
                mid = partition(input,0,mid-1);
            }
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
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
                arr[right]=arr[left];
                right--;
            }
        }
        arr[left]=temp;
        return left;
    }
}
