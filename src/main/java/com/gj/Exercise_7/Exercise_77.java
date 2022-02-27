package com.gj.Exercise_7;

public class Exercise_77 {
    public String trans(String s, int n) {
        // write code here
        if (s==null||s.length()==0) return "";
        String res = "";
        String tempstr = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>='a' && c<='z'){
                tempstr += Character.toUpperCase(c);
            }else if (c>='A' && c<='Z'){
                tempstr += Character.toLowerCase(c);
            }else {
                tempstr = c + tempstr;
                res = tempstr + res;
                tempstr = "";
            }
        }
        res = tempstr + res;
        return res;
    }
}
