package com.gj.exercise_1;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Exercise_15 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(67);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(24);
        ListNode listNode4 = new ListNode(54);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode = reverse_2(listNode1);
        System.out.println(listNode.val);
    }

    public static ListNode reverse(ListNode hnode){
        if (hnode.next == null){
            return hnode;
        }
        ListNode node = reverse(hnode.next);
        hnode.next.next = hnode;
        hnode.next = null;

        return node;
    }

    public static ListNode reverse_2(ListNode head){
        if (head==null || head.next==null){
            return head;
        }

        ListNode pre = null;
        ListNode next = null;
        while (head.next != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        head.next = pre;
        return head;
    }

}
