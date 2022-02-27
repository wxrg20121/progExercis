package com.gj.Exercise_7;

import java.util.Stack;

public class Exercise_17 {
    public boolean isValid (String s) {
        // write code here
        char[] c = s.toCharArray();
        Stack<Character>stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i]=='('){
                stack.push(')');
            }else if (c[i]=='{'){
                stack.push('}');
            }else if (c[i]=='['){
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop()!=c[i]){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
