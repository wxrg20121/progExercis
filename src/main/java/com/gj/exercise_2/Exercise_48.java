package com.gj.exercise_2;

/**
 *
 *
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */

public class Exercise_48 {
    public int Add(int num1,int num2) {
        while (num2!=0){
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;


    }
}
