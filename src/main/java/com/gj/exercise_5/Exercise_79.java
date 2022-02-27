package com.gj.exercise_5;

public class Exercise_79 {
    public boolean match (String str, String pattern) {
        // write code here

        if (pattern.length()==0){
            return str.length()==0;
        }
        //一对一匹配 或 .
        boolean match = (str.length()>0 &&(str.charAt(0)==pattern.charAt(0)||pattern.charAt(0)=='.'));

        //有*
        if (pattern.length()>1 && pattern.charAt(1)=='*'){
            //0个或多个
            return match(str,pattern.substring(2)) || (match&&match(str.substring(1),pattern));
        }
        //无*
        else {
            return match && match(str.substring(1),pattern.substring(1));
        }

    }

}
