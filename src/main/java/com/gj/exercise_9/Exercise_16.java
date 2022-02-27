package com.gj.exercise_9;

public class Exercise_16 {
    public String solve (String s, String t) {
        // write code here
        int i=s.length()-1;
        int j=t.length()-1;
        int carray=0;
        StringBuffer sb = new StringBuffer();
        while (i>=0 || j>=0 || carray!=0){
            if (i>=0){
                carray+=s.charAt(i)-'0';
            }
            if (j>=0){
                carray+=t.charAt(j)-'0';
            }
            sb.append((char)(carray%10+'0'));
            carray/=10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
