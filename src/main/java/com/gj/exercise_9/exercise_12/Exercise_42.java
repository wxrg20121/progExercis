package com.gj.exercise_9.exercise_12;

public class Exercise_42 {
    public ListNode sortInList (ListNode head) {
        // write code here
        return mergeSort(head);
    }

    public ListNode mergeSort(ListNode head){
        if (head==null || head.next==null) return head;
        ListNode fast = head,slow = head;
        ListNode p = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            p = slow;
            slow = slow.next;
        }
        p.next = null;
        head = mergeSort(head);
        slow = mergeSort(slow);
        return merge(head,slow);
    }

    public ListNode merge(ListNode head1, ListNode head2){
        ListNode phead = new ListNode(0);
        ListNode p = phead;
        while (head1!=null && head2!=null){
            if (head1.val<head2.val){
                p.next = head1;
                head1 = head1.next;
            }else {
                p.next = head2;
                head2 = head2.next;
            }
            p = p.next;
        }
        p.next = (head1==null?head2:head1);
        return phead.next;
    }
}
