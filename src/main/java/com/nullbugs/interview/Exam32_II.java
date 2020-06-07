package com.nullbugs.interview;

import com.nullbugs.util.TreeNode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class Exam32_II {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root!=null){
            ArrayDeque<TreeNode> deque = new ArrayDeque();
            deque.add(root);
            while (!deque.isEmpty()){
                int size = deque.size();
                List<Integer> l= new LinkedList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode temp = deque.removeLast();
                    l.add(temp.val);
                    if(temp.left!=null){
                        deque.addFirst(temp.left);
                    }
                    if(temp.right!=null){
                        deque.addFirst(temp.right);
                    }
                }
                list.add(l);
            }
        }
        return list;
    }
}
