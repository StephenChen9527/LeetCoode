package com.nullbugs.easy;

import com.nullbugs.util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Exam83 {

    public static void main(String[] args) {

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode nHead = head;
        while (nHead!=null && nHead.next!=null){
            if(nHead.val == nHead.next.val){
                nHead.next = nHead.next.next;
            }else{
                nHead = nHead.next;
            }
        }
        return head;
    }
}
