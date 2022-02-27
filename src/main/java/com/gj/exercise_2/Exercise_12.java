package com.gj.exercise_2;

/**
 *
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 *
 */

public class Exercise_12 {
    public double Power(double base, int exponent) {
        if (exponent==0){
            return 1;
        }else if (exponent>0){
            return base * Power(base,exponent-1);
        }else{
            return Power(base,exponent+1)/base;
        }
    }
}
