package com.nullbugs.jianzhioffer;

import com.nullbugs.util.ListNode;
import com.utils.ListNodeUtils;

public class Exam22 {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtils.productList(1,2,3,4,5,6,7);
        ListNode kthFromEnd = getKthFromEnd(listNode, 3);
        ListNodeUtils.listNodePrint(kthFromEnd);
    }
    public static ListNode getKthFromEnd(ListNode head, int k) {

        if(head == null || k<1) {
            return null;
        }
        ListNode list = head;
        ListNode returnNode = head;
        while (list!=null){
            if(--k<0){
                returnNode = returnNode.next;
            }
            list = list.next;
        }


        return returnNode;

    }

}
