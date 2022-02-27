package com.gj.Exercise_7;

public class Exercise_36 {
    public long maxWater (int[] arr) {
        // write code here
        long res = 0;
        int left = 0;
        int right = arr.length-1;
        int maxleft = arr[left];
        int maxright = arr[right];
        while (left<right){
            if (maxleft<maxright){
                left++;
                if (arr[left]>=maxleft){
                    maxleft = arr[left];
                }else {
                    res+=maxleft-arr[left];
                }
            }else {
                right--;
                if (arr[right]>=maxright){
                    maxright = arr[right];
                }else {
                    res += maxright-arr[right];
                }
            }
        }
        return res;
    }
}
