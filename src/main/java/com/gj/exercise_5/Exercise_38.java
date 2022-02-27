package com.gj.exercise_5;

public class Exercise_38 {

    public boolean isPail (ListNode head) {
        // write code here
        ListNode slow = head, fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode slow2 = reverse(slow);
        while (slow2!=null){
            if (head.val!=slow2.val){
                return false;
            }
            head = head.next;
            slow2 = slow2.next;
        }
        return true;

    }

    public ListNode reverse(ListNode head){
        if (head==null){
            return head;
        }
        ListNode pre = null;
        while (head!=null){
            ListNode node = head.next;
            head.next = pre;
            pre = head;
            head = node;
        }
        return pre;
    }

}
