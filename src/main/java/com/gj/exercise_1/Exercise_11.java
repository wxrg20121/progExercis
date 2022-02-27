package com.gj.exercise_1;

/**
 * 题目描述
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 * 输入
 * 10
 * 返回值
 * 2
 *
 */
public class Exercise_11 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(NumberOf1(5));
    }
    public static int NumberOf1(int n) {
        int count = 0;
        if (n==0){
            return count;
        }
        while (n!=0){
            count++;
            n = n&(n-1);
        }

        return count;
    }
}
