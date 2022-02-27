package com.gj.exercise_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * 题目描述
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 *
 * 输入 "123.45e+6"
 * 输出 true
 *
 * 输入 "1.2.3"
 * 输出 false
 */
public class Exercise_53 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param str string字符串
     * @return bool布尔型
     */
    public boolean isNumeric (String str) {
        // write code here
        Pattern pattern = Pattern.compile("^[+|-]?\\d*(\\.?\\\\d+|)([e|E][+|-]?\\d+|)$");
        Matcher matcher = pattern.matcher(str);
        return matcher!=null;
    }
}
