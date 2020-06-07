package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Exam257 {

    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);
        binaryTreePaths(root);
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        if(root==null){
            return list;
        }
        StringBuilder sb= new StringBuilder();

        travel(root,sb,list);
        return list;
    }

    public static void travel(TreeNode root, StringBuilder sb,List<String> list){
        sb.append(String.valueOf(root.val));
        if(root.left==null && root.right==null){
            list.add(sb.toString());
        }
        if(root.left!=null){
            travel(root.left,new StringBuilder(sb).append("->"),list);
        }
        if(root.right!=null){
            travel(root.right,new StringBuilder(sb).append("->"),list);
        }
    }

}
