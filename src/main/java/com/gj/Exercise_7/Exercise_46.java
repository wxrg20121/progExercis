package com.gj.Exercise_7;

public class Exercise_46 {
    public String solve (int M, int N) {
        // write code here
        if (M==0){
            return M+"";
        }
        boolean flag = true;
        if (M<0){
            M = M * -1;
            flag = false;
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
