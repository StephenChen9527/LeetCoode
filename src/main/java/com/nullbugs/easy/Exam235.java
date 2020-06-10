package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Exam235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root.left==p && root.right==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        return null;
    }
}
