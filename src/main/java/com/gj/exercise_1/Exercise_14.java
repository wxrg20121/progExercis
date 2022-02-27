package com.gj.exercise_1;

/**
 *
 *题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 1,{1,2,3,4,5}
 *
 * {5}
 */




public class Exercise_14 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(67);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(24);
        ListNode listNode4 = new ListNode(54);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode = FindKthToTail(listNode1,1);
        System.out.println(listNode1.val);
    }

    public static ListNode FindKthToTail(ListNode head,int k) {
        if (head==null || k<=0){
            return head;
        }

        ListNode node1 = head;
        ListNode node2 = head;

        for (int i = 0; i < k; i++) {
            if (node1==null){
                return null;
            }
            node1 = node1.next;
        }

        while (node1!=null){
            node2 = node2.next;
            node1 = node1.next;
        }

        return node2;
    }





}
