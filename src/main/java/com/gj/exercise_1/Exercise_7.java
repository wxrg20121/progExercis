package com.gj.exercise_1;

/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n≤39
 *
 * f(n) = f(n-1) + f(n-2)
 */
public class Exercise_7 {

    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }

    public static int Fibonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
