package com.nullbugs.interview;

import com.nullbugs.util.TreeNode;

public class Exam17_12 {

    public TreeNode convertBiNode(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode right = convertBiNode(root.right);
        TreeNode left = convertBiNode(root.left);
        return  null;
    }
}
