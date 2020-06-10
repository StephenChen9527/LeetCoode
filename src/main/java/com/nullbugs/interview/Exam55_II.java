package com.nullbugs.interview;

import com.nullbugs.util.TreeNode;

import java.util.ArrayDeque;
import java.util.Map;

public class Exam55_II {


    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int level = 0;
        int min = 0;
        int max = 0;
        ArrayDeque<TreeNode> deque = new ArrayDeque();
        deque.push(root);
        while (!deque.isEmpty()){
            level++;
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = deque.pollLast();
                if (treeNode.right==null && treeNode.left==null){
                    min = Math.min(min,level);
                    max = Math.max(max,level);
                }
                if(treeNode.left!=null){
                    deque.push(treeNode.left);
                }
                if(treeNode.right!=null){
                    deque.push(treeNode.right);
                }
            }
            if(max-min>1){
                return false;
            }
        }

        return true;
    }
}
