package com.nullbugs.interview;

import com.nullbugs.util.ListNode;

public class Exam02_07 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode A= headA;
        ListNode B= headB;
        while (A!=B){
            A= A==null?headB:A.next;
            B= B==null?headA:B.next;
        }
        return A;


    }
}
