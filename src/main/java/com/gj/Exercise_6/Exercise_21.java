package com.gj.Exercise_6;

public class Exercise_21 {
    public int sqrt (int x) {
        // write code here
        if (x==0 || x==1) return x;

        long r = x;
        while (x/r<r){
            r = (r+x/r)/2;
        }
        return (int)r;
    }
}
