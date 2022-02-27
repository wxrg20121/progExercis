package com.gj.exercise_9.exercise_12;

public class Exercise_33 {
    public int sqrt (int x) {
        if (x==0 || x==1) return x;
        int r = x;
        while (x/r < r){
            r = (r+x/r)/2;
        }
        return (int)r;
    }
}
