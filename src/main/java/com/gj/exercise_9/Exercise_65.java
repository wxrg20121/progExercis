package com.gj.exercise_9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_65 {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        hel(num,0,target,new boolean[num.length],new ArrayList<>(),arrayList_all);
        return arrayList_all;
    }

    public void hel(int[]num, int start, int target,boolean[]isvisted, ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>>arrayList_all){
        if (target==0 && !arrayList_all.contains(arrayList)){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i < num.length; i++) {
            if (target<num[i]) return;
            if (!isvisted[i]){
                arrayList.add(num[i]);
                isvisted[i] = true;
                hel(num,i,target-num[i],isvisted,arrayList,arrayList_all);
                arrayList.remove(arrayList.size()-1);
                isvisted[i] = false;
            }
        }
    }
}
