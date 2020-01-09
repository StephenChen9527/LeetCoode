package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam965 {

    public static void main(String[] args) {
        TreeNode t=new TreeNode(1);
        t.left=new TreeNode(1);
        t.right=new TreeNode(1);
        t.left.left=new TreeNode(2);
        t.left.right=new TreeNode(1);
        System.out.println(isUnivalTree(t));
    }

    public static boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean b=true;
        if(root.left!=null){
            b=root.val==root.left.val;
        }
        if(root.right!=null){
            b=b&root.val==root.right.val;
        }
        return b && isUnivalTree(root.left) &&isUnivalTree(root.right);
    }
}
