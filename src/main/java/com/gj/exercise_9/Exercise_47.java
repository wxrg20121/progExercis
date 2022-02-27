package com.gj.exercise_9;

public class Exercise_47 {
    public int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {
        if (arr1==null||arr2==null) return -1;
        int l1=0,r1=arr1.length-1,l2=0,r2=arr2.length-1;
        while (l1<r1){
            int mid1 = (l1+r1)/2;
            int mid2 = (l2+r2)/2;
            int len = r1-l1+1;
            if (arr1[mid1]>arr2[mid2]){
                r1 = mid1;
                l2 = mid2+(len%2==0?1:0);
            }else if (arr1[mid1]<arr2[mid2]){
                r2 = mid2;
                l1 = mid1+(len%2==0?1:0);
            }else {
                return arr1[mid1];
            }
        }
        return Math.min(arr1[l1],arr2[l2]);
    }
}
