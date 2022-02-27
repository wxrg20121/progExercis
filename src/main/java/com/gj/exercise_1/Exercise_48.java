package com.gj.exercise_1;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 *
 */
public class Exercise_48 {

    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        System.out.println(a^b);
        System.out.println((a&b)<<1);
    }

    public int Add(int num1,int num2) {
        while (num2!=0){
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }

}
