package com.gj2.exercise_2;

public class Exercise_4 {
    public int jumpFloor(int target) {
        if (target==1) return 1;
        if (target==2) return 1;
        return jumpFloor(target-1)+jumpFloor(target-2);
    }
}
