package com.gj.exercise_1;

/**
 *
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */

public class Exercise_56 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead==null){
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode pre = head;
        head.next = pHead;
        ListNode node = head.next;
        while (node!=null){
            if (node!=null && node.next!=null && node.val==node.next.val){
                while (node!=null && node.next!=null && node.val==node.next.val){
                    node = node.next;
                }
                pre.next = node.next;
                node = node.next;
            }else {
                pre = pre.next;
                node = node.next;
            }
        }

        return head.next;
    }

}
