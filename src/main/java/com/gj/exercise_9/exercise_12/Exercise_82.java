package com.gj.exercise_9.exercise_12;

import java.util.*;

public class Exercise_82 {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        backracking(num,arrayList_all,new ArrayList<>());
        return arrayList_all;
    }

    public void backracking(int[] num, ArrayList<ArrayList<Integer>>arrayList_all, ArrayList<Integer>arrayList){
        if (arrayList.size()==num.length){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = 0; i < num.length; i++) {
            if (!arrayList.contains(num[i])){
                arrayList.add(num[i]);
                backracking(num,arrayList_all,arrayList);
                arrayList.remove(arrayList.size()-1);
            }
        }
    }
}
