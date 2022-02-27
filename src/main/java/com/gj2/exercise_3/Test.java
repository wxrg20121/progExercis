package com.gj2.exercise_3;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(test(str));
    }

    public static boolean test(String str){
        Stack<Character>stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c=='('){
                stack.push(')');
            } else if (c=='[') {
                stack.push(']');
            }else if (c=='{'){
                stack.push('}');
            }else {
                if (stack.isEmpty() || stack.pop()!=c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}
