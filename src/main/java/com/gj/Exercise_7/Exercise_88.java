package com.gj.Exercise_7;

public class Exercise_88 {
    public int solve (int[] a) {
        // write code here
        for (int i = a.length-1; i >= 1; i--) {
            if (a[i]>a[i-1]){
                return i;
            }
        }
        return -1;
    }
}
