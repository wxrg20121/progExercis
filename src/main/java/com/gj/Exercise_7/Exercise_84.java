package com.gj.Exercise_7;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_84 {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(S);
        for (int i = 0; i <= S.length; i++) {
            backracking(S,i,0,new ArrayList<>(),arrayList_all);
        }
        return arrayList_all;
    }

    public void backracking(int[]arr,int k, int start,ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>> arrayList_all){
        if (k==0){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i < arr.length; i++) {
            arrayList.add(arr[i]);
            backracking(arr,k-1,i+1,arrayList,arrayList_all);
            arrayList.remove(arrayList.size()-1);
        }
    }

}
