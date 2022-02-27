package com.gj.exercise_9.exercise_12;

public class Exercise_77 {
    public int ysf (int n, int m) {
        // write code here
        return hel(n,m)+1;
    }

    public int hel(int n, int m){
        if (n==0) return -1;
        if (n==1) return 0;
        return (hel(n-1,m)+m)%n;
    }
}
