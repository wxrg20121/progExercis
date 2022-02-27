package com.gj.Exercise_8;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_42 {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        for (int k = 0; k <= S.length; k++) {
            hel(S,0,k,new ArrayList<>(),arrayList_all);
        }
        return arrayList_all;
    }
    public void hel(int[]arr,int start,int k,ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>>arrayList_all){
        if (k==0){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i < arr.length; i++) {
            arrayList.add(arr[i]);
            hel(arr,i+1,k-1,arrayList,arrayList_all);
            arrayList.remove(arrayList.size()-1);
        }
    }
}
