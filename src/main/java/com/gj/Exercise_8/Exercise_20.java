package com.gj.Exercise_8;

public class Exercise_20 {
    public ListNode sortInList (ListNode head) {
        // write code here
        if (head==null) return head;
        return mergeSort(head);
    }

    public ListNode mergeSort(ListNode head){
        if (head==null || head.next==null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }
        pre.next = null;
        head = mergeSort(head);
        slow = mergeSort(slow);
        return merge(head,slow);
    }

    public ListNode merge(ListNode head1,ListNode head2){
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
        p.next = (head1==null)?head2:head1;
        return phead.next;
    }

}
