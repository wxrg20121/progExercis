package com.gj.Exercise_6;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_25 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String>arrayList = new ArrayList<>();
        if (str.length()==0) return arrayList;
        hel(str.toCharArray(),0,arrayList);
        Collections.sort(arrayList);
        return arrayList;
    }

    public void hel(char[]c,int k,ArrayList<String>arrayList){
        if (k==c.length-1){
            if (!arrayList.contains(new String(c))){
                arrayList.add(new String(c));
            }
            return;
        }

        for (int i = k; i < c.length; i++) {
            swap(c,i,k);
            hel(c,k+1,arrayList);
            swap(c,i,k);
        }
    }
    public void swap(char[] c,int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
