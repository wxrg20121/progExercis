package com.gj.exercise_2;

/**
 *
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），
 * 每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？例如，
 * 当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 */

public class Exercise_66 {
//    public int cutRope(int target) {
//        if (target==2){
//            return 1;
//        }
//        if (target==3){
//            return 2;
//        }
//        if (target%3==0){
//            return (int)Math.pow(3,target/3);
//        }else if (target%3==1){
//            return (int)Math.pow(3,target/3-1)*4;
//        }else {
//            return (int)Math.pow(3,target/3)*2;
//        }
//
//    }

    public int cutRope(int target) {
        int dp[] = new int[target+1];

        dp[1]=1;
        for (int i = 1; i < target; i++) {
            dp[i] = i;
            for (int j = 1; j < i; j++) {
              dp[i] = Math.max(dp[i],dp[j]*dp[i-j]);
            }
        }
        return dp[target];




    }


}
