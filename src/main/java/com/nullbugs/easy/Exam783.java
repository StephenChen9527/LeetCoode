package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam783 {
    public static void main(String[] args) {

    }
    public int minDiffInBST(TreeNode root) {
        if(root==null){
            return 0;
        }
        minDiffInBST(root.left);
        minDiffInBST(root.right);

    }
}
