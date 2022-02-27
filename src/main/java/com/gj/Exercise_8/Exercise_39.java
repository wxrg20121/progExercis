package com.gj.Exercise_8;

public class Exercise_39 {
    public String trans(String s, int n) {
        // write code here
        if (s==null || s.length()==0) return "";
        String res = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>='a' && c<='z'){
                temp+=Character.toUpperCase(c);
            }else if (c>='A'&&c<='Z'){
                temp+=Character.toLowerCase(c);
            }else {
                temp = c + temp;
                res = temp+res;
                temp = "";
            }
        }
        res = temp+res;
        return res;
    }
}
