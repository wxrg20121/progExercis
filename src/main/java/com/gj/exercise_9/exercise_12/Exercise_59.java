package com.gj.exercise_9.exercise_12;

public class Exercise_59 {
    public int reverse (int x) {
        if (x==0) return 0;
        int sum = 0;
        while (x!=0){
            int tail = x%10;
            int newsum = sum*10 + tail;
            if ((newsum-tail)/10 != sum){
                return 0;
            }
            x/=10;
            sum = newsum;
        }
        return sum;
    }
}
