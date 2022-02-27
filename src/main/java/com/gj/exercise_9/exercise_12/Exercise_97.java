package com.gj.exercise_9.exercise_12;

public class Exercise_97 {
    public int[] reOrderArray (int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int preindex = i;
            int val = array[i];
            if (val%2==0){
                continue;
            }
            while (preindex>j){
                array[preindex] = array[preindex-1];
                preindex--;
            }
            array[preindex] = val;
            j++;
        }
        return array;
    }
}
