package com.gj.Exercise_8;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_17 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        char[] arr = str.toCharArray();
        hel(arr,0,arrayList);
        Collections.sort(arrayList);
        return arrayList;
    }
    public void hel(char[] arr,int k,ArrayList<String>arrayList){
        if (k==arr.length-1){
            if (!arrayList.contains(new String(arr))){
                arrayList.add(new String(arr));
            }
        }
        for (int i = k; i < arr.length; i++) {
            swap(arr,k,i);
            hel(arr,k+1,arrayList);
            swap(arr,k,i);
        }
    }

    public void swap(char[]arr,int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
