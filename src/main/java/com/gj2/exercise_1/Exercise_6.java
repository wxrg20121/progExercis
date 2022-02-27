package com.gj2.exercise_1;

import java.util.*;

public class Exercise_6 {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < S.length; i++) {
            dfs(S,i,0,new ArrayList<Integer>(),arrayList_all);
        }
        return arrayList_all;
    }

    public void dfs(int[] S, int k, int start, ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>>arrayList_all){
        if (k==0){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i < S.length; i++) {
            arrayList.add(S[i]);
            dfs(S,k-1,i+1,arrayList,arrayList_all);
            arrayList.remove(arrayList.size()-1);
        }
    }
}
