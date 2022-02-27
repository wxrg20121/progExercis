package com.gj.Exercise_7;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_35 {
    public ArrayList<String> arrayList = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        hel(str.toCharArray(),0);
        Collections.sort(arrayList);
        return arrayList;
    }
    public void hel(char[] arr,int k){
        if (k==arr.length-1){
            if (!arrayList.contains(new String(arr)))
                arrayList.add(new String(arr));
            return;
        }
        for (int i = k; i < arr.length; i++) {
                swap(arr,i,k);
                hel(arr,k+1);
                swap(arr,i,k);
        }
    }
    public void swap(char[]arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
