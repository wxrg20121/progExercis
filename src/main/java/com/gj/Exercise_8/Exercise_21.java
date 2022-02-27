package com.gj.Exercise_8;

import java.util.Stack;

public class Exercise_21 {
    public int solve (String s) {
        // write code here
        if (s==null||s.length()==0) return 0;
        char sign = '+';
        int number = 0;
        int res = 0;
        Stack<Integer>stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='('){
                int j = i+1;
                int parcount = 1;
                while (parcount>0){
                    if (s.charAt(j)=='('){
                        parcount++;
                    }
                    if (s.charAt(j)==')'){
                        parcount--;
                    }
                    j++;
                }
                number = solve(s.substring(i+1,j-1));
                i = j-1;
            }
            if (Character.isDigit(c)){
                number = number*10 + c-'0';
            }
            if (!Character.isDigit(c) || i==s.length()-1) {
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
        while (!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }
}
