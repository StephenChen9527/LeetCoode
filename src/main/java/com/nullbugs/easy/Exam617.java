package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode root =null;
        if(t1!=null && t2!=null){
            root = new TreeNode(t1.val+t2.val);
        }else if(t1!=null ){
            root = t1;
        }else if(t2!=null){
            root = t2;
        }
        if(root!=null){
            root.left=mergeTrees(t1==null?null:t1.left,t2==null?null:t2.left);
            root.right=mergeTrees(t1==null?null:t1.right,t2==null?null:t2.right);
        }
        return root;
    }
}
