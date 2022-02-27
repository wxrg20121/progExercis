package com.gj.exercise_2;

/**
 *
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 *
 */

public class Exercise_34 {
    public static void main(String[] args) {
        int []array = new int['Z'];
        System.out.println(FirstNotRepeatingChar("NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp"));
    }
    public static int FirstNotRepeatingChar(String str) {
        if (str.length()==0){
            return -1;
        }
        int []array = new int['z'];

        char [] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            array[strArr[i]-1] += 1;
        }


        for (int i = 0; i < strArr.length; i++) {
            if (array[strArr[i]-1]==1){
                return i;
            }
        }

        return -1;
    }
}
