package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam100 {
    //什么时候返回false
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //返回true
        if((q==null && p==null) || (q==p)){
            return true;
        }
        if((p!=null && q!=null && p.val==q.val)){
            return isSameTree(p.right, q.right)&&isSameTree(p.left, q.left);
        }
        return false;

    }
}
