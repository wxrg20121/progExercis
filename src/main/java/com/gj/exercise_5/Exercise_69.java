package com.gj.exercise_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_69 {


    public static void main(String[] args) {
        int[]arr = new int[]{1,3,5,3,6};
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        backracking(arr,6,0,new ArrayList<>(),arrayList_all);
        for (ArrayList a:arrayList_all
             ) {
            for (int i = 0; i < a.size(); i++) {
                System.out.println(a.get(i));
            }
            System.out.println("*************");
        }
    }

    public static void backracking(int[]arr, int target, int start, ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>> arrayList_all){
        if (target==0){
            arrayList_all.add(new ArrayList<>(arrayList));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            arrayList.add(arr[i]);
            backracking(arr,target-arr[i],i+1,arrayList,arrayList_all);
            arrayList.remove(arrayList.size()-1);
        }

    }
}
