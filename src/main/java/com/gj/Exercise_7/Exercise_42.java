package com.gj.Exercise_7;

public class Exercise_42 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length==0)return 0;
        int left = 0;
        int right = array.length-1;
        int mid = (left+right)/2;
        int index = partition(array,left,right);
        while (index!=mid){
            if (index<mid){
                index = partition(array,index+1,right);
            }else {
                index = partition(array,left,index-1);
            }
        }
        int count = 0;
        for (int i = 0; i <array.length; i++) {
            if (array[i]==array[index]) count++;
        }
        return count>array.length/2?array[index]:0;
    }

    public int partition(int[]arr,int left ,int right){
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
