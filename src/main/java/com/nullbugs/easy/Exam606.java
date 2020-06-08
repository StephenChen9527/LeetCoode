package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam606 {


    public String tree2str(TreeNode t) {
        if(t==null){
            return "";
        }
        String str = String.valueOf(t.val);
        if(t.left!=null || t.right!=null){
            str +="(";
            str+=tree2str(t.left);
            str+=")";
        }
        if(t.right!=null){
            str +="(";
            str+=tree2str(t.right);
            str+=")";
        }
        return str;
    }
}
