package com.gj.Exercise_6;

import java.util.ArrayList;

public class Exercise_26 {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= S.length; i++) {
            backracking(S,i,0,arrayList_all,new ArrayList<>());
        }
        return arrayList_all;
    }
    public void backracking(int []arr,int k,int start,ArrayList<ArrayList<Integer>>arrayList_all,ArrayList<Integer> arraylist){
        if (k==0){
            arrayList_all.add(new ArrayList<>(arraylist));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            arraylist.add(arr[i]);
            backracking(arr,k-1,i+1,arrayList_all,arraylist);
            arraylist.remove(arraylist.size()-1);
        }
    }
}
