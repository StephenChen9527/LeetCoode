package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam897 {

    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left=increasingBST(root.left);

        return null;
    }
}
