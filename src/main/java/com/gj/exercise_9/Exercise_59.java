package com.gj.exercise_9;

public class Exercise_59 {
    public static void main(String[] args) {
//        System.out.println(fun(17));
        int[] arr = new int[]{4,5,6,1,2,3};
        System.out.println(fun(arr));
    }

//    public static int fun(int x){
//        if (x==0 || x==1) return x;
//        int r = x;
//        while (x/r<r){
//            r = (r+x/r)/2;
//        }
//        return (int)r;
//    }


    public static int fun(int[]arr){
        if (arr.length==0) return -1;
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            if (arr[left]<arr[right]) return arr[left];
            int mid = (left+right)/2;
            if (arr[mid]>arr[left]){
                left = mid+1;
            }else if (arr[mid]<arr[right]){
                right = mid;
            }else {
                ++left;
            }
        }
        return arr[left];
    }

}
