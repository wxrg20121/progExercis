package com.gj.exercise_5;

public class Exercise_45 {
    public int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {
        // write code here
        int l =0, r=0;
        int res = 0;
        while (l+r<arr1.length){
            if (arr1[l]<arr2[r]){
                res = arr1[l++];
            }else {
                res = arr2[r++];
            }
        }
        return res;
    }

}
