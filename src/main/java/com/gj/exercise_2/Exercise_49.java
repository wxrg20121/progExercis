package com.gj.exercise_2;

/**
 *
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 *
 */

public class Exercise_49 {
    public int StrToInt(String str) {
        if (str.length()==0){
            return 0;
        }
        int i = 0;
        char []charlist = str.toCharArray();
        if (charlist[0]=='-' || charlist[0]=='+'){
            i++;
        }
        int sum = 0;
        for (; i < charlist.length; i++) {
            if (charlist[i]>'9' || charlist[i]<'0'){
                return 0;
            }
            sum = sum*10 + (charlist[i]-'0');
        }

        if (charlist[0]=='-'){
            sum*=-1;
        }
        return sum;

    }
}
