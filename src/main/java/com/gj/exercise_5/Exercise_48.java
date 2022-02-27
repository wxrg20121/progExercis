package com.gj.exercise_5;

public class Exercise_48 {
    public int atoi (String str) {
        // write code here
        if (str.length()==0) return 0;
        int sum = 0;
        char[] chars = str.trim().toCharArray();
        int i = 0;
        if (chars[0]=='-' || chars[0]=='+'){
            i++;
        }
        for (; i < chars.length; i++) {
            if (chars[i]>'9' || chars[i]<'0'){
                break;
            }

            if(sum>Integer.MAX_VALUE/10 || (sum==Integer.MAX_VALUE/10 && chars[i]-'7'>0)){

                if (chars[0]=='-'){
                    return Integer.MIN_VALUE;
                }else {
                    return Integer.MAX_VALUE;
                }
            }

                sum = sum * 10 + (chars[i]-'0');
        }
        if (chars[0]=='-'){
            sum = -1 * sum;
        }
        return sum;
    }
}
