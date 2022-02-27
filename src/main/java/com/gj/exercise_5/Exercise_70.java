package com.gj.exercise_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_70 {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        if (S==null || S.length==0){
            return arrayList_all;
        }
        Arrays.sort(S);
        for (int k = 0; k <= S.length; k++) {
            backracking(S,k,0,new ArrayList<>(),arrayList_all);
        }
        return arrayList_all;
    }

    public void backracking(int[]arr,int k, int start, ArrayList<Integer> arrayList,ArrayList<ArrayList<Integer>> arrayList_all){
        if (k==0){
            arrayList_all.add(new ArrayList<>(arrayList));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            arrayList.add(arr[i]);
            backracking(arr,k-1,i+1,arrayList,arrayList_all);
            arrayList.remove(arrayList.size()-1);
        }

    }
}
