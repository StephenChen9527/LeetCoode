package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayDeque;

public class Exam897 {


    TreeNode r = null;
    TreeNode m = null;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return null;
        }
        m=root;
        increasingBST(root.right);
        if(r!=null){
            root.right=r;
        }
        r=root;
        TreeNode left = root.left;
        root.left=null;


        return root;
    }

}
