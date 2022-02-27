package com.gj.exercise_9;

import java.util.ArrayList;

public class Exercise_78 {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= S.length; i++) {
            hel(S,0,i,new ArrayList<>(),arrayList_all);
        }
        return arrayList_all;
    }

    public void hel(int []S,int start,int k,ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>>arrayList_all){
        if (k<0) return;
        if (k==0){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i < S.length; i++) {
            arrayList.add(S[i]);
            hel(S,i+1,k-1,arrayList,arrayList_all);
            arrayList.remove(arrayList.size()-1);
        }
    }
}
