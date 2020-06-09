package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam538 {

    public static void main(String[] args) {
        //[1,0,4,-2,null,3]
        TreeNode root = new TreeNode(1);
        root.left =new TreeNode(0);
        root.left.left =new TreeNode(-2);
        root.right =new TreeNode(4);
        root.right.left =new TreeNode(3);
    }
    private int sum = 0;
    public  TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;

    }

}
