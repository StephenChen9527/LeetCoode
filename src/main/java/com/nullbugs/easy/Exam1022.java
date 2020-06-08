package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Exam1022 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        System.out.println(sumRootToLeaf(root));
    }
    public static int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root,"");
    }

    public static int  sumRootToLeaf(TreeNode root, String path){
        if(root==null){
            return 0;
        }
        int sum = 0;
        path+=root.val;
        if(root.left!=null){
           sum+=sumRootToLeaf(root.left,path);
        }
        if(root.right!=null){
            sum+=sumRootToLeaf(root.right,path);
        }
        if(root.left==null && root.right==null){
            sum+=Integer.valueOf(path,2);
        }
        return sum;
    }
}
