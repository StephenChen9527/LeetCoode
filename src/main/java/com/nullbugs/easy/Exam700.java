package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam700 {


    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node=null;
        if(root!=null){
            if(root.val==val){
                return root;
            }
            if(val<root.val){
                // 查找左子树
                node=searchBST(root.left,val);
            }else{
                // 查找右子树
                node=searchBST(root.right,val);
            }
        }
        return node;

    }

}
