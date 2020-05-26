package com.nullbugs.interview;

import com.nullbugs.util.TreeNode;

public class Exam55_I {

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);
        return Integer.max(left,right);
    }
}
