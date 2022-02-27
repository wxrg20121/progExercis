package com.gj.exercise_2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 *
 */

public class Exercise_27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str.length()==0){
            return arrayList;
        }

        hel(str.toCharArray(),arrayList,0);

        Collections.sort(arrayList);

        return (ArrayList<String>) arrayList;
    }

    public void hel(char []array,ArrayList<String>arrayList,int k){
        if (k==array.length-1){
            if (!arrayList.contains(new String(array))){
                arrayList.add(new String(array));
            }
            return;
        }

        for (int i = k; i < array.length; i++) {
            swap(array,k,i);
            hel(array,arrayList,k+1);
            swap(array,k,i);
        }

    }

    public void swap(char []array,int i,int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
