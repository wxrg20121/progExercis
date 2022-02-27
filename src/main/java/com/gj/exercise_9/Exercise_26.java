package com.gj.exercise_9;

public class Exercise_26 {
    public int sqrt (int x) {
        // write code here
        if (x==0||x==1) return x;
        int r = x;
        while (x/r<r){
            r=(r+x/r)/2;
        }
        return (int)r;
    }
}
