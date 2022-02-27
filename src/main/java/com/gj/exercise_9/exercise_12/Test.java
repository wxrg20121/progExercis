package com.gj.exercise_9.exercise_12;
import java.util.*;
public class Test {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 55/2;
        ArrayList<ArrayList<Integer>>arraylist_all = new ArrayList<ArrayList<Integer>>();
        hel(arr,target,new int[10],new ArrayList<Integer>(),arraylist_all);
        ArrayList<Integer>arrayList = arraylist_all.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void hel(int[]arr, int target, int[]used,ArrayList<Integer>arraylist,ArrayList<ArrayList<Integer>>arraylist_all){
        if(target<0 && arraylist.size()==5){
            arraylist_all.add(new ArrayList<>(arraylist));
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]==0){
                arraylist.add(arr[i]);
                used[i]=1;
                hel(arr,target-arr[i],used,arraylist,arraylist_all);
                used[i]=0;
                arraylist.remove(arraylist.size()-1);
            }
        }
    }
}
