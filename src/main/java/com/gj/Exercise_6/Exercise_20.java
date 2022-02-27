package com.gj.Exercise_6;

public class Exercise_20 {

    public int[] getLCS(int []arr){
        int[] dp = getdp2(arr);
        int maxlen = 0;
        int index = 0;
        for (int i = 0; i < dp.length ;i++) {
            if (maxlen<=dp[i]){
                maxlen = dp[i];
                index = i;
            }
        }
        int[] res = new int[maxlen];
        res[--maxlen] = arr[index];
        for (int i = index-1; i >=0 ; i--) {
            if (arr[i]<arr[index] && dp[i]==dp[index]-1){
                res[--maxlen] = arr[i];
                index = i;
            }
        }
        return res;
    }

    public int[] getdp1(int []arr){
        int[] dp = new int[arr.length];
        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]>arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp;
    }

    public int[] getdp2(int []arr){
        int []dp = new int[arr.length];
        int []end = new int[arr.length];
        dp[0] = 1;
        end[0] = arr[0];
        int right = 0;
        for (int i = 1; i < arr.length; i++) {
            int l = 0;
            int r = right;
            while (l<=r){
                int mid = (l+r)/2;
                if (arr[i]>end[mid]){
                    l = mid+1;
                }else {
                    r = mid-1;
                }
            }
            right = Math.max(l,right);
            dp[i] = l+1;
            end[l] = arr[i];
        }
        return dp;
    }

}
