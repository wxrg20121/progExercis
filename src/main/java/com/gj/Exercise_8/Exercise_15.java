package com.gj.Exercise_8;

public class Exercise_15 {
    public int[] LIS (int[] arr) {
        // write code here
        int[] dp = getdp(arr);
        int maxlen = 0;
        int index = 0;
        for (int i = 0; i < dp.length; i++) {
            if (maxlen<=dp[i]){
                maxlen = dp[i];
                index = i;
            }
        }
        int[] res = new int[maxlen];
        res[--maxlen] = arr[index];
        for (int i = index-1; i >=0 ; i--) {
            if (arr[i]<arr[index] && dp[index]==dp[i]+1){
                res[--maxlen] = arr[i];
                index = i;
            }
        }
        return res;
    }

    public int[] getdp(int[] arr){
        int[]dp = new int[arr.length];
        int[]end = new int[arr.length];
        int right = 0;
        dp[0]=1;
        end[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            int l = 0;
            int r = right;
            while (l<=r){
                int mid = (l+r)/2;
                if (end[mid]<arr[i]){
                    l = mid+1;
                }else {
                    r = mid-1;
                }
            }
            right = Math.max(l,right);
            end[l] = arr[i];
            dp[i] = l+1;
        }
        return dp;
    }
}
