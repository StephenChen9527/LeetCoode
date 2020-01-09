package com.nullbugs.easy;

import com.nullbugs.util.ListNode;

public class Exam206 {



    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode prev=head;
        head = head.next;
        prev.next=null;
        while (head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }




}
