package com.gj.exercise_5;

import java.util.Stack;

public class Exercise_35 {
    public int solve (String s) {
        // write code here
        Stack<Integer>stack = new Stack<>();
        int number = 0;
        char[]arr = s.toCharArray();
        int sign = '+';
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c=='('){
                int j = i+1;
                int countPar = 1;
                while (countPar>0){
                    if (arr[j]=='('){
                        countPar++;
                    }
                    if (arr[j]==')'){
                        countPar--;
                    }
                    j++;
                }
                number = solve(s.substring(i+1,j-1));
                i = j-1;
            }

            if (Character.isDigit(c)){
                number = number*10 + c - '0';
            }

            if (!Character.isDigit(c) || i==arr.length-1){
                if (sign == '+'){
                    stack.push(number);
                }else if (sign == '-'){
                    stack.push(-1 * number);
                }else if (sign == '*'){
                    stack.push(stack.pop()*number);
                }else if (sign == '/'){
                    stack.push(stack.pop()/number);
                }
                number = 0;
                sign = c;
            }

        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }



    public int solve2 (String s) {
        Stack<Integer>stack = new Stack<>();
        int number = 0;
        int sign = '+';
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c=='('){
                int j=i+1;
                int countPar = 1;
                while (countPar>0){
                    if (arr[j]=='(')
                        countPar++;
                    if (arr[j]==')')
                        countPar--;
                    j++;
                }
                number = solve(s.substring(i+1,j-1));
                i = j-1;
            }

            if (Character.isDigit(c)){
                number = number * 10 + c - '0';
            }
            if (!Character.isDigit(c) || i==arr.length-1){
                if (sign=='+'){
                    stack.push(number);
                }else if (sign=='-'){
                    stack.push(-1 * number);
                }else if (sign=='*'){
                    stack.push(stack.pop()*number);
                }else if (sign=='/'){
                    stack.push(stack.pop()/number);
                }
                number = 0;
                sign = c;
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;

    }
}
