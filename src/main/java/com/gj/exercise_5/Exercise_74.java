package com.gj.exercise_5;

public class Exercise_74 {
    public int solve (int[] a) {
        // write code here
        if (a.length==0) return -1;
        for (int i = a.length-1; i >=1; i--) {
            if (a[i]>a[i-1]){
                return i;
            }
        }
        return -1;

    }
}
