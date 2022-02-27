package com.gj.Exercise_7;

import java.util.ArrayList;

public class Exercise_34 {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists==null || lists.size()==0) return null;
        ListNode root= lists.get(0);
        for (int i = 1; i < lists.size(); i++) {
            root = merge2Lists(root,lists.get(i));
        }
        return root;
    }
    public ListNode merge2Lists(ListNode root1,ListNode root2){
        if (root1==null) return root2;
        if (root2==null) return root1;
        ListNode phead = new ListNode(0);
        ListNode p = phead;
        while (root1!=null && root2!=null){
            if (root1.val<root2.val){
                p.next = root1;
                root1 = root1.next;
            }else {
                p.next = root2;
                root2 = root2.next;
            }
            p = p.next;
        }
        p.next = (root1==null)?root2:root1;
        return phead.next;
    }
}
