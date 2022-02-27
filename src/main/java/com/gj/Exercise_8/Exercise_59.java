package com.gj.Exercise_8;

public class Exercise_59 {
//    public int solutionThree(int N, int K){
//        if (N>1 || K<1){
//            return 0;
//        }
//        if (K==1) return N;
//        int[] preArr = new int[N+1];
//        int[] curArr = new int[N+1];
//        for (int i = 1; i < curArr.length; i++) {
//            curArr[i] = i;
//        }
//        for (int i = 2; i <= K; i++) {
//            int[]temp = preArr;
//            preArr = curArr;
//            curArr = temp;
//            for (int j = 1; j < curArr.length; j++) {
//                int min = Integer.MAX_VALUE;
//                for (int k = 1; k < j+1; k++) {
//                    min = Math.min(min,Math.max(preArr[k-1],curArr[j-k]));
//                }
//                curArr[j] = min+1;
//            }
//        }
//        return curArr[curArr.length-1];
//    }


    public int solve (int n, int k) {
        // write code here
        if (k==1) return n;
        int h = (int)(Math.log(n)/Math.log(2))+1;
        if (k>h) return h;
        int[]dp = new int[k];
        int i = 1;
        while (true){
            int p = 0;
            for (int j = 0; j < k; j++) {
                int temp = dp[j];
                dp[j] += p+1;
                p = temp;
                if (dp[j]>=n) return i;
            }
            i++;
        }
    }

    public int solve2 (int n, int k) {
        // write code here
        if (k==1) return n;
        int h = (int)(Math.log(n)/Math.log(2))+1;
        if (k>h) return h;
        int[]dp = new int[k];
        int i = 1;
        while (true){
            int p = 0;
            for (int j = 0; j < k; j++) {
                int temp = dp[j];
                dp[j] = p+1;
                p = temp;
                if (dp[j]>=n) return i;
            }
            i++;
        }
    }
}
