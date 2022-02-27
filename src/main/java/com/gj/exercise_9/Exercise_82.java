package com.gj.exercise_9;

public class Exercise_82 {
    public int solve (int[] a) {
        // write code here
        for (int i = a.length-1; i > 0; i--) {
            if (a[i-1]<a[i]){
                return i;
            }
        }
        return 0;
    }
}
