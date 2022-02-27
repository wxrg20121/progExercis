package com.gj.exercise_9.exercise_12;

public class Exercise_44 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length==0) return 0;
        int left = 0;
        int right = array.length-1;
        int k = (left+right)/2;
        int mid = partition(array,left,right);
        while (mid!=k){
            if (mid<k){
                mid = partition(array,mid+1,right);
            }else {
                mid = partition(array,left,mid-1);
            }
        }
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==array[mid]){
                count++;
            }
        }
        return count>array.length/2?array[mid]:0;
    }

    public int partition(int[] arr, int left, int right){
        int temp = arr[left];
        while (left<right){
            while (arr[right]>=temp && left<right){
                right--;
            }
            if (left<right){
                arr[left] = arr[right];
                left++;
            }
            while (arr[left]<=temp && left<right){
                left++;
            }
            if (left<right){
                arr[right] = arr[left];
                right--;
            }
        }
        arr[left] = temp;
        return left;
    }
}
