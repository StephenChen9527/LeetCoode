package com.nullbugs.easy;

import com.nullbugs.util.ListNode;

/**
 * Exam 237
 */
public class Exam237 {


    public void deleteNode(ListNode node) {
        while (true){
            node.val=node.next.val;
            if(node.next.next==null){
                node.next=null;
                break;
            }
            node=node.next;
        }

    }
}

