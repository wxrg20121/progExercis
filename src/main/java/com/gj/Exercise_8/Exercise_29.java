package com.gj.Exercise_8;

public class Exercise_29 {
    public int atoi (String str) {
        // write code here
        if (str==null||str.length()==0) return 0;
        int res = 0;
        str = str.trim();
        int i = 0;
        boolean flag = true;
        if (str.charAt(0)=='-'){
            flag=false;
            i++;
        }
        if (str.charAt(0)=='+'){
            i++;
        }
        for (; i < str.length(); i++) {
            if (str.charAt(i)>'9' || str.charAt(i)<'0') break;
            if (res>Integer.MAX_VALUE/10 ||(res==Integer.MAX_VALUE&&str.charAt(i)=='7')){
                return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res = res*10 + str.charAt(i)-'0';
        }
        return flag?res:-1*res;
    }
}
