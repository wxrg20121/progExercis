package com.gj2.exercise_1;

public class Exercise_4 {
    public String longestCommonPrefix (String[] strs) {
        // write code here
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i==strs[j].length() || strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return "";
    }
}
