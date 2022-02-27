package com.gj.exercise_1;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Exercise_20 {

    Stack<Integer>data = new Stack<Integer>();
    Stack<Integer>min = new Stack<Integer>();
    Integer temp = null;
    public void push(int node) {
        if (temp!=null) {
            if (node<=temp) {
                min.push(node);
                temp = node;
            }
            data.push(node);
        }else {
            temp = node;
            data.push(node);
            min.push(node);
        }
    }

    public void pop() {
        int emt1 = data.pop();
        int emt2 = min.pop();
        if (emt1!=emt2) {
            min.push(emt2);
        }
    }
    public int top() {
        int emt = data.pop();
        data.push(emt);
        return emt;
    }
    public int min() {
        int result = min.peek();
        return result;
    }
}
