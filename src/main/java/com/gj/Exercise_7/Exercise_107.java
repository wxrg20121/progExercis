package com.gj.Exercise_7;

public class Exercise_107 {
    public int kmp (String S, String T) {
        // write code here
        if (T.length()<S.length()) return 0;
        char[] tArr = T.toCharArray();
        char[] sArr = S.toCharArray();
        int[] hash = new int[256];
        for (int i = 0; i < sArr.length; i++) {
            hash[sArr[i]]++;
        }
        int res = 0;
        int l=0,count=0,slen=sArr.length;
        for (int r = 0; r < tArr.length; r++) {
            hash[tArr[r]]--;
            if (hash[tArr[r]]>=0){
                count++;
            }
            if (r>slen-1){
                hash[sArr[l]]++;
                if (hash[sArr[l]]>0){
                    count--;
                }
                l++;
            }
            if (count== slen && T.substring(l,r+1).equals(S)){
                res++;
            }
        }
        return res;
    }
}
