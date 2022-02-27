package com.gj.exercise_9;

import java.util.Stack;

public class Exercise_66 {
    public int longestValidParentheses (String s) {
        if (s==null || s.length()==0) return 0;
        int last=-1;
        int maxlen = 0;
        Stack<Integer>stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='('){
                stack.push(i);
            }else {
                if (stack.isEmpty()){
                    last = i;
                }else {
                    stack.pop();
                    if (stack.isEmpty()){
                        maxlen = Math.max(maxlen,i-last);
                    }else {
                        maxlen = Math.max(maxlen,i-stack.peek());
                    }
                }
            }
        }
        return maxlen;
    }
}
