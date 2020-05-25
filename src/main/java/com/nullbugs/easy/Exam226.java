package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam226 {

    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            TreeNode left = root.left;
            root.left=root.right;
            root.right=left;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
