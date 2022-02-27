package com.gj.exercise_9.exercise_12;
import java.util.*;

public class Exercise_81 {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= S.length; i++) {
            backracking(S,i,0,arrayList_all,new ArrayList<>());
        }
        return arrayList_all;
    }

    public void backracking(int[] S, int k, int start, ArrayList<ArrayList<Integer>>arrayList_all, ArrayList<Integer> arrayList){
        if (k==0){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i < S.length; i++) {
            arrayList.add(S[i]);
            backracking(S,k-1,i+1,arrayList_all,arrayList);
            arrayList.remove(arrayList.size()-1);
        }
    }
}
