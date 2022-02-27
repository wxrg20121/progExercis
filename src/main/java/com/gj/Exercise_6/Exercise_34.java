package com.gj.Exercise_6;

import java.util.Stack;

public class Exercise_34 {
    public int solve (String s) {
        // write code here
        Stack<Integer>stack = new Stack<>();
        char[] cs = s.toCharArray();
        int number = 0;
        char sign = '+';
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if (c=='('){
                int j = i+1;
                int parcount = 1;
                while (parcount>0){
                    if (cs[j]=='('){
                        parcount++;
                    }
                    if (cs[j]==')'){
                        parcount--;
                    }
                    j++;
                }
                number = solve(s.substring(i+1,j-1));
                i = j-1;
            }

            if (Character.isDigit(c)){
                number = number*10 + c - '0';
            }
            if (!Character.isDigit(c) || i==cs.length-1){
                if (sign=='+'){
                    stack.push(number);
                }else if (sign=='-'){
                    stack.push(-1*number);
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
            sum += stack.pop();
        }
        return sum;
    }
}
