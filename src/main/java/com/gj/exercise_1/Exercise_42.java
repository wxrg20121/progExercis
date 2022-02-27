package com.gj.exercise_1;

import java.util.ArrayList;

/**
 *
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 *
 * 输出描述 对应每个测试案例，输出两个数，小的先输出。
 *
 * 输入 [1,2,4,7,11,15],15
 * 输出 [4,11]
 *
 */
public class Exercise_42 {

    public static void main(String[] args) {
        int[] arr = new int[] { 1,2,4,7,11,15};
        ArrayList<Integer> arrayList = FindNumbersWithSum(arr,15);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }



    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        if (array.length < 2){
            return arrayList;
        }

        int left = 0;
        int right = array.length-1;
        while (left<right){
            if (array[left]+array[right]==sum){
                arrayList.add(array[left]);
                arrayList.add(array[right]);
                return arrayList;
            }else if (array[left]+array[right]>sum){
                right--;
            }else {
                left++;
            }
        }

        return arrayList;
    }


//    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        if (array.length < 2){
//            return arrayList;
//        }
//        int mult = Integer.MAX_VALUE;
//        int indexleft = 0;
//        int indexright = 1;
//        for (int i = 0; i < array.length - 1; i++) {
//            int target = sum - array[i];
//            int index = bSearch(array,i+1,target);
//            if (index>0){
//                if (mult>=array[i]*array[index]){
//                    mult = array[i]*array[index];
//                    indexleft = i;
//                    indexright = index;
//
//                }
//            }
//        }
//        if (array[indexleft]+array[indexright]==sum){
//            arrayList.add(array[indexleft]);
//            arrayList.add(array[indexright]);
//        }
//        return arrayList;
//    }
//
//    public static int bSearch(int []array,int L,int target){
//        int left = L;
//        int right = array.length-1;
//        while (left<=right){
//            int mid = (left + right)/2;
//            if (array[mid]>target){
//                right = mid - 1;
//            }else if (array[mid]<target){
//                left = mid + 1;
//            }else {
//                return mid;
//            }
//        }
//        return -1;
//    }

}
