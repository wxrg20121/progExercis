package com.gj.exercise_1;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 *
 * 题目保证输入的数组中没有的相同的数字
 *
 * 输入 [1,2,3,4,5,6,7,0]
 *
 * 输出 7
 */
public class Exercise_35 {

    public static int count = 0;


    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(arr));
    }

    public static int InversePairs(int [] array) {
        if (array.length==0){
            return 0;
        }

        mergeSort(array,0,array.length-1);

        return count;
    }

    public static void mergeSort(int []arr, int left, int right){
        if (left>=right){
            return;
        }

        int mid = (left + right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    public static void merge(int []arr,int left,int mid,int right){

        int []temp = new int[right - left + 1];

        int i = left;
        int j = mid+1;
        int k = 0;

        while (i<=mid && j<=right){
            if (arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
                count += mid-i+1;
                if (count>=1000000007){
                    count %= 1000000007;
                }
            }
        }

        while (i<=mid){
            temp[k++] = arr[i++];
        }

        while (j<=right){
            temp[k++] = arr[j++];
        }

        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[left+k2] = temp[k2];
        }
    }



}
