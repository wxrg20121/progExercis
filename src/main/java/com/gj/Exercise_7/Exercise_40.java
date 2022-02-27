package com.gj.Exercise_7;

public class Exercise_40 {
    public ListNode sortInList (ListNode head) {
        // write code here
        if (head==null) return head;
        return mergeSort(head);
    }

    public ListNode mergeSort(ListNode head){
        if (head==null || head.next==null) return head;
        ListNode fast = head,slow=head,pre=null;
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
        if (head1==null) return head2;
        if (head2==null) return head1;
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
