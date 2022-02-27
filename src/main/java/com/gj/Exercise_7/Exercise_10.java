package com.gj.Exercise_7;

public class Exercise_10 {
    public int jumpFloor(int target) {
        if (target==0) return 0;
        if (target==1) return 1;
        if (target==2) return 2;
        return jumpFloor(target-1) + jumpFloor(target-2);
    }
}
