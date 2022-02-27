package com.gj.exercise_2;
/**
 *
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 *
 */
public class Exercise_7 {
    public int Fibonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int preNum = 1;
        int prePreNum = 0;
        int reslut = 0;
        for (int i = 2; i <= n; i++) {
            reslut = prePreNum + preNum;
            prePreNum = preNum;
            preNum = reslut;
        }
        return reslut;
    }
}
