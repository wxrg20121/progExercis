package com.gj.exercise_5;

public class Exercise_26 {

    public static void main(String[] args) {
        int[] A = new int[]{1};
        System.out.println(search(A,1));
    }

    public static int search (int[] A, int target) {
        // write code here
        if (A.length==0){
            return -1;
        }
        int left = 0;
        int right = A.length-1;
        if (A[0]<A[right]){
            return binarySearch(A,0,A.length-1,target);
        }else {
            while (A[left]>A[right]){
                if (right-left==1){
                    break;
                }
                int mid = (left+right)/2;
                if (A[mid]>A[left]){
                    left = mid;
                }else {
                    right = mid;
                }
            }
            if (target>=A[0]){
                return binarySearch(A,0,left,target);
            }else {
                return binarySearch(A,left+1,A.length-1,target);
            }
        }

    }

    public static int binarySearch(int[] arr,int left,int right,int target){
        if (arr.length==0){
            return -1;
        }
        while (left<=right){
            int mid = (left+right)/2;
            if (target>arr[mid]){
                left=mid+1;
            }else if (target<arr[mid]){
                right=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public int partition(int []arr){
        if (arr.length==0){
            return 0;
        }
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while (arr[left]>arr[right]){
            if (right-left==1){
                break;
            }
            mid = (left+right)/2;
            if (arr[mid]>=arr[left]){
                left = mid;
            }else{
                right=mid;
            }
        }
        return arr[right];
    }

}
