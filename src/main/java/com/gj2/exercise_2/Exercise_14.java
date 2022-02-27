package com.gj2.exercise_2;

public class Exercise_14 {
    public int sqrt (int x) {
        // write code here
        if (x==0||x==1) return x;
        double r = 1.0;
        while (Math.abs(x-r*r)>0.01){
            r = (r+x/r)/2;
        }
        return (int) r;
    }
}
