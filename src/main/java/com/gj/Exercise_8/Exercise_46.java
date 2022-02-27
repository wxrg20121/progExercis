package com.gj.Exercise_8;

public class Exercise_46 {
    public String minWindow (String S, String T) {
        // write code here
        char[] sArr = S.toCharArray();
        char[] tArr = T.toCharArray();
        int[] hash = new int[256];
        for (int i = 0; i < tArr.length; i++) {
            hash[tArr[i]]++;
        }
        String res = "";
        int l=0,count=tArr.length,maxlen=sArr.length+1;
        for (int r = 0; r < sArr.length; r++) {
            hash[sArr[r]]--;
            if (hash[sArr[r]]>=0){
                count--;
            }
            while (l<r && hash[sArr[l]]<0){
                hash[sArr[l]]++;
                l++;
            }
            if (count==0 && maxlen>r-l+1){
                maxlen = r-l+1;
                res = S.substring(l,r+1);
            }
        }
        return res;

    }
}
