package com.gj.Exercise_7;

public class Exercise_39 {
    public boolean judge (String str) {
        // write code here
        if (str==null || str.length()==0) return false;
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
