package com.gj2.exercise_3;

import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        ListNode node0 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        ListNode node = node0;
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }

        System.out.println("********************");

        ListNode node_2 = reverse(node0,2,5);
        while (node_2!=null){
            System.out.println(node_2.val);
            node_2 = node_2.next;
        }
    }

    public static ListNode reverse(ListNode root,int left,int right){
        if (root==null) return null;
        ListNode curleft = root,curright = root,preleft=null,nextright=null;
        for (int i = 0; i < left; i++) {
            preleft = curleft;
            curleft = curleft.next;
        }
        preleft.next = null;
        for (int i = 0; i < right; i++) {
            curright = curright.next;
        }
        nextright = curright.next;
        curright.next = null;
        curleft = reverse(curleft,curright);
        curright = curleft;
        for (int i = 1; i < right-left; i++) {
            curright = curright.next;
        }
        preleft.next = curleft;
        curright.next = nextright;
        return root;
    }

    public static ListNode reverse(ListNode root1,ListNode root2){
        if (root1==null || root1.next==null) return root1;
        ListNode pre = null;
        while (root1!=root2){
            ListNode node = root1.next;
            root1.next = pre;
            pre = root1;
            root1 = node;
        }
        root1.next = pre;
        return root1;
    }

}

class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
        this.val = val;
    }
}

