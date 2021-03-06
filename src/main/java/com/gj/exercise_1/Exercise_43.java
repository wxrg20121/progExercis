package com.gj.exercise_1;

/**
 *
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 *
 * 输入 "abcXYZdef",3
 *
 * 返回值 "XYZdefabc"
 *
 */
public class Exercise_43 {

    public static void main(String[] args) {
        String str = "abcXYZdef";
        System.out.println(LeftRotateString(str,4));
    }

    public static String LeftRotateString(String str,int n) {
        if (str.length()==0 || str.length()<n){
            return "";
        }

        StringBuffer stringBuffer = new StringBuffer();
        char [] strChar = str.toCharArray();
        for (int i = n; i < strChar.length; i++) {
            stringBuffer.append(strChar[i]);
        }
        for (int i = 0; i < n; i++) {
            stringBuffer.append(strChar[i]);
        }
        return stringBuffer.toString();
    }

}
