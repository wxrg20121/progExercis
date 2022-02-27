package com.gj.Exercise_7;

public class Exercise_29 {
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

        int[]res = new int[maxlen];
        res[--maxlen] = arr[index];
        for (int i = index-1; i >=0 ; i--) {
            if (arr[i]<arr[index] && dp[i]==dp[index]-1){
                res[--maxlen] = arr[i];
                index = i;
            }
        }
        return res;

    }

    public int[] getdp(int []arr){
        int[] dp = new int[arr.length];
        int[] ends = new int[arr.length];
        dp[0] = 1;
        ends[0] = arr[0];
        int right = 0;
        for (int i = 1; i < arr.length; i++) {
            int l = 0;
            int r = right;
            while (l<=r){
                int mid = (l+r)/2;
                if (arr[i]>ends[mid]){
                    l = mid+1;
                }else {
                    r = mid-1;
                }
            }
            right = Math.max(right,l);
            ends[l] = arr[i];
            dp[i] = l+1;
        }
        return dp;
    }

}
