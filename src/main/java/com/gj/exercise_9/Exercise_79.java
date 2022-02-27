package com.gj.exercise_9;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_79 {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        hel(num,new ArrayList<Integer>(),arrayList_all);
        return arrayList_all;
    }

    public void hel(int[] num,ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>>arrayList_all){
        if (arrayList.size()==num.length){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = 0; i < num.length; i++) {
            if (!arrayList.contains(num[i])){
                arrayList.add(num[i]);
                hel(num,arrayList,arrayList_all);
                arrayList.remove(arrayList.size()-1);
            }
        }
    }
}
