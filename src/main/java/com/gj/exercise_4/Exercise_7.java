package com.gj.exercise_4;

import java.util.Stack;

/**
 *
 * 给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
 * 括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
 *
 */

public class Exercise_7 {
    public boolean isValid (String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if (c=='('){
                stack.push(')');
            }else if (c=='{'){
                stack.push('}');
            }else if (c=='['){
                stack.push(']');
            }else if (stack.isEmpty()||stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();

    }
}
