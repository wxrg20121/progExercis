package com.gj.exercise_2;

/**
 *
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */

public class Exercise_52 {
    public boolean match (String str, String pattern) {
        // write code here
        if (str.length()==0 && pattern.length()==0){
            return true;
        }

        char []pattenchar = pattern.toCharArray();
        char []strchar = str.toCharArray();

        return isMatch(strchar,pattenchar,0,0);
    }
    public boolean isMatch(char []str, char []pattern, int strIndex, int patternIndex){

        if (strIndex>=str.length && patternIndex>=pattern.length){
            return true;
        }


        if (strIndex<str.length && patternIndex>=pattern.length) return false;

        if (patternIndex<pattern.length-1){
            if (pattern[patternIndex+1]=='*'){
                if (strIndex>=str.length) return isMatch(str,pattern,strIndex,patternIndex+2);

                if ((strIndex<str.length)&&(str[strIndex]==pattern[patternIndex]||pattern[patternIndex]=='.')){
                    //
                    return
                            // 第一种，模式上移动两个字符，相当于忽略‘*’和它前面的字符
                             isMatch(str,pattern,strIndex,patternIndex+2)
                                     //// 第二种，当前字符匹配成功，模式上移动两个字符
                            || isMatch(str,pattern,strIndex+1,patternIndex+2)
                                     // 第三种，当前字符匹配成功，模式上保持不变
                            || isMatch(str,pattern,strIndex+1,patternIndex);
                }else {
                    // 忽略'*'和它前面的字符
                    return isMatch(str,pattern,strIndex,patternIndex+2);
                }
            }
        }
        // 下一位不是‘*’，则只要匹配'.'，匹配成功后，同时移动一个字符
        if (str[strIndex]==pattern[patternIndex] || pattern[patternIndex]=='.'){
            return isMatch(str,pattern,strIndex+1,patternIndex+1);
        }

        return false;
    }

}
