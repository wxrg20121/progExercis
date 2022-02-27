package com.gj.exercise_2;

/**
 *
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 *
 * [1,2,3,2,2,2,5,4,2]
 *
 * 2
 */

public class Exercise_28 {

    public static void main(String[] args) {
        int []array = {4,2,1,4,2,4,4};
        int mid = array.length;
        int result = MoreThanHalfNum_Solution1(array);
        System.out.println(result);

    }

    public static int MoreThanHalfNum_Solution1(int [] array){

        if (array.length==0){
            return 0;
        }

        int result = array[0];
        int times = 1;

        for (int i = 1; i < array.length; i++) {
            if (times==0){
                result = array[i];
                times = 1;
            }else {
                if (array[i]==result){
                    times++;
                }else {
                    times--;
                }
            }
        }

        times=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==result){
                times++;
            }
        }
        if (times*2<=array.length){
            return 0;
        }
        return result;


    }

    public static int MoreThanHalfNum_Solution(int [] array) {

        if (array.length==0){
            return 0;
        }

        int left = 0;
        int right = array.length-1;
        int mid = (left + right)/2;
        int index = partition(array,left,right);
        while (index != mid){
            if (index<mid){
                index = partition(array,index+1,right);
            }
            if (index>mid){
                index = partition(array,left,index-1);
            }
        }
        int val = array[index];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==val){
                count++;
            }
        }

        if (count*2<=array.length){
            return 0;
        }

        return val;
    }

    public static int partition(int []array,int left,int right){
        int temp = array[left];
        while (left<right){
            while (array[right]>=temp && left<right){
                right--;
            }
            if (left<right){
                array[left] = array[right];
                left ++;
            }
            while (array[left]<=temp && left<right){
                left++;
            }
            if (left<right){
                array[right] = array[left];
                right--;
            }
        }
        array[left] = temp;
        return left;
    }
}
