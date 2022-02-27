package com.gj.exercise_1;

/**
 *
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 *
 * 输入 "aaa","a*a"
 * 输出 true
 *
 *
 *
 */
public class Exercise_52 {
    public boolean match(char[] str, char[] pattern)
    {
        if (str==null || pattern==null){
            return false;
        }

        return helMatch(str,0,pattern,0);
    }

    public boolean helMatch(char[] str, int strIndex, char[] patten, int pattenIndex){
        if (pattenIndex==patten.length && strIndex==str.length){
            return true;
        }

        if (strIndex != str.length && pattenIndex == patten.length){
            return false;
        }

        if (pattenIndex+1 < patten.length && patten[pattenIndex+1]=='*'){
            if ((strIndex != str.length && patten[pattenIndex]==str[strIndex]) || (strIndex != str.length && patten[pattenIndex]=='.')){
                return helMatch(str,strIndex,patten,pattenIndex+2) //模式后移2，视为x*匹配0个字符
                        || helMatch(str,strIndex+1,patten,pattenIndex+2) //视为模式匹配1个字符
                        || helMatch(str,strIndex+1,patten,pattenIndex); //*匹配1个，再匹配str中的下一个
            }else {
                return helMatch(str,strIndex,patten,pattenIndex+2);
            }
        }

        if ((strIndex != str.length && patten[pattenIndex]==str[strIndex]) || (strIndex != str.length && patten[pattenIndex]=='.')){
            return helMatch(str,strIndex+1,patten,pattenIndex+1);
        }

        return false;
    }

}

