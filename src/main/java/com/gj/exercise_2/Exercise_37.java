package com.gj.exercise_2;

/**
 *
 * 统计一个数字在升序数组中出现的次数。
 *
 */

public class Exercise_37 {
    public int GetNumberOfK(int [] array , int k) {
        if (array.length==0){
            return -1;
        }
        int first = bSearchFirst(array,k);
        int last = bSearchLast(array,k);
        if (first!=-1 && last!=-1){
            return last-first+1;
        }
        return 0;

    }

    public int bSearchFirst(int []array, int k){
        int left = 0;
        int right = array.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (array[mid]>k){
                right = mid-1;
            }else if (array[mid]<k){
                left = mid+1;
            }else {
                if (mid==0 || array[mid]!=array[mid-1]){
                    return mid;
                }else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }

    public int bSearchLast(int []array,int k){

        int left = 0;
        int right = array.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (array[mid]>k){
                right = mid-1;
            }else if (array[mid]<k){
                left = mid+1;
            }else {
                if (mid==array.length-1 || array[mid]!=array[mid+1]){
                    return mid;
                }else {
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}
