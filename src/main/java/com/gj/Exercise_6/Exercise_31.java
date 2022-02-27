package com.gj.Exercise_6;

public class Exercise_31 {
    public ListNode sortInList (ListNode head) {
        // write code here
        if (head==null || head.next==null)return head;
        return mergeSort(head);

    }
    public ListNode mergeSort(ListNode head){
        if (head.next==null) return head;
        ListNode fast = head,slow = head,pre = null;

        while (fast!=null && fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(slow);
        return merge(left,right);
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
