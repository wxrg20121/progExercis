package com.gj.exercise_5;

public class Exercise_63 {
    public String trans(String s, int n) {
        // write code here
        String res = "";
        String tempStr = "";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c>='a' && c<='z'){
                tempStr += Character.toUpperCase(c);
            }else if (c>='A' && c<='Z'){
                tempStr += Character.toLowerCase(c);
            }else {
                tempStr = c + tempStr;
                res = tempStr + res;
                tempStr = "";
            }
        }
        res = tempStr+res;
        return res;
    }
}
