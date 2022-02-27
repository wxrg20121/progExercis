package com.gj.exercise_1;

/**
 *
 * 统计一个数字在升序数组中出现的次数。
 *
 * [1,2,3,3,3,3,4,5],3
 *
 * 4
 *
 *
 * //因为data中都是整数，所以可以稍微变一下，不是搜索k的两个位置，而是搜索k-0.5和k+0.5
 * //这两个数应该插入的位置，然后相减即可。
 *
 */
public class Exercise_37 {


    public static void main(String[] args) {
        int[] arr = new int[] { 1,2,3,3,3,3,4,5};

        System.out.println(bSearchLastValue_2(arr,3));


    }

    public static int GetNumberOfK(int [] array , int k) {
        if (array.length==0)return 0;

        int first = bSearchFirstValue(array,k);
        int last = bSearchLastValue(array,k);
        if (first!=-1 && last!=-1)
            return last - first + 1;

        return 0;
    }

    private static int bSearchFirstValue(int []array,int k){

        int left = 0;
        int right = array.length - 1;
        while (left<=right){
            int mid = (left + right)/2;
            if (array[mid]<k){
                left = mid + 1;
            }else if (array[mid]>k){
                right = mid - 1;
            }else {
                if (mid==0 || array[mid-1]!=array[mid])
                    return mid;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }

    private static int bSearchLastValue(int []array,int k){

        int left = 0;
        int right = array.length - 1;
        while (left<=right){
            int mid = (left + right)/2;
            if (array[mid]<k){
                left = mid + 1;
            }else if (array[mid]>k){
                right = mid - 1;
            }else {
                if (mid==array.length-1 || array[mid+1]!=array[mid])
                    return mid;
                else
                    left = mid + 1;
            }
        }
        return -1;
    }



    private static int recuriveBserach(int []array,int left,int right,int k){

        if (left>right){
            return -1;
        }

        int mid = (left + right)/2;

        if (array[mid]==k){
            if (mid==0 || array[mid-1]!=array[mid])
                return mid;
            else
                return recuriveBserach(array,left,mid-1,k);
        }else if (array[mid]>k){
            return recuriveBserach(array,left,mid-1,k);
        }else {
            return recuriveBserach(array,mid+1,right,k);
        }

    }


    private static int bSearchFirstValue_2(int []array,int k){
        int left = 0;
        int right = array.length - 1;
        while (left<=right){
            int mid = (left + right)/2;
            if (k<array[mid]){
                right = mid-1;
            }else if (k>array[mid]){
                left = mid + 1;
            }else {
                if (mid==0 || array[mid-1]!=array[mid]){
                    return mid;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    private static int bSearchLastValue_2(int []array,int k){
        int left = 0;
        int right = array.length - 1;
        while (left<=right){
            int mid = (left + right)/2;
            if (array[mid]>k){
                right = mid - 1;
            }else if (array[mid]<k){
                left = mid + 1;
            }else {
                if (mid==array.length-1 || array[mid]!=array[mid+1]){
                    return mid;
                }else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }



}
