package com.gj.Exercise_7;

public class Exercise_92 {
    public boolean match (String str, String pattern) {
        if (pattern.length()==0) return str.length()==0;
        boolean match = (str.length()>0 && (str.charAt(0)==pattern.charAt(0) || pattern.charAt(0)=='.'));

        //有*的时候
        if (pattern.length()>1 && pattern.charAt(1)=='*'){
            //匹配0个或多个
            return match(str,pattern.substring(2)) || (match&&match(str.substring(1),pattern));
        }//无*
        else {
            return match&&match(str.substring(1),pattern.substring(1));
        }

    }
}
