package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayDeque;

public class Exam897 {

    public static void main(String[] args) {

    }
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return null;
        }


        TreeNode right = increasingBST(root.right);
        System.out.println(root.val);
        TreeNode left = increasingBST(root.left);

        ArrayDeque<TreeNode> stack = new ArrayDeque();
        /*while (true){

        }*/


        return null;
    }
    public TreeNode increasingBST(TreeNode root,TreeNode fixRoot){
        return null;
    }

}
