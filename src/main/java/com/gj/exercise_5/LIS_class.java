package com.gj.exercise_5;

import java.util.Arrays;

/**
 *
 *
 */

public class LIS_class {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,8,6,4};
        int []dp = getdp2(arr);
        int []res = getLIS(arr,dp);
        System.out.println(Arrays.toString(res));
    }

    public static int[] getdp(int []arr){
        int[] dp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dp[i]=1;
            for (int j = 0; j < i; j++) {
                if (arr[i]>arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp;
    }

    public static int[] getLIS(int[] arr,int[] dp){
        int maxlen = 0;
        int index = 0;
        for (int i = 0; i < dp.length; i++) {
            if (maxlen<=dp[i]){
                maxlen=dp[i];
                index=i;
            }
        }
        int[] res = new int[maxlen];
        res[--maxlen] = arr[index];
        for (int i = index-1; i >=0; i--) {
            if (arr[i]<arr[index] && dp[i]==dp[index]-1){
                res[--maxlen] = arr[i];
                index = i;
            }
        }
        return res;
    }

    public static int[]getdp2(int[] arr){
        int[] dp = new int[arr.length];
        int[] end = new int[arr.length];
        dp[0] = 1;
        end[0] = arr[0];
        int right = 0;
        int maxlen = 0;
        for(int i=1;i<arr.length;i++){
            int l=0;
            int r = right;
            int mid;
            while(l<=r){
                mid = (l+r)/2;
                if(arr[i]>end[mid]){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
            right = Math.max(right,l);
            end[l] = arr[i];
            dp[i] = l+1;
            maxlen = Math.max(maxlen,dp[i]);
        }
        return dp;
    }
}
