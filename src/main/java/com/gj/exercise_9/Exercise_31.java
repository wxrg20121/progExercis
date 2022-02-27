package com.gj.exercise_9;

public class Exercise_31 {
    public long maxWater (int[] arr) {
        // write code here
        int left = 0;
        int right = arr.length-1;
        int leftmax = arr[left];
        int rightmax = arr[right];
        long res = 0;
        while (left<right){
            if (leftmax<rightmax){
                left++;
                if (arr[left]>=leftmax){
                    leftmax=arr[left];
                }else {
                    res += leftmax-arr[left];
                }
            }else {
                right--;
                if (arr[right]>=rightmax){
                    rightmax = arr[right];
                }else {
                    res += rightmax-arr[right];
                }
            }
        }
        return res;
    }
}
