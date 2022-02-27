package com.gj.Exercise_8;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_44 {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        backracking(num,new ArrayList<>(),arrayList_all);
        return arrayList_all;
    }

    public void backracking(int[]arr,ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>>arrayList_all){
        if (arrayList.size()==arr.length){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arrayList.contains(arr[i])){
                arrayList.add(arr[i]);
                backracking(arr,arrayList,arrayList_all);
                arrayList.remove(arrayList.size()-1);
            }
        }
    }
}
