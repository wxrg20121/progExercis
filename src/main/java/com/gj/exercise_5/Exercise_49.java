package com.gj.exercise_5;

public class Exercise_49 {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(String.valueOf(x));
    }
    public int reverse (int x) {
        // write code here
        int res = 0;
        while (x!=0){
            int tail = x%10;
            int newRes = res*10 + tail;
            if ((newRes-tail)/10 != res){
                return 0;
            }
            res = newRes;
            x/=10;
        }
        return res;
    }
}
