package com.gj.exercise_9.exercise_12;

public class Exercise_28 {
    public int Fibonacci(int n) {
        if (n==1) return 1;
        if (n==2) return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
