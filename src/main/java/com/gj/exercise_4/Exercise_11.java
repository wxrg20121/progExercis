package com.gj.exercise_4;

public class Exercise_11 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode listNode = reverseGroup(listNode1,2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode reverseGroup(ListNode head,int k){
        if (head==null || head.next==null || k<=1){
            return head;
        }
        ListNode cur = head;
        for (int count = 1; count < k; count++) {
            cur = cur.next;
            if (cur==null){
                return head;
            }
        }
        ListNode next = cur.next;
        reverse(head,cur);
        head.next = reverseGroup(next,k);
        return cur;
    }

    public static ListNode reverse(ListNode head,ListNode tail){

        if (head==null || head.next==null){
            return head;
        }
        ListNode pre = null;
        while (head!=tail){
            ListNode node = head.next;
            head.next = pre;
            pre = head;
            head = node;
        }
        head.next = pre;
        return head;
    }
}
