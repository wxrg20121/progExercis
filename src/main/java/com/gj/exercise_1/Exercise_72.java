package com.gj.exercise_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_72 {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<>();
        backracking(num,0,arrayList_all);
        return arrayList_all;
    }

    public void backracking(int[]arr,int k,ArrayList<ArrayList<Integer>>arrayList_all){
        if (k==arr.length-1){
            ArrayList<Integer>arrayList = new ArrayList<Integer>();
            for (int i = 0; i < arr.length; i++) {
                arrayList.add(arr[i]);
            }
            arrayList_all.add(arrayList);
        }
        for (int i = k; i < arr.length; i++) {
            swap(arr,i,k);
            backracking(arr,k+1,arrayList_all);
            swap(arr,i,k);
        }

    }

    private void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
