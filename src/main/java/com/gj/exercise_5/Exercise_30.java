package com.gj.exercise_5;

public class Exercise_30 {
    public long maxWater (int[] arr) {
        // write code here
        int i = 0;
        int j = arr.length-1;
        int maxleft = arr[i];
        int maxright = arr[j];
        long res = 0;
        while (i<j){
            if (maxleft<maxright){
                i++;
                if (arr[i]>maxleft){
                    maxleft = arr[i];
                }else {
                    res += maxleft-arr[i];
                }
            }else {
                j--;
                if (arr[j]>maxright){
                    maxright=arr[j];
                }else {
                    res += maxright-arr[j];
                }
            }
        }
        return res;
    }
}
