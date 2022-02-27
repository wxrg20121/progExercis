package com.gj.Exercise_7;

import java.util.ArrayList;

public class Exercise_83 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        backracking(4,2,1,new ArrayList<>(),arrayList_all);
        for (int i = 0; i < arrayList_all.size(); i++) {
            ArrayList<Integer>arrayList = arrayList_all.get(i);
            for (int j = 0; j < arrayList.size(); j++) {
                System.out.println(arrayList.get(j));
            }
            System.out.println("***************");
        }
    }
    public static void backracking(int n, int k, int start, ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>> arrayList_all){
        if (k==0){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i <= n; i++) {
            arrayList.add(i);
            backracking(n,k-1,i+1,arrayList, arrayList_all);
            arrayList.remove(arrayList.size()-1);
        }
    }

    public static void backracking2(int[]arr, int target, int start, ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>> arrayList_all){
        if (target==0){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i < arr.length; i++) {
            arrayList.add(arr[i]);
            backracking2(arr,target-arr[i],i,arrayList, arrayList_all);
            arrayList.remove(arrayList.size()-1);
        }
    }
}
