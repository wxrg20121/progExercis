package com.gj.exercise_9.exercise_12;

public class Exercise_26 {
    public String solve (String str) {
        // write code here
        char[] c = str.toCharArray();
        int left = 0;
        int right = c.length-1;
        while (left<right){
            swap(c,left,right);
            left++;
            right--;
        }
        return new String(c);
    }
    public static void swap(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
