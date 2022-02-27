package com.gj.exercise_9;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_30 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String>res = new ArrayList<>();
        if (str==null||str.length()==0) return res;
        hel(str.toCharArray(),0,res);
        Collections.sort(res);
        return res;
    }

    public void hel(char[]cstr, int k, ArrayList<String>res){
        if (k==cstr.length-1){
            if (!res.contains(new String(cstr)))
                res.add(new String(cstr));
        }
        for (int i = k; i < cstr.length; i++) {
            swap(cstr,i,k);
            hel(cstr,k+1,res);
            swap(cstr,i,k);
        }
    }
    public void swap(char[]cstr,int i,int j){
        char temp = cstr[i];
        cstr[i] = cstr[j];
        cstr[j] = temp;
    }
}
