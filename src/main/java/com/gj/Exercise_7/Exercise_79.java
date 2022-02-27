package com.gj.Exercise_7;

public class Exercise_79 {

    public int ysf (int n, int m) {
        // write code here
        int index = hel(n,m);
        return index+1;
    }
    public int hel(int n, int m){
        if (n==0) return -1;
        if (n==1) return 0;
        return (hel(n-1,m)+m)%n;
    }
}
