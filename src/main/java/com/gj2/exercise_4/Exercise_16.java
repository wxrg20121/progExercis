package com.gj2.exercise_4;

public class Exercise_16 {
    public int gcd (int a, int b) {
        // write code here
        if (a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
