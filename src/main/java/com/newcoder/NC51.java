package com.newcoder;

import com.nullbugs.util.ListNode;
import com.utils.ListNodeUtils;
import javafx.scene.shape.Circle;

import java.util.ArrayList;

public class NC51 {


    public static void main(String[] args) {
        ArrayList<ListNode> lists = new ArrayList<>();
        lists.add(ListNodeUtils.productList(1,6,600000));
        lists.add(ListNodeUtils.productList(2,7,12,17,22));
        lists.add(ListNodeUtils.productList(3,8,13,18,23));
        lists.add(ListNodeUtils.productList(4,9,14,19,24));
        lists.add(ListNodeUtils.productList(5,10,15,20,25));
        ListNode listNode = mergeKLists(lists);
        ListNodeUtils.listNodePrint(listNode);
    }

    public static ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists.isEmpty() ){
            return null;
        }
        ListNode head = new ListNode(Integer.MIN_VALUE);
        head.next = lists.get(0);
        for (int i = 1; i < lists.size(); i++) {
            ListNode node = lists.get(i);
            ListNode cur = head;
            while (node!=null && cur!=null && cur.next!=null){
                if(node.val<cur.next.val){
                    ListNode nodeC = node.next;
                    node.next = cur.next;
                    cur.next = node;
                    node = nodeC;
                }else{
                    cur = cur.next;
                }
            }
            //cur 必然不等于null
            //如果是因为 node 先循环完毕， 那么 node 链表以后的值 都比 cur当前的大
            if(node!=null){
                cur.next=node;
            }

        }

        return head.next;
    }

}
