package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam538 {


    public TreeNode convertBST(TreeNode root) {
        //root.val
        if(root==null){
            return null;
        }
        TreeNode left = convertBST(root.left);
        TreeNode right = convertBST(root.right);
        if(right!=null){
            root.val=root.val+right.val;
        }
        if(left!=null){
            left.val=left.val+root.val;
        }
        return root;
    }


}
