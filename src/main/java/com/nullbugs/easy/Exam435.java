package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam435 {

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=1+maxDepth(root.left);
        int right=1+maxDepth(root.right);
        return left>right?left:right;
    }
}
