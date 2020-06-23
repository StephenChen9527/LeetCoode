package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Exam872 {



    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<TreeNode> r1 = new LinkedList<>();
        List<TreeNode> r2 = new LinkedList<>();
        travel(root1,r1);
        travel(root2,r2);
        return check(r1,r2);
    }

    private boolean check(List<TreeNode> root1 ,List<TreeNode> root2){
        if(root1.size()!=root2.size()){
            return false;
        }
        for (int i = 0; i < root1.size(); i++) {
            if(root1.get(i).val!=root2.get(i).val){
                return false;
            }
        }
        return true;
    }
    public void travel(TreeNode root, List<TreeNode> list) {
        if(root==null){
            return;
        }
        travel(root.left,list);
        if(root.left==null && root.right == null){
            list.add(root);
        }
        travel(root.right,list);
    }
}
