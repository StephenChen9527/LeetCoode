package com.nullbugs.easy;

import com.nullbugs.util.ListNode;

import java.util.List;

public class Exam2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        boolean b=false;
        ListNode last=head;
        while (l1!=null || l2!=null || b){
            int t=0;
            if(l1!=null){
                t+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                t+=l2.val;
                l2=l2.next;
            }
            if(b){
                t++;
                b=false;
            }
            if(t>9){
                t%=10;
                b=true;
            }
            last.next=new ListNode(t);
            last=last.next;


        }

        return head.next;
    }
}
