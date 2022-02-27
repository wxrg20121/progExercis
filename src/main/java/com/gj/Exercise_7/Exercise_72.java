package com.gj.Exercise_7;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_72 {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        hel(num,new boolean[num.length],target,0,new ArrayList<>(),arrayList_all);
        return arrayList_all;
    }
    public void hel(int[]num,boolean[]isvisted,int target,int start,ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>>arrayList_all){
        if (target==0 && !arrayList_all.contains(arrayList)){
            arrayList_all.add(new ArrayList<>(arrayList));
            return;
        }
        for (int i = start; i < num.length; i++) {
            if (target<num[i]) return;
            if (!isvisted[i]){
                arrayList.add(num[i]);
                isvisted[i] = true;
                hel(num,isvisted,target-num[i],i,arrayList,arrayList_all);
                arrayList.remove(arrayList.size()-1);
                isvisted[i] = false;
            }
        }
    }
}
