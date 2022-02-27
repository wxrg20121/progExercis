package com.gj.Exercise_6;

public class Exercise_46 {
    public int reverse (int x) {
        // write code here
        int res = 0;
        while (x!=0){
            int tail = x%10;
            int newres = res*10 + tail;
            if ((newres-tail)/10!=res){
                return 0;
            }
            x/=10;
            res = newres;
        }
        return res;
    }
}
