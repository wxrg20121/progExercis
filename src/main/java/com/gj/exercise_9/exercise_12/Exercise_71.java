package com.gj.exercise_9.exercise_12;

import java.util.*;

public class Exercise_71 {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        hel(num,target,0,new boolean[num.length],arrayList_all,new ArrayList<>());
        return arrayList_all;
    }

    public void hel(int[] num, int target, int start, boolean[] isvisted, ArrayList<ArrayList<Integer>> arrayList_all, ArrayList<Integer> arrayList){
        if (target==0 && !arrayList_all.contains(arrayList)){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i < num.length; i++) {
            if (target<num[i]) return;
            if (!isvisted[i]){
                arrayList.add(num[i]);
                isvisted[i] = true;
                hel(num,target-num[i],i,isvisted,arrayList_all,arrayList);
                isvisted[i] = false;
                arrayList.remove(arrayList.size()-1);
            }
        }
    }
}
