package com.gj.exercise_9.exercise_12;

public class Exercise_106 {
    public int kmp (String S, String T) {
        // write code here
        if (T.length()<S.length()) return 0;
        char[] sArr = S.toCharArray();
        char[] tArr = T.toCharArray();
        int[] hash = new int[256];
        for (int i = 0; i < sArr.length; i++) {
            hash[sArr[i]]++;
        }
        int l=0,count= 0,slen=sArr.length;
        int res = 0;
        for (int r = 0; r < tArr.length; r++) {
            hash[tArr[r]]--;
            if (hash[tArr[r]]>=0){
                count++;
            }
            if (r-l>slen-1){
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
