package com.gj.exercise_9.exercise_12;

public class Exercise_108 {
    public int gcd (int a, int b) {
        // write code here
        if (a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
