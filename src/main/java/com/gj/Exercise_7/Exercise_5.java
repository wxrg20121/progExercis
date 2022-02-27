package com.gj.Exercise_7;

import java.util.ArrayList;

public class Exercise_5 {

    public static void main(String[] args) {
        int[]arr = {1332802,1177178,1514891,871248,753214,123866,1615405,328656,1540395,968891,1884022,252932,1034406,1455178,821713,486232,860175,1896237,852300,566715,1285209,1845742,883142,259266,520911,1844960,218188,1528217,332380,261485,1111670,16920,1249664,1199799,1959818,1546744,1904944,51047,1176397,190970,48715,349690,673887,1648782,1010556,1165786,937247,986578,798663};
        System.out.println(findKth(arr,49,24));
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (input.length==0 || k<0 || k>input.length) return arrayList;
        int mid = partition(input,0,input.length-1);
        while (mid!=k-1){
            if (mid<k-1){
                mid = partition(input,mid+1,input.length-1);
            }else {
                mid = partition(input,0,mid);
            }
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }


    public static int findKth(int[] a, int n, int K) {
        // write code here
        if (a.length==0 || K<0 || K>a.length) return -1;
        int mid = partition(a,0,a.length-1);
        K = a.length-K;
        while (mid!=K){
            if (mid<K){
                mid = partition(a,mid+1,a.length-1);
            }else {
                mid = partition(a,0,mid);
            }
        }
        return a[K];
    }

    public static int partition(int[] arr,int left, int right){
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
