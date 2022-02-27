package com.gj.Exercise_8;

public class Exercise_30 {
    public int reverse (int x) {
        // write code here
        if (x==0) return x;
        int sum = 0;
        while (x!=0){
            int tail = x%10;
            int newsum = sum*10 + tail;
            if ((newsum-tail)/10 != sum){
                return 0;
            }
            sum = newsum;
            x/=10;
        }
        return sum;
    }
}
