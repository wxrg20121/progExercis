package com.gj.Exercise_8;

public class Exercise_56 {
    public int kmp (String S, String T) {
        // write code here
        char[] tArr = T.toCharArray();
        char[] sArr = S.toCharArray();
        int[] hash = new int[256];
        for (int i = 0; i < sArr.length; i++) {
            hash[sArr[i]]++;
        }
        int res = 0;
        int l=0,count=0,slen = sArr.length;
        for (int r = 0; r < tArr.length; r++) {
            hash[tArr[r]]--;
            if (hash[tArr[r]]>=0){
                count++;
            }
            if (r-l+1>slen){
                hash[tArr[l]]++;
                if (hash[tArr[l]]>0){
                    count--;
                }
                l++;
            }
            if (count==slen && T.substring(l,r+1).equals(S)){
                res++;
            }
        }
        return res;
    }
}
