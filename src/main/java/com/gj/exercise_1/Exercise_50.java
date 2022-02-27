package com.gj.exercise_1;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中第一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * 返回描述：
 * 如果数组中有重复的数字，函数返回true，否则返回false。
 * 如果数组中有重复的数字，把重复的数字放到参数duplication[0]中。（ps:duplication已经初始化，可以直接赋值使用。）
 *
 */
public class Exercise_50 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false

    public static void main(String[] args) {
//        int[] arr = new int[] { 2, 8, 7,2, 9, 4, 1, 5, 0 };
//        quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
    }


    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length<=1){
            return false;
        }

        int []arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[numbers[i]] += 1;
        }
        for (int i = 0; i < length; i++) {
            if (arr[numbers[i]]>=2){
                duplication[0]=numbers[i];
                return true;
            }
        }

        return false;
    }


//    public static int bSearch(int []arr, int k){
//
//        int left = 0;
//        int right = arr.length-1;
//        while (left<=right){
//            int mid = (left+right)/2;
//            if (arr[mid]<k){
//                left = mid + 1;
//            }else if(arr[mid]>k){
//                right = mid - 1;
//            }else {
//                if (mid==0 || arr[mid]!=arr[mid-1]){
//                    return mid;
//                }else {
//                    right = mid - 1;
//                }
//            }
//        }
//
//        return -1;
//    }



//    public static void quickSort(int []arr,int left,int right){
//        if (left<right){
//            int mid = partition(arr,left,right);
//            quickSort(arr,left,mid);
//            quickSort(arr,mid+1,right);
//        }
//    }
//
//    public static int partition(int []arr,int left,int right){
//        int temp = arr[left];
//        while (left<right){
//            while (temp<=arr[right] && left<right){
//                right --;
//            }
//            if (left<right){
//                arr[left] = arr[right];
//                left++;
//            }
//            while (temp>=arr[left] && left<right){
//                left++;
//            }
//            if (left<right){
//                arr[right] = arr[left];
//                right--;
//            }
//        }
//
//        arr[left] = temp;
//        return left;
//    }


}
