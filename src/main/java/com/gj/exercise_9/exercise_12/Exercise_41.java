package com.gj.exercise_9.exercise_12;

public class Exercise_41 {
    public boolean judge (String str) {
        // write code here
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
