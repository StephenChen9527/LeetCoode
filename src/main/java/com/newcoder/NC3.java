package com.newcoder;

import com.nullbugs.util.ListNode;

/**
 * 对于一个给定的链表，返回环的入口节点，如果没有环，返回null
 * 拓展：
 * 你能给出不利用额外空间的解法么？
 */
public class NC3 {


    public ListNode detectCycle(ListNode head) {


        if(head == null){
            return head;
        }
        ListNode prev = head;
        ListNode next = head.next;
        while (next !=null && next.next != null){
            if(prev == next){
                return prev;
            }
            prev = prev.next;
            next = next.next.next;
        }
        return null;
    }

}
