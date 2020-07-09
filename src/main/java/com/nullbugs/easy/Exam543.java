package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

public class Exam543 {
    public static void main(String[] args) {

    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = deep(root.left);
        int right = deep(root.right);
        return left+right;
    }
    public int deep(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = deep(root.left);
        int right = deep(root.right);
        return Integer.max(left,right)+1;
    }

}
