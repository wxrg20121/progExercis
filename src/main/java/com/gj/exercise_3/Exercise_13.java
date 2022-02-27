package com.gj.exercise_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

public class Exercise_13 {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, -8, -7,2, 9, -4, -1, 5, 0 };
        ArrayList<Integer>arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        ArrayList<Integer>arraylist = new ArrayList<>();
        Collections.sort(arraylist,new Comparator<Integer>(){
            public int compare(Integer o1,Integer o2){
                return o1.compareTo(o2);
            }
        });

        Collections.sort(arrayList,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o1.compareTo(o2);
            }
        });
    }

//    public int[] reOrderArray (int[] array) {
//        // write code here
//
//        int j = 0;
//        for (int i = 0; i < array.length; i++) {
//            int preindex = i;
//            int val = array[i];
//            if (val%2==0){
//                continue;
//            }else {
//                while (preindex>j){
//                    array[preindex]=array[preindex-1];
//                    preindex--;
//                }
//            }
//            array[preindex]=val;
//            j++;
//        }
//        return array;
//    }

    public static int[] reOrderArray(int []array){
        if (array.length==0){
            return array;
        }

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int preindex = i;
            int val = array[i];
            if (val>=0){
                continue;
            }else {
                while (preindex>j){
                    array[preindex]=array[preindex-1];
                    preindex--;
                }
                array[preindex]=val;
                j++;
            }
        }
        return array;

    }
}
