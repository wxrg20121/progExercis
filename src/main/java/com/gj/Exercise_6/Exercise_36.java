package com.gj.Exercise_6;

public class Exercise_36 {
    public String solve (int M, int N) {
        // write code here
        if (M==0){
            return M+"";
        }
        boolean flag = true;
        if (M<0){
            M = -1*M;
            flag=false;
        }

        String hex = "0123456789ABCDEF";
        StringBuffer sb = new StringBuffer();
        while (M!=0){
            sb.append(hex.charAt(M%N));
            M/=N;
        }
        return flag?sb.reverse().toString():"-"+sb.reverse().toString();

    }
}
