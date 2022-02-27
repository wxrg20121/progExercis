package com.gj.exercise_5;

public class Exercise_91 {
    public int GetUglyNumber_Solution(int index) {
        if (index<=0) return 0;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        int []arr = new int[index];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.min(arr[p2]*2,Math.min(arr[p3]*3,arr[p5]*5));
            if (arr[i]==arr[p2]*2) p2++;
            if (arr[i]==arr[p3]*3) p3++;
            if (arr[i]==arr[p5]*5) p5++;
        }
        return arr[index-1];
    }
}
