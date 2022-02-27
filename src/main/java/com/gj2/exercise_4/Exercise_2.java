package com.gj2.exercise_4;
import java.util.*;

public class Exercise_2 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (k<=0 || k>input.length) return arrayList;
        int left = 0;
        int right = input.length-1;
        int mid = partition(input,left,right); //写的不错
        if (k-1!=mid){
            if (mid>k-1){
                mid = partition(input,left,mid);
            }else {
                mid = partition(input,mid+1,right);
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
        arr[left]=temp;
        return left;
    }
}
