package com.gj.exercise_9.exercise_12;
import java.util.*;

public class Exercise_37 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String>arrayList = new ArrayList<>();
        if (str.length()==0) return arrayList;
        hel(str.toCharArray(),0,arrayList);
        return arrayList;
    }

    public void hel(char[] cstr, int k, ArrayList<String>arrayList) {
        if (k==cstr.length){
            if (!arrayList.contains(new String(cstr))){
                arrayList.add(new String(cstr));
            }
        }
        for (int i = k; i < cstr.length; i++) {
            swap(cstr,k,i);
            hel(cstr,k+1,arrayList);
            swap(cstr,k,i);
        }
    }

    public void swap(char[] cstr, int i, int j){
        char temp = cstr[i];
        cstr[i] = cstr[j];
        cstr[j] = temp;
    }
}
