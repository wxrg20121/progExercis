package com.gj2.exercise_4;

public class Exercise_6 {
    public int[] LIS (int[] arr) {
        int[] dp = getdp(arr);
        int maxlen = 0;
        int index = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i]>maxlen){
                maxlen=dp[i];
                index=i;
            }
        }
        int[] res = new int[maxlen];
        res[--maxlen]=arr[index];
        for (int i = index-1; i >=0 ; i--) {
            if (arr[i]<arr[index] && dp[i]+1==dp[index]){
                res[--maxlen] = arr[i];
                index = i;
            }
        }
        return res;
    }

    public int[] getdp(int[] arr){
        int[] dp = new int[arr.length];
        int[] end = new int[arr.length];
        dp[0] = 1;
        end[0] = arr[0];
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            int l =0;
            int r = right;
            while (l<=r){
                int mid = (l+r)/2;
                if (end[mid]<arr[i]){
                    l = mid+1;
                }else {
                    r = mid-1;
                }
            }
            right = Math.max(right,l);
            dp[i] = l+1;
            end[l] = arr[i];
        }
        return dp;
    }
}
