package com.gj.exercise_4;

import java.util.ArrayList;

public class Exercise_3 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (input.length==0 || input.length<k){
            return arrayList;
        }

        int mid = partition(input,0,input.length-1);
        while (mid!=k-1){
            if (mid<k-1){
                mid = partition(input,mid,input.length-1);
            }else {
                mid = partition(input,0,mid-1);
            }
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }

        return arrayList;
    }

    public int partition(int[]array,int left,int right){

        int temp = array[left];
        while (left<right){
            while (array[right]>=temp && left<right){
                right--;
            }
            if (left<right){
                array[left]=array[right];
                left++;
            }
            while (array[left]<=temp && left<right){
                left++;
            }
            if (left<right){
                array[right] = array[left];
                right--;
            }
        }
        array[left] = temp;
        return left;
    }
}
