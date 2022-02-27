package com.gj.Exercise_7;

public class Exercise_57 {
    public int atoi (String str) {
        // write code here
        char[] c = str.trim().toCharArray();
        if (c==null || c.length==0) return 0;
        int i = 0;
        if (c[0]=='+'||c[0]=='-') i++;
        int sum = 0;
        for (; i < c.length; i++) {
            if (c[i]>'9' || c[i]<'0'){
                break;
            }
            if (sum>Integer.MAX_VALUE/10 || (sum==Integer.MAX_VALUE && c[i]=='7')){
                if (c[0]=='-') return Integer.MIN_VALUE;
                else return Integer.MAX_VALUE;
            }
            sum = sum*10 + c[i] - '0';
        }
        return c[0]=='-'?-1*sum:sum;

    }
}
