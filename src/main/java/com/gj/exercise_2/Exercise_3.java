package com.gj.exercise_2;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * 输入：
 * {67,0,24,58}
 * 输出
 *  [58,24,0,67]
 */


class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}

public class Exercise_3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (listNode==null) return arrayList;
        Stack<Integer> stack = new Stack<>();

        while (listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }

        return arrayList;
    }

}
