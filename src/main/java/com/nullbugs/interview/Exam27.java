package com.nullbugs.interview;

import com.nullbugs.util.TreeNode;

public class Exam27 {

    public TreeNode mirrorTree(TreeNode root) {
        if(root!=null){
            TreeNode right = root.right;
            root.right= root.left;
            root.left=right;
            mirrorTree(root.right);
            mirrorTree(root.left);
        }

        return root;
    }
}
