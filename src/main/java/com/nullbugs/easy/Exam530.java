package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam530 {

    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(2);
        int minimumDifference = getMinimumDifference(root);
        System.out.println(minimumDifference);
    }
    private static int min = Integer.MAX_VALUE;
    private static int rvalue = -1;
    public static int getMinimumDifference(TreeNode root) {
        if(root==null){
            return Integer.MAX_VALUE;
        }
        getMinimumDifference(root.left);
        if(rvalue!=-1){
            min = Math.min(Math.abs(rvalue-root.val),min);
        }
        rvalue=root.val;
        getMinimumDifference(root.right);
        return min;
    }
}
