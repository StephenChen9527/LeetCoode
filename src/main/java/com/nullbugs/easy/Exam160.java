package com.nullbugs.easy;

import com.nullbugs.util.ListNode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exam160 {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA!=null){
            set.add(headA);
            headA = headA.next;
        }
        while (headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

}
