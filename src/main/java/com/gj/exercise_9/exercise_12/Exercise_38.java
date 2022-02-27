package com.gj.exercise_9.exercise_12;

public class Exercise_38 {
    public long maxWater (int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int leftmax = arr[0];
        int rightmax = arr[right];
        long res = 0;
        while (left<right){
            if (leftmax<rightmax){
                left++;
                if (leftmax<=arr[left]){
                    leftmax = arr[left];
                }else {
                    res += leftmax - arr[left];
                }
            }else {
                right--;
                if (rightmax<arr[right]){
                    rightmax = arr[right];
                }else {
                    res += rightmax-arr[right];
                }
            }
        }
        return res;
    }
}
