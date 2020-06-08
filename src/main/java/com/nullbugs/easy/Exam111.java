package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

import java.util.ArrayDeque;

public class Exam111 {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(5);
        root.right = new TreeNode(5);
        /*root.right.right = new TreeNode(5);

        root.left = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);*/
        //System.out.println(minDepth(root));
    }
    /*public static int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int minDepth = 0;
        ArrayDeque<TreeNode> deque = new ArrayDeque();
        deque.push(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            minDepth++;
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = deque.pollLast();
                if(treeNode.left != null ){
                    deque.push(treeNode.left);
                }
                if(treeNode.right != null ){
                    deque.push(treeNode.right);
                }
                if(treeNode.left==null && treeNode.right==null){
                    return minDepth;
                }
            }
        }
        return minDepth;
    }*/

    /*public static int minDepth(TreeNode root) {
        return minDepth(root,1);
    }

    public static int minDepth(TreeNode root,int min){
        if(root==null){
            return min-1;
        }
        if(root.left==null && root.right==null){
            return min;
        }
        int left = minDepth(root.left,min+1);
        int right = minDepth(root.right,min+1);
        if(root.left==null){
            return right;
        }
        if(root.right==null){
            return left;
        }
        return Integer.min(left,right);
    }*/


    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if ((root.left == null) && (root.right == null)) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDepth(root.right), min_depth);
        }

        return min_depth + 1;
    }

}
