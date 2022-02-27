package com.gj.exercise_2;

/**
 *
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 输入 "We Are Happy"
 *
 * 输出 "We%20Are%20Happy"
 *
 */

public class Exercise_2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return string字符串
     */
    public String replaceSpace (String s) {
        // write code here
        StringBuffer stringBuffer = new StringBuffer();
        char [] chararr = s.toCharArray();
        for (int i = 0; i < chararr.length; i++) {
            if (chararr[i]==' '){
                stringBuffer.append('%');
                stringBuffer.append('2');
                stringBuffer.append('0');
            }else {
                stringBuffer.append(chararr[i]);
            }
        }

        return stringBuffer.toString();
    }
}
