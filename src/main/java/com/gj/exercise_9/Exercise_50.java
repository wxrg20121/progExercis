package com.gj.exercise_9;

public class Exercise_50 {
    public int atoi (String str) {
        if (str==null || str.length()==0) return 0;
        str = str.trim();
        boolean flag = true;
        int i = 0;
        if (str.charAt(0)=='-'){
            flag=false;
            i++;
        }
        if (str.charAt(0)=='+'){
            i++;
        }
        int res = 0;
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c>'9' || c<'0') break;
            if (res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE && c=='7')){
                return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res = res*10 + c-'0';
        }
        return flag?res:-1*res;

    }
}
