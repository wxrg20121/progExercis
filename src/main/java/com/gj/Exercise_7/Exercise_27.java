package com.gj.Exercise_7;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_27 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        if (num.length<3) return arrayList_all;
        Arrays.sort(num);
        for (int i = 0; i < num.length-2; i++) {
            if (i!=0 && num[i]==num[i-1]) continue;
            int left = i+1;
            int right = num.length-1;
            while (left<right){
                int sum = num[left] + num[right];
                if (sum+num[i]==0){
                    ArrayList<Integer>arrayList = new ArrayList<>();
                    arrayList.add(num[i]);
                    arrayList.add(num[left]);
                    arrayList.add(num[right]);
                    arrayList_all.add(arrayList);
                    left++;
                    right--;
                    while (left<right && num[left]==num[left-1]){
                        left++;
                    }
                    while (left<right && num[right]==num[right+1]){
                        right--;
                    }

                }else if (sum+num[i]>0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return arrayList_all;
    }
}
