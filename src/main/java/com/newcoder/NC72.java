package com.newcoder;

import com.nullbugs.util.TreeNode;

public class NC72 {

    public void Mirror(TreeNode root) {
        if(root==null) return;

        TreeNode right = root.left;
        TreeNode left = root.right;
        Mirror(right);
        Mirror(left);
        root.left=left;
        root.right=right;

    }

}
