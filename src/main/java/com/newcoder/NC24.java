package com.newcoder;

import com.nullbugs.util.ListNode;
import com.utils.ListNodeUtils;

import javax.swing.text.html.HTMLEditorKit;
import java.util.HashSet;
import java.util.Set;

public class NC24 {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtils.productList(1,1,1);
        //ListNodeUtils.listNodePrint((deleteDuplicates(listNode)));
    }

    /*public static ListNode deleteDuplicates (ListNode head) {
        if(head == null ){
            return head;
        }
        //头结点重复
        while (head!=null){
            if(head.next==null || head.next.val != head.val) {
                break;
            }
            //处理头结点重复。
            while (head.next!=null && head.next.val == head.val){
                head.next = head.next.next;
            }
            head = head.next;
        }

        //里面节点重复
        ListNode next = head.next;
        ListNode cur = head;
        while (next!=null){
            boolean deleted = false;
            //处理头结点重复。
            while (next.next!=null && next.next.val == next.val){
                next.next = next.next.next;
                deleted = true;
            }
            if(!deleted){
                cur.next = next;
                cur= cur.next;
            }else{
                cur.next = next.next;
            }
            next = next.next;

        }

        return head;
    }*/

    /*public static ListNode deleteDuplicates (ListNode head) {
        if(head == null){
            return head;
        }
        ListNode node =new ListNode(Integer.MIN_VALUE);
        node.next = head;
        ListNode cur = node;
        ListNode next = node.next;
        boolean DoDelete = false;
        while (cur !=null && cur.next!=null){
            if( next.next!= null  && cur.next.val == next.next.val){
                next = next.next;
                DoDelete = true;
            }else{
                if(DoDelete){
                    cur.next = next.next;
                    DoDelete = false;
                }else{
                    cur.next = next;
                    cur = cur.next;
                }
                next = next.next;
            }
        }
        return node.next;
    }*/


}
