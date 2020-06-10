package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam669 {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null){
            return null;
        }

        TreeNode left = trimBST(root.left, L, R);
        TreeNode right = trimBST(root.right, L, R);
        if(root.val<L || root.val>R){
            return null;
        }

        return root;
    }
}
