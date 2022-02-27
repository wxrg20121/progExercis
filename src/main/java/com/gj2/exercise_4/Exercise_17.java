package com.gj2.exercise_4;

public class Exercise_17 {
    public String minWindow (String S, String T) {
        // write code here
        if (S.length()<T.length()) return "";
        char[] sArr = S.toCharArray();
        char[] tArr = T.toCharArray();
        int[] hash = new int[256];
        for (int i = 0; i < tArr.length; i++) {
            hash[tArr[i]]++;
        }
        int l=0,count=tArr.length,max=sArr.length;
        String res = "";
        for (int r = 0; r < sArr.length; r++) {
            hash[sArr[r]]--;
            if (hash[sArr[r]]>=0){
                count--;
            }
            while (l<r && hash[sArr[l]]<0){
                hash[sArr[l]]++;
                l++;
            }
            if (count==0 && max>r-l+1){
                max = r-l+1;
                res = S.substring(l,r+1);
            }
        }
        return res;
    }
}
