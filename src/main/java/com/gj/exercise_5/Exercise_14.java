package com.gj.exercise_5;

public class Exercise_14 {
    public String solve (String s, String t) {
        // write code here
        if (s==null||"".equals(s)){
            return t;
        }
        if (t==null||"".equals(t)){
            return s;
        }
        int i = s.length()-1;
        int j = t.length()-1;
        int m1=0,m2=0,carray=0;
        StringBuffer sb = new StringBuffer();
        while (i>=0 || j>=0){
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
            int sum = m1+m2+carray;
            carray = sum/10;
            sb.append((char)((sum%10) + '0'));
            i--;
            j--;
        }
        if (carray!=0) sb.append('1');
        sb.reverse();
        return sb.toString();

    }
}
