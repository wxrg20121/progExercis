package com.gj.exercise_5;

import java.util.ArrayList;

public class Exercise_71 {

    public void hel(char[] c, int k, ArrayList<String> arrayList,ArrayList<ArrayList<String>> arrayList_all){
        if (k==c.length-1){
            arrayList_all.add(new ArrayList<>(arrayList));
            return;
        }

        for (int i = k; i < c.length; i++) {
            swap(c,i,k);
            hel(c,k+1,arrayList,arrayList_all);
            swap(c,i,k);
        }

    }

    public void swap(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

}
