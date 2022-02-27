package com.gj.exercise_3;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 */

class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val=val;
    }
}

public class Exercise_3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer>stack = new Stack<>();
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (listNode==null)return arrayList;
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
