package com.gj.exercise_1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 *输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *
 *输入 [3,32,321]
 *输出 "321323"
 */
public class Exercise_32 {

    public static void main(String[] args) {
        int []numbers = {3,32,321};
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < numbers.length; i++) {
//            sb.append(numbers[i]);
//        }
//        System.out.println(sb.toString());
        System.out.println(PrintMinNumber(numbers));


    }


    public static String PrintMinNumber(int [] numbers) {
        if (numbers.length==0)return "";
        quickSort(numbers,0,numbers.length-1);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
        }
        return sb.toString();
    }

    public static void quickSort(int []numbers,int left,int right){
        if (left>=right){
            return;
        }

        int mid = partition(numbers,left,right);

        quickSort(numbers,left,mid-1);
        quickSort(numbers,mid+1,right);
    }

    public static int partition(int []array,int left,int right){
        int temp = array[left];
        while (left<right){

            //找到temp+array[right] 比 array[right]+temp大的位置
            while ((temp+""+array[right]).compareTo(array[right]+""+temp)<=0 && left<right){
                right --;
            }
            if (left<right){
                array[left] = array[right];
                left++;
            }

            while ((array[left]+""+temp).compareTo(temp+""+array[left])<=0 && left<right){
                left ++;
            }
            if (left<right){
                array[right] = array[left];
                right--;
            }
        }
        array[left] = temp;
        return left;
    }





//    public static String PrintMinNumber(int [] numbers) {
//
//        if (numbers.length==0){
//            return "";
//        }
//        ArrayList<String>arrayList = new ArrayList<String>();
//        fun(numbers,0,arrayList);
//
//        String res = arrayList.get(0);
//        for (int i = 1; i < arrayList.size(); i++) {
//            if (res.compareTo(arrayList.get(i))>0){
//                res = arrayList.get(i);
//            }
//        }
//
//        return res;
//    }
//
//    public static void fun(int []numbers,int k,ArrayList<String>arrayList){
//        if (k==numbers.length -1){
//            StringBuffer sb = new StringBuffer();
//            for (int i = 0; i < numbers.length; i++) {
//                sb.append(numbers[i]);
//            }
//            arrayList.add(sb.toString());
//            return;
//        }
//
//        for (int i = k; i < numbers.length; i++) {
//            swap(numbers,k,i);
//            fun(numbers,k+1,arrayList);
//            swap(numbers,k,i);
//        }
//
//    }
//
//    public static void swap(int []numbers,int i,int j){
//        int temp = numbers[i];
//        numbers[i] = numbers[j];
//        numbers[j] = temp;
//    }


}
