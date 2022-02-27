package com.gj.exercise_2;

/**
 *
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，并返回拷贝后的头结点。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 */


class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}


public class Exercise_25 {

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead==null){
            return pHead;
        }
        RandomListNode runNode = pHead;
        RandomListNode copy = null;

        while (runNode!=null){
            copy = new RandomListNode(runNode.label);
            copy.next = runNode.next;
            runNode.next = copy;
            runNode = copy.next;
        }

        runNode = pHead;
        while (runNode!=null){
            copy = runNode.next;
            copy.random = runNode.random==null ? null : runNode.random.next;
            runNode = runNode.next.next;
        }

        runNode = pHead;
        pHead = runNode.next;
        while (runNode!=null){
            copy = runNode.next;
            runNode.next = copy.next;
            copy.next = copy.next==null?null:runNode.next.next;
            runNode = runNode.next;
        }
        return pHead;

    }
}
