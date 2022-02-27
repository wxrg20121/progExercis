package com.gj.exercise_1;

/**
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 *输入
 * 2,3
 *返回值
 * 8.00000
 */

public class Exercise_12 {

    public static void main(String[] args) {
//        System.out.println(Power(2.0,5));
        System.out.println(4&1);
    }

    public static double Power(double base, int exponent) {

        if (exponent==0){
            return 1;
        }else if (exponent>0){
            return base * Power(base,exponent-1);
        }else{
            return Power(base,exponent+1) / base;
        }

    }
}
