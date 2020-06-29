package com.nullbugs.interview;

import com.nullbugs.util.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exam02_01 {

    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode h = head;
        ListNode next = head.next;
        Set<Integer> set = new HashSet<>();
        set.add(h.val);
        while (next!=null){
            if(set.contains(next.val)){
                //删除该节点
                h.next = next.next;
                next = h.next;
            }else {
                set.add(next.val);
                h = h.next;
                next = next.next;
            }

        }
        return head;
    }
}
