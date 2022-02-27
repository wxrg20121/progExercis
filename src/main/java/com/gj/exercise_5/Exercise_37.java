package com.gj.exercise_5;

public class Exercise_37 {
    public String solve (int M, int N) {
        // write code here
        if (M==0){
            return M+"";
        }
        boolean flag = true;
        if (M<0){
            M = -1 * M;
            flag = false;
        }
        StringBuffer sb = new StringBuffer();
        String hex = "0123456789ABCDEF";
        while (M!=0){
            sb.append(hex.charAt(M%N));
            M /= N;
        }
        return flag ? sb.reverse().toString() : "-" + sb.reverse().toString();


    }
}
