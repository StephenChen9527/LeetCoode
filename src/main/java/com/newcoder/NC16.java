package com.newcoder;

import com.nullbugs.util.TreeNode;

public class NC16 {

    public boolean isSymmetric (TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric (TreeNode left,TreeNode right) {
        if(left == null && right == null){
            return true;
        }
        if(left!=null && right!=null){
            return (left.val == right.val)&isSymmetric(left.left,right.right)&isSymmetric(left.right,right.left);
        }
        return false;

    }


}
