package com.gj.exercise_9;

public class Exercise_20 {
    public String solve (String str) {
        // write code here
        int left = 0;
        int right = str.length()-1;
        char[]cstr = str.toCharArray();
        while (left<right){
            swap(cstr,left,right);
            left++;
            right--;
        }
        return new String(cstr);
    }
    public void swap(char[]arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
