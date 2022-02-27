package com.gj.exercise_5;

public class Exercise_20 {
    public int[] reOrderArray (int[] array) {
        // write code here
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int preindex = i;
            int val = array[i];
            if (val%2==0){
                continue;
            }else {
                while (preindex>j){
                    array[preindex] = array[preindex-1];
                    preindex--;
                }
                array[preindex]=val;
                j++;
            }
        }
        return array;
    }
}
