package com.gj.exercise_1;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，并返回拷贝后的头结点。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
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
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead==null) return pHead;
        RandomListNode runner = pHead;
        RandomListNode copycat = null;
        while (runner!=null){
            copycat = new RandomListNode(runner.label);
            copycat.next = runner.next;
            runner.next = copycat;
            runner = copycat.next;
        }

        runner = pHead;
        while (runner!=null){
            copycat = runner.next;
            copycat.random = runner.random==null ? null : runner.random.next;
            runner = runner.next.next;
        }

        runner = pHead;
        pHead = runner.next;
        while (true){
            copycat = runner.next;
            runner.next = copycat.next;
            runner = copycat.next;
            if (runner==null){
                break;
            }else {
                copycat.next = runner.next;
            }
        }
        return pHead;

    }



}
