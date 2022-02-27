package com.gj.exercise_9.exercise_12;

public class Exercise_79 {
    public String solve (String s, String t) {
        int[] num1 = new int[s.length()];
        int[] num2 = new int[t.length()];
        int[] res = new int[num1.length+num2.length];
        for (int i = 0; i < num1.length; i++) {
            num1[i]= s.charAt(i) - '0';
        }
        for (int i = 0; i < num2.length; i++) {
            num2[i] = t.charAt(i) - '0';
        }
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                res[i+j] += num1[i] * num2[j];
            }
        }
        for (int i = res.length-1; i >0 ; i--) {
            res[i-1] += res[i]/10;
            res[i] %= 10;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < res.length-1; i++) {
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
