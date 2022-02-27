package com.gj.exercise_9.exercise_12;

import java.util.Stack;

public class Exercise_18 {
    public boolean isValid (String s) {
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
