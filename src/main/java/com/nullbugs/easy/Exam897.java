package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;
import sun.reflect.generics.tree.Tree;

public class Exam897 {

    public static void main(String[] args) {
        TreeNode root= new TreeNode(5);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);
         root.left= new TreeNode(3);
         root.left.left= new TreeNode(2);
         root.left.right= new TreeNode(4);
         root.left.left.left= new TreeNode(1);
        increasingBST(root);
    }
    //后序遍历
    public static TreeNode increasingBST(TreeNode root) {
        fixLeft(root.left);
        fixRight(root.right);
        return null;
    }

    public static TreeNode fixLeft(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode left = increasingBST(root.left);
        if(left != null ){
            left.right=root;
            root.left=null;
            root=left;
        }
        TreeNode right =  increasingBST(root.right);
        root.right=right;
        return root;
    }
    public static TreeNode fixRight(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode right =  increasingBST(root.right);
        root.right=right;
        TreeNode left = increasingBST(root.left);
        if(left != null ){
            left.right=root;
            root.left=null;
            root=left;
        }
        return root;
    }

}
