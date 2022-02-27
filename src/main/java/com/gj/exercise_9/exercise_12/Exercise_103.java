package com.gj.exercise_9.exercise_12;

public class Exercise_103 {
    public boolean IsContinuous(int [] numbers) {
        if (numbers.length!=5){
            return false;
        }
        int[] arr = new int[14];
        int max = -1;
        int min = 14;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==0){
                continue;
            }
            arr[numbers[i]]++;
            if (arr[numbers[i]]>=2){
                return false;
            }
            max = Math.max(max,numbers[i]);
            min = Math.min(min,numbers[i]);

        }
        if (max-min<5){
            return true;
        }
        return false;
    }
}
