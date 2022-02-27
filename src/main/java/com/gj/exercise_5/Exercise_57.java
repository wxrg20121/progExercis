package com.gj.exercise_5;

public class Exercise_57 {
    public String solve (String s, String t) {
        // write code here
        if (s.length()==0){
            return t;
        }
        if (t.length()==0){
            return s;
        }
        int i=s.length()-1;
        int j=t.length()-1;
        int m1=0, m2=0, carray=0;
        StringBuffer sb = new StringBuffer();
        while (i>=0||j>=0){
            if (i>=0){
                m1 = s.charAt(i)-'0';
            }else {
                m1 = 0;
            }
            if (j>=0){
                m2 = t.charAt(j)-'0';
            }else {
                m2 = 0;
            }
            carray = carray + m1 + m2;
            sb.append((char) (carray%10+'0'));
            carray/=10;
            i--;
            j--;
        }
        if (carray!=0){
            sb.append('1');
        }
        return sb.reverse().toString();

    }
}
